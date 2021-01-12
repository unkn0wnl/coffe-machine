package com.innowise.coffeemachine.entity;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "role", schema = "public")
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    private UserRole roleName;

}
