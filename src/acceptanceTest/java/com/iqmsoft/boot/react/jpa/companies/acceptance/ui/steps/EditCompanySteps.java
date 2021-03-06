package com.iqmsoft.boot.react.jpa.companies.acceptance.ui.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.iqmsoft.boot.react.jpa.companies.acceptance.ui.elements.FormElement;
import com.iqmsoft.boot.react.jpa.companies.acceptance.ui.elements.HomePage;
import com.iqmsoft.boot.react.jpa.companies.acceptance.ui.elements.CompanyListElement.CompanyListRow;

import cucumber.api.java.en.When;

public class EditCompanySteps {

  private HomePage homePage = new HomePage();

  @When("user clicks on Edit Button in row (\\d+) button")
  public void clickEditButtonOnRow(Integer rowPlusOne) {
    int rowIndex = rowPlusOne - 1;

    List<CompanyListRow> rows = homePage.getCompanyList().getRows();
    rows.get(rowIndex).getEditButton().click();
  }

  @When("company form is already pre-filled with this information:")
  public void checkFormIsPreFilled(Map<String, String> companyToEdit) {
    FormElement form = homePage.getCompanyForm().get();
    for (Entry<String, String> fieldAndText : companyToEdit.entrySet()) {
      String text = form.get(fieldAndText.getKey()).getText();

      assertThat(text, is(fieldAndText.getValue()));
    }
  }
}
