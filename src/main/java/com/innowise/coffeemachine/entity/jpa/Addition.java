package com.innowise.coffeemachine.entity.jpa;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(
        name = "addition",
        schema = "public"
)
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Addition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private BigDecimal price;

}
