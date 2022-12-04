package org.example.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    WebDriver webDriver;
    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","lib/drivers/chrome/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-translate");
        webDriver =new ChromeDriver(options);
        webDriver.get("https://www.network.com.tr/");

    }

    @After
    public void tearDown(){
        // webDriver.quit();
    }
}
