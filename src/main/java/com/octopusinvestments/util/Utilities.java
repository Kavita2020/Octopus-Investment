package com.octopusinvestments.util;

import com.octopusinvestments.basepage.BasePage;
import io.appium.java_client.functions.ExpectedCondition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;

import java.util.List;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class Utilities extends BasePage {

    //This method will generate random number
    //@return
    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    // This method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // This method will click on element
    public void clickOnElement(WebElement element) {
        element.click();
    }

    // This method will send text  from element
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }

    //This method is for mouse hover to element
    public void mouseHoverToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    // Drag and drop
    public void dragAndDrop(By by, WebElement toElement, WebElement fromElement) {
        Actions action = new Actions(driver);
        action.dragAndDrop(fromElement, toElement).build().perform();
    }

    // Click and hold, move to element, release, build and perform
    public void clickAndHold(WebElement fromElement, WebElement toElement) {
        Actions action = new Actions(driver);
        action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
    }

    // This method will return welcome text
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    //This method is for select visible text from Drop Down Menu

    public void selectVisibleTextFromDropDownMenu(By by, String text) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByVisibleText(text);
    }

    public void selectVisibleTextFromDropDownMenu(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

    // This method is for select by value from drop down Menu
    public void selectByValueFromDropDownMenu(By by, String value) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByValue(value);
    }

    public void selectByValueFromDropDownMenu(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);

    }

    //This method is for select by index from drop down menu
    public void selectByIndexFromDropDownMenu(By by, int index) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByIndex(index);
    }

    public void selectByIndexFromDropDownMenu(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);

    }

    public void scrollUpDown(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + i + ")");
    }

    public void scrollLeftRight(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + i + ",0)");
    }



/*
   //  This method will used to wait web driver until element become clickable

8    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    */
   /*  This method will used to wait web driver until presence of element located by locator

    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
*/

    //  This method will used to wait web driver until visibility of element located by locator

    public void explicitlyWaitUntilElementVisible(By by, int timeout) {
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }


    //
//     * This method will verify that element is displayed
//     */
    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will returns list of web elements
     */
    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    public void verifyExpectedAndActual(Object expected, Object actual){
        Assert.assertEquals(expected,actual);
    }

    public void sendKeyManually(By by){

    }

}



