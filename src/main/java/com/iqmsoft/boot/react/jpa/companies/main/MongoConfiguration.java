package com.iqmsoft.boot.react.jpa.companies.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@Profile("mongo")
@EnableMongoRepositories(basePackages = {"com.iqmsoft.boot.react.jpa.companies.db.mongo"})
public class MongoConfiguration {
}
