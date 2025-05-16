package com.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Pramod Dutta")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

//        driver.manage().window().maximize();


        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.


        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0"
        // > close Tag

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");


        // Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password inputbox and enter the password

        // <input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345");


        // 3. Find the submit button and click on it.
        // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica"
        // >

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();


        // Step 4 - Wait some time.
        Thread.sleep(3000);


        // Step 5 - Verify the message error message.
        // <div
        // class="notification-box-description"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();



    }

}
