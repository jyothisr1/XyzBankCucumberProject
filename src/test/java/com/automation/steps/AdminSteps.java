package com.automation.steps;
import com.automation.pages.AdminPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AdminSteps {
    AdminPage adminPage=new AdminPage();
    @Then("verify bank manager is on admin page")
    public void verify_bank_manager_is_on_admin_page() {
        adminPage.isAdminPageDisplayed();
    }

    @When("bank manager click on add customer")
    public void bank_manager_click_on_add_customer() {
        adminPage.selectAddCustomer();
    }

    @When("enters all the details of customer")
    public void enters_all_the_details_of_customer() {
        adminPage.enterDetailsOfCustomers();
    }

    @And("click on add customer")
    public void click_on_add_customer() {
        adminPage.clickOnAddCustomer();
    }

    @Then("verify success message is displayed")
    public void verify_success_message_is_displayed(String message) {
        Assert.assertTrue(adminPage.verifySuccessMessage(message));
    }
    @When("bank manager click on open account")
    public void bank_manager_click_on_open_account() {
        adminPage.clickOnOpenAccount();
    }

    @When("select customer name")
    public void select_customer_name() {
        adminPage.selectCustomerName();
    }

    @When("select currency")
    public void select_currency() {
        adminPage.selectCustomerCurrency();
    }

    @When("click on process button")
    public void click_on_process_button() {
        adminPage.clickOnProcessButton();
    }
}
