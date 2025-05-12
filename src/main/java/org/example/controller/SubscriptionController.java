package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Subscription;
import org.example.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @PostMapping("/subscription")
    public String createSubscription (@RequestBody Subscription subscription) {
        subscription.setId(null);
        subscriptionService.saveSubscription(subscription);
        return "В базу добавлена подписка " + subscription.getSubname();
    }

    @GetMapping("/subscription/{sub_id}")
    public String getSubscription (@PathVariable int id) {
        return subscriptionService.getSubscription(id).toString();
    }

    @DeleteMapping("/subscription/{sub_id}")
    public String deleteSubscription (@PathVariable int id) {
        return "Подписка удалена из базы";
    }

}
