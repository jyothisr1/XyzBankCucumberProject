package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSteps{
    HomePage homePage=new HomePage();
    @Given("bank manager opens the website")
    public void bank_manager_opens_the_website() {
        homePage.openWebsite();
    }
    @Then("verify bank manager is on homepage")
    public void verify_bank_manager_is_on_homepage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }
    @When("bank manager click on bank manager login")
    public void bank_manager_click_on_bank_manager_login() {
        homePage.selectBankManagerLogin();
    }
}
