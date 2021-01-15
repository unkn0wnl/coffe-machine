package com.innowise.coffeemachine.entity.jpa;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(
        name = "user_entity",
        schema = "public",
        uniqueConstraints = @UniqueConstraint(columnNames = "email")
)
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;

    @NaturalId
    private String email;
    private String password;
    private boolean activity;

    @OneToMany(mappedBy = "user")
    private List<CardAccount> cardAccount;

    @OneToMany(mappedBy = "user")
    private List<Order> orderDrink;

    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> userRoles;

    {
        cardAccount = new ArrayList<>();
        orderDrink = new ArrayList<>();
        userRoles = new HashSet<>();
    }

}