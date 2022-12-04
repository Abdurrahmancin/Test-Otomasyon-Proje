package org.example.page;

import org.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static org.example.constant.ConstantHomePage.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage openHomePage(){
        navigateUrl("https://www.network.com.tr/");
        Assert.assertEquals(webDriver.getTitle(), "NetWork");

        return this;

    }
    public HomePage search(){
        sendKeys(SEARCH_AREA,"ceket");
        return this;
    }

    public HomePage scrollForPageTwo(){
        scroll(SCROLL_MENU);
        return this;
    }



}
