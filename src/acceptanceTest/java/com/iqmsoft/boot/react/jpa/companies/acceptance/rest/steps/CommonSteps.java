package com.iqmsoft.boot.react.jpa.companies.acceptance.rest.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.iqmsoft.boot.react.jpa.companies.acceptance.support.DBClient;
import com.iqmsoft.boot.react.jpa.companies.acceptance.support.ScenarioContext;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps{

  @Then("response status is (\\d+)")
  public void checkStatus(Integer status) {
    assertThat(ScenarioContext.getResponseFromContext().statusCode(), is(status));
  }

}
