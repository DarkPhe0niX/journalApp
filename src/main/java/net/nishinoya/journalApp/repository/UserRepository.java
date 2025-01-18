package net.nishinoya.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import net.nishinoya.journalApp.entity.User;

public interface UserRepository extends MongoRepository<User,ObjectId>{
    User findByUsername(String username);
    void deleteByUsername(String username);
}