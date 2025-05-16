package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_Change_Driver {
    public static void main(String[] args) {
//        ChromeDriver driver = new ChromeDriver();
//        driver = new FirefoxDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
    }
}
