package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class CommonToAll {

    public EdgeDriver driver;

    public void openBrowser(WebDriver driver,String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }


    public void waitForVisibility(WebDriver driver, int timeInSeconds,String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitForTextToBePresent(WebDriver driver, int timeInSeconds,String xpath,String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpath)),text));
    }




    @BeforeTest
    public void setUp(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);

    }

    @AfterTest
    public void tearDown(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


    public void waitForJVM(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }






}
