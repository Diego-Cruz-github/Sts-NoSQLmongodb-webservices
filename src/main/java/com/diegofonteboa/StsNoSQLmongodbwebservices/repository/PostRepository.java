package com.diegofonteboa.StsNoSQLmongodbwebservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.diegofonteboa.StsNoSQLmongodbwebservices.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
