package com.iqmsoft.boot.react.jpa.companies.main;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Profile("jpa")
@EnableJpaRepositories(basePackages = {"com.iqmsoft.boot.react.jpa.companies.db.jpa"})
@EntityScan(basePackages = {"com.iqmsoft.boot.react.jpa.companies.db.jpa"})
public class JPAConfiguration {
}
