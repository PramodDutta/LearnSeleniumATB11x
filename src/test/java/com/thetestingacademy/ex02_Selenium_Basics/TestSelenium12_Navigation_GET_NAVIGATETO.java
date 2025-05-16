package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigation_GET_NAVIGATETO {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com"); // 95%

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL


        // Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();




    }
}
