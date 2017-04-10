package com.iqmsoft.boot.react.jpa.companies.rest;

import java.util.List;

import com.iqmsoft.boot.react.jpa.companies.app.Company;

public class CompanyListResponse {
  private List<Company> companies;

  public CompanyListResponse(List<Company> companies) {
    this.companies = companies;
  }

  public List<Company> getCompanies() {
    return companies;
  }
}
