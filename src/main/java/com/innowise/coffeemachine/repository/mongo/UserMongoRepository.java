package com.innowise.coffeemachine.repository.mongo;

import com.innowise.coffeemachine.entity.mongo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends MongoRepository<User, String> {

}
