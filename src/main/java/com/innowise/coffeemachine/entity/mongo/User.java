package com.innowise.coffeemachine.entity.mongo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    private String id;
    private String name;
    private int age;
}
