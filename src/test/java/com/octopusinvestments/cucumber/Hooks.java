package com.octopusinvestments.cucumber;

import com.octopusinvestments.basepage.BasePage;
import com.octopusinvestments.browserselector.BrowserSelector;
import com.octopusinvestments.property.LoadProperties;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class Hooks extends BasePage {
    String browser = new LoadProperties().getMyProperty("browser");
    String baseUrl = new LoadProperties().getMyProperty("baseUrl");

    @Before
    public void init() {
        new BrowserSelector().selectBrowser(browser, baseUrl);
    }

    @After
    public void tearDown() {
         driver.quit();
    }
} 
