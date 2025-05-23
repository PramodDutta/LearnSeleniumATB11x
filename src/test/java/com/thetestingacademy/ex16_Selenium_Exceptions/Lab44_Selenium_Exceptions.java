package com.thetestingacademy.ex16_Selenium_Exceptions;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Lab44_Selenium_Exceptions extends CommonToAll {


    @Test
    public void test_selenium_exceptions() {

        driver.get("https://app.vwo.com/");
        System.out.println("Start of program");
        try {
            driver.findElement(By.id("pramod")); // org.openqa.selenium.NoSuchElementException: no such element
        } catch (NoSuchElementException e) {
            System.out.println("Element ila");
        }


    }

}
