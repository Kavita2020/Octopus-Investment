package com.octopusinvestments.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Kavita Shah on 14/02/2020
 */


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-reports"},
//        tags = "@Sort",
        monochrome = true
)
public class TestRunner {
} 
