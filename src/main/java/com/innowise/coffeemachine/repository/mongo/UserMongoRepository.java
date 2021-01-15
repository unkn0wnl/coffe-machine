package com.innowise.coffeemachine.repository.mongo;

import com.innowise.coffeemachine.entity.mongo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "mongo_user")
public interface UserMongoRepository extends MongoRepository<User, String> {

}
