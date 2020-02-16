package com.octopusinvestments.browserselector;

import com.octopusinvestments.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class BrowserSelector extends BasePage {

    public void selectBrowser(String browser, String baseUrl) {

        if (browser.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavita Shah\\IdeaProjects\\octopusinvestments-com-hybrid\\src\\test\\java\\resources\\drivers\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            options.addArguments("disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--disable-blink-features-BlockCredentials");
            options.addArguments("--incognito");

            driver = new ChromeDriver(options);
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Kavita Shah\\IdeaProjects\\octopusinvestments-com-hybrid\\src\\test\\java\\resources\\drivers\\geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();

            driver = new FirefoxDriver(options);
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else {
            System.out.println("Wrong Browser Selected");
        }
    }
}