package com.innowise.coffeemachine.repository.mongo;

import com.innowise.coffeemachine.entity.mongo.CardAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardAccountMongoRepository extends MongoRepository<CardAccount, String> {

}
