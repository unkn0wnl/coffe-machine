package com.innowise.coffeemachine.entity;

import java.util.Set;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean activity;
    private CardAccount cardAccount;
    private Set<Role> roles;

}
