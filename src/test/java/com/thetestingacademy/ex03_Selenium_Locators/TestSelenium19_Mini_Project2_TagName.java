package com.thetestingacademy.ex03_Selenium_Locators;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19_Mini_Project2_TagName {

    @Owner("Pramod")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify() throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


        Thread.sleep(3000);

        // C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason


        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");


        driver.quit();






















    }

}
