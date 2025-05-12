package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dao.SubscriptionRepository;
import org.example.dto.Subscription;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public void saveSubscription(Subscription subscription) {
        subscriptionRepository.save(subscription);
    }

    public Subscription getSubscription(Integer subId) {
        if (subscriptionRepository.existsById(subId)) {
            return subscriptionRepository.getReferenceById(subId);
        }
        return null;
    }

    public void deleteSubscription(Integer subId) {
        subscriptionRepository.deleteAllById(List.of(subId));
    }
}
