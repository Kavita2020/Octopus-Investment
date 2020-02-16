package com.octopusinvestments.pageobject;

import com.octopusinvestments.util.Utilities;
import org.openqa.selenium.*;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class PersonProfilePage extends Utilities {

    By personName = By.xpath("//h3[@class='title-medium']");

    public void verifyPersonName(String name){
        verifyExpectedAndActual(name, getTextFromElement(personName));
    }
} 
