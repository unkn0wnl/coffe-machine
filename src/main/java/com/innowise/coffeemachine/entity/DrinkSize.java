package com.innowise.coffeemachine.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(
        name = "drink_size",
        schema = "public"
)
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DrinkSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private CupSize cupSize;

}
