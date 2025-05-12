package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dao.SubscriptionDataRepository;
import org.example.dao.SubscriptionRepository;
import org.example.dao.UserRepository;
import org.example.dto.Subscription;
import org.example.dto.SubscriptionData;
import org.example.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;


@RestController
@RequiredArgsConstructor
@Slf4j
public class SubscriptionDataController {

    private final SubscriptionDataRepository subscriptionDataRepository;
    private final UserRepository userRepository;
    private final SubscriptionRepository subscriptionRepository;
    private final SubscriptionService subscriptionService;

    @PostMapping("/users/{id}/subscriptions")
    public String postUserSubscription(@PathVariable(name = "id") int user_id, @RequestBody SubscriptionData subscriptionData) {
        SubscriptionData line = new SubscriptionData();
        line.setData(new Date());
        line.setDeadline(Date.from(Instant.now().plus(30, ChronoUnit.DAYS)));
        line.setUserId(user_id);
        line.setSubId(subscriptionData.getSubId());
        line.setId(null);
        subscriptionDataRepository.save(line);
        Integer sub_id = subscriptionData.getSubId();
        Subscription name_sub = subscriptionRepository.getReferenceById(sub_id);
        return "Пользователь " + userRepository.getReferenceById(user_id) + "успешно подписан на " + name_sub;
    }

    @GetMapping("/users/{id}/subscriptions")
    public String getUserSubscriptions(@PathVariable int id) {
        List<SubscriptionData> list =subscriptionDataRepository.findAllByUserId(id);
        String temp = "";
        for (int n = 0; n < list.size(); n++) {
            Subscription serviceName = subscriptionService.getSubscription(list.get(n).getSubId());
            temp += serviceName.getSubname() + list.get(n).getData() + "\n";
        }
        return userRepository.getReferenceById(id) + "подписан на " + "\n" + temp;
    }

    @DeleteMapping("/users/{id}/subscriptions/{sub_id}")
    public String deleteSubscriptions (@PathVariable int id, @PathVariable int sub_id) {
        SubscriptionData subForDeletion = subscriptionDataRepository.findFirstByUserIdAndSubId(id, sub_id);
        subscriptionDataRepository.delete(subForDeletion);
        return "Подписка удалена";
    }

    @GetMapping("/subscriptions/top")
    public String getTopSubscription() {
        List<Integer> topThree = subscriptionDataRepository.findTop();
        String temp = "";
        for (Integer elem : topThree) {
            temp += subscriptionService.getSubscription(elem)+ "\n";
        }
        return "Топ-3 популярных подписок: " + "\n" + temp;
    }
}
