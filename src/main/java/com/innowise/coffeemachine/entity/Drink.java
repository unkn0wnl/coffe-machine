package com.innowise.coffeemachine.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "drink",
        schema = "public"
)
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private BigDecimal price;

    private Integer servingNumber;

    @ManyToOne
    @JoinColumn(name = "drink_size_id")
    private DrinkSize drinkSize;

    @ManyToMany
    @JoinTable(name = "drink_additions",
            joinColumns = @JoinColumn(name = "drink"),
            inverseJoinColumns = @JoinColumn(name = "addition"))
    private List<Addition> additionList;

    {
        additionList = new ArrayList<>();
    }

}
