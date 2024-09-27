package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends BasePage{

    @FindBy(xpath = "//button[contains(text(), 'Add Customer')]")
    WebElement addCustomer;

    @FindBy(xpath = "//label[text()='First Name :']/following::input")
    WebElement firstNameInput;

    @FindBy(xpath = "//label[text()='Last Name :']/following::input")
    WebElement lastNameInput;

    @FindBy(xpath = "//label[text()='Post Code :']/following::input")
    WebElement postCodeInput;

    @FindBy(css = "button[type='submit']")
    WebElement addCustomerButton;

    @FindBy(xpath = "//button[contains(text(), 'Add Customer')]/following::button")
    WebElement openAccount;

    @FindBy(id = "userSelect")
    WebElement selectCustomerName;

    @FindBy(id = "currency")
    WebElement selectCustomerCurrency;

    @FindBy(css = "button[type='submit']")
    WebElement processButton;

    public void isAdminPageDisplayed() {
    }

    public void selectAddCustomer() {
        addCustomer.click();
    }

    public void enterDetailsOfCustomers() {
        firstNameInput.sendKeys(ConfigReader.getConfigValue("firstname.name"));
        lastNameInput.sendKeys(ConfigReader.getConfigValue("lastname.name"));
        postCodeInput.sendKeys(ConfigReader.getConfigValue("postcode.code"));
    }

    public void clickOnAddCustomer() {
        addCustomerButton.click();
    }

    public boolean verifySuccessMessage(String message) {
        Alert alert=driver.switchTo().alert();
        Boolean check=alert.getText().contains(message);
        alert.accept();
        return check;
    }

    public void clickOnOpenAccount() {
        openAccount.click();
    }

    public void selectCustomerName() {
        Select name=new Select(selectCustomerName);
        name.selectByVisibleText(ConfigReader.getConfigValue("firstname.name")+" "+ConfigReader.getConfigValue("lastname.name"));
    }

    public void selectCustomerCurrency() {
        Select currency=new Select(selectCustomerCurrency);
        currency.selectByIndex(1);
    }

    public void clickOnProcessButton() {
        processButton.click();
    }
}
