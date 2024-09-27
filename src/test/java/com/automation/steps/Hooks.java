package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.automation.utils.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        ReportManager.initReporter(scenario);
        System.out.println("Starting"+scenario.getName());
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }
    @After
    public void cleanUp(Scenario scenario){
        if (scenario.isFailed()){
            ReportManager.log("failed screenschot added");
            ReportManager.attachScreenshot();
        }
        System.out.println("======>"+scenario.isFailed());
        DriverManager.getDriver().quit();
    }
}
