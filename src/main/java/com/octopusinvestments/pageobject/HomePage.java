package com.octopusinvestments.pageobject;

import com.octopusinvestments.util.Utilities;
import org.openqa.selenium.*;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class HomePage extends Utilities {

    By initCookies = By.xpath("//a[@class='btn-pink js-cookie-btn']");
    By searchBar = By.xpath("//input[@name='search']");
    By searchBtn = By.xpath("//div[@class='form_group']//img");
    By resultImg = By.xpath("//h2[@class='team-item_title']");
    By imgGrid = By.xpath("//div[@id='grid']");

    public void handlePopup() {
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        explicitlyWaitUntilElementVisible(initCookies, 10);
        clickOnElement(initCookies);
        explicitlyWaitUntilElementVisible(imgGrid, 5);
    }


    public void clickOnSearchBar() {
        clickOnElement(searchBar);
    }

    public void enterTextInSearchBar(String name) {
        sendTextToElement(searchBar, name);
        clickOnElement(searchBtn);
    }


    public void validateTheSearchName(String name) {
        verifyExpectedAndActual(name,getTextFromElement(resultImg));
    }

    public void clickOnPersonImage(String personName){
        By personImg = By.xpath("//div[@id='grid']/div/a/h2[contains(text(),'"+personName+"')]");
        clickOnElement(personImg);
    }
}
