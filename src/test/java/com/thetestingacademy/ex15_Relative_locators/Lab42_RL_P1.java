package com.thetestingacademy.ex15_Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import com.thetestingacademy.CommonToAll;

public class Lab42_RL_P1 extends CommonToAll {

    @Test
    public void test_js() {
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();


        WebElement span_element = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
//        driver.findElement((with(By.id("exp-1")).toRightOf(span_element))).click();
        driver.findElement((with(By.id("exp-2")).toRightOf(span_element))).click();










    }


}
