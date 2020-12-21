package com.example.productmngmt.repo;


import com.example.productmngmt.entity.Users;
import com.example.productmngmt.template.UserRepositoryTemplate;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<Users, String>,UserRepositoryTemplate{
	
	Users findByEmail(String email);
	Users findByFirstName(String name);

}
