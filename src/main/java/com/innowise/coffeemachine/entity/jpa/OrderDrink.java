package com.innowise.coffeemachine.entity.jpa;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(
        name = "order_drink",
        schema = "public"
)
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class OrderDrink {

    @EmbeddedId
    private OrderDrinkPK pk;

    @Column(nullable = false)
    private Integer quantity;

}
