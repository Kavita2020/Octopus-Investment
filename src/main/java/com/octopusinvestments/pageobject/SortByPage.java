package com.octopusinvestments.pageobject;

import com.octopusinvestments.util.Utilities;
import org.openqa.selenium.*;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class SortByPage extends Utilities {

    By trigger = By.xpath("//div[@class='jq-selectbox__trigger']");
    By atoZ = By.xpath("//li[contains(text(),'Sort A-Z')]");
    By ztoA = By.xpath("//li[contains(text(),'Sort Z-A')]");
    By asc = By.xpath("//div/a/h2[text()='Victoria Barber']");
    By dec = By.xpath("//h2[contains(text(),'Adam Birch')]");

    public void clickOnTrigger() {
        explicitlyWaitUntilElementVisible(trigger, 5);
        clickOnElement(trigger);
    }

    public void selectAtoZ() {
        clickOnElement(atoZ);
    }

    public void selectTextZtoA() {
        clickOnElement(ztoA);
    }

    public void verifyAscOrder() {
        verifyExpectedAndActual("Adam Birch", getTextFromElement(dec));
    }

    public void verifyDesOrder() {
        verifyExpectedAndActual("Victoria Barber", getTextFromElement(asc));
    }
}
