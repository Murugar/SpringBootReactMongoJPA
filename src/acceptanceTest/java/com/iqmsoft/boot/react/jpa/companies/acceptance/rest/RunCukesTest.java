package com.iqmsoft.boot.react.jpa.companies.acceptance.rest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  plugin = {"pretty", "html:build/reports/acceptanceTest/rest"},
  strict = true,
  features = "src/acceptanceTest/resources/features/rest",
  glue = {"com.iqmsoft.boot.react.jpa.companies.acceptance.rest.steps",
		  "com.iqmsoft.boot.react.jpa.companies.acceptance.common.steps"}
)
public class RunCukesTest {
}