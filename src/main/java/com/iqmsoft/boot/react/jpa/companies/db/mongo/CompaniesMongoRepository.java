package com.iqmsoft.boot.react.jpa.companies.db.mongo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

@Profile("mongo")
public interface CompaniesMongoRepository extends MongoRepository<CompanyMongoImpl, String> {
}
