package com.iqmsoft.boot.react.jpa.companies.acceptance.rest.steps;

import static com.iqmsoft.boot.react.jpa.companies.acceptance.support.ScenarioContext.getResponseFromContext;
import static com.iqmsoft.boot.react.jpa.companies.acceptance.support.ScenarioContext.saveResponseInContext;
import static com.iqmsoft.boot.react.jpa.companies.acceptance.support.Server.getBaseUri;
import static com.jayway.restassured.RestAssured.given;

import java.util.List;

import com.iqmsoft.boot.react.jpa.companies.acceptance.support.HamcrestUtil;
import com.iqmsoft.boot.react.jpa.companies.acceptance.support.ParameterExpression;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateCompanySteps {

  @When("^I make a PUT request to '(.*)' with content-type '(.*)' and payload:$")
  public void createCompany(ParameterExpression path, String contentType, String payload) throws Throwable {
    saveResponseInContext(
      given()
        .contentType(contentType)
        .body(payload)
      .when()
        .put(getBaseUri() + path.getValue())
        .andReturn());
  }

  @Then("the response body does not contain (?:this|these) (?:field|fields)")
  public static void checkBodyDoesNotContain(List<String> notExpectedFields) {
    getResponseFromContext().then()
      .body("$", HamcrestUtil.notAnyKey(notExpectedFields));
  }

}
