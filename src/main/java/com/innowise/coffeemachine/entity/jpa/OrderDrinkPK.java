package com.innowise.coffeemachine.entity.jpa;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class OrderDrinkPK implements Serializable {

    private static final long serialVersionUID = 5243379467442949036L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "drink_id")
    private Drink drink;

}
