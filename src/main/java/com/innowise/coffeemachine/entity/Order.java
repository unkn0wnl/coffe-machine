package com.innowise.coffeemachine.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(
        name = "user_order",
        schema = "public"
)
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate creationDate;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
