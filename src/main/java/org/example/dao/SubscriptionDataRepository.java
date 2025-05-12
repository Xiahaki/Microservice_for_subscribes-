package org.example.dao;

import org.example.dto.SubscriptionData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubscriptionDataRepository extends JpaRepository<SubscriptionData, Integer>{
    List<SubscriptionData> findAllByUserId(Integer userId);
    SubscriptionData findFirstByUserIdAndSubId(int userId, int subId);

    @Query(nativeQuery = true, value = "select sub_id from subsdata group by sub_id order by count(id) desc limit 3")
    List<Integer> findTop();
}
