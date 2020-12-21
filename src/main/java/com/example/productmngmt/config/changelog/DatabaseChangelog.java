package com.example.productmngmt.config.changelog;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.example.productmngmt.entity.Roles;
import com.example.productmngmt.entity.Users;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

//@ChangeLog
public class DatabaseChangelog {

	@Transactional
//	@ChangeSet(order = "001",id = "defaultUser",author = "System")
	public void addUserData(MongoDatabase db) {
		MongoCollection<Document> mongoCollection = db.getCollection("users");
		Document document = new Document();
		document.append("uuid", 1l);
		document.append("firstName", "default");
		document.append("lastName", "user");
		document.append("email", "du@du.com");
		document.append("phoneNumber", "8855447711");
		document.append("address", "system");
		document.append("password", "$2a$10$Q6tqvXldZxoy1HADOZfVqesfnTXZ68DDkL1UAyRmCBnQFTbofC1Ha");
		document.append("roles", new ArrayList<>(List.of(new Roles("ROLE_ADMIN"))));
		
		mongoCollection.insertOne(document);
		
//		Users user = new Users();
//		user.setUuid(1l);
//		user.setFirstName("default");
//		user.setLastName("user");
//		user.setEmail("du@du.com");
//		user.setAddress("system");
//		user.setPassword("admin");
//		user.setPhoneNumber("8844557711");
//		user.setRoles(new ArrayList<>(List.of(new Roles("ROLE_ADMIN"))));
		
	}

}
