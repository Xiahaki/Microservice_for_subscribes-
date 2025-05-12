package org.example.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "subsdata")
@Entity
@ToString
@Getter

public class SubscriptionData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "data")
    private Date data;
    @Column(name = "deadline")
    private Date deadline;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "sub_id")
    private int subId;
}
