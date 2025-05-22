package com.thetestingacademy.ex12_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;

import com.thetestingacademy.CommonToAll;

public class Lab38_Windows_Part1 extends CommonToAll {

    @Test
    public void test_windows() {

        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);
        // CE3C67CE0A7CB5B9ED5148300F90EAAC
        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();


        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);


        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }
            driver.switchTo().window(parent);
        }





    }


}
