package com.innowise.coffeemachine.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(
        name = "card_account",
        schema = "public"
)
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CardAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
