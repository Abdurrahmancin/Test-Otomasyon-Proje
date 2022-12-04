package org.example.base;

import org.example.page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver webDriver;
    public WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver,15,600);

    }


    public WebElement findElement(By by){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return webDriver.findElement(by);
    }

    public void sendKeys(By by , CharSequence text){
        WebElement element = findElement(by);
        element.clear();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }
    public void click(By by){
        WebElement element =findElement(by);
        if (element != null && element.isDisplayed()){
            ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView(true)",element);
        }
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public String getText(By by){
        return  findElement(by).getText();
    }

    public void navigateUrl(String url){
        webDriver.navigate().to(url);
    }
    public void timeUnitSecond(int second){
        try{
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void scroll(By by){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollInToView();",findElement(by));

    }

}
