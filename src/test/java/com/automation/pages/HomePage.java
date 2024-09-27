package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    WebElement bankManagerLoginButton;

    @FindBy(xpath = "//button[text()='Home']")
    WebElement home;


    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("website.url"));
    }

    public boolean isHomePageDisplayed() {
       return home.isDisplayed();
    }
    public void selectBankManagerLogin() {
        bankManagerLoginButton.click();
    }
}
