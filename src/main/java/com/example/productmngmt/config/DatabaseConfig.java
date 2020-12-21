package com.example.productmngmt.config;

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//import com.mongodb.MongoClient;


@Configuration
//@Import(MongoAutoConfiguration.class)
@EnableMongoAuditing(auditorAwareRef = "customAuditAware")
public class DatabaseConfig {


//     @Bean
//     public MongoTemplate mongoTemplate(){
//         return new MongoTemplate();
//     }
	
//	@Bean
//	public Mongobee mongobee() {
//        Mongobee mongobee = new Mongobee("mongodb://localhost:27017/ProductManagment");
//        mongobee.setDbName("ProductManagment");
//        mongobee.setChangeLogsScanPackage("com.example.productmngmt.config.changelog");
//        mongobee.setEnabled(true);
//        return mongobee;
//    }

	
}