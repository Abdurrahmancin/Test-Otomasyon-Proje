package org.example.test;

import org.example.base.BaseTest;
import org.example.page.HomePage;
import org.junit.Before;
import org.junit.Test;


public class HomeTestPage extends BaseTest {
    HomePage homePage;


    @Before
    public void install() {

        homePage = new HomePage(getWebDriver());
    }
    @Test
    public void openHomePageTest(){
        homePage.openHomePage().search().scrollForPageTwo();


    }



}
