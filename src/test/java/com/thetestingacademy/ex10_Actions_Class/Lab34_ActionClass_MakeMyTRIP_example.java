package com.thetestingacademy.ex10_Actions_Class;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.WeakHashMap;

public class Lab34_ActionClass_MakeMyTRIP_example extends CommonToAll {

    @Test
    public void test_actions_p4() {
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // Wait for the popup to come and click the x icon
        //span[@data-cy='closeModal']

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        // This will close the modal
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        model.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));


        // sendKeys ->
        // popups, moveElement -> actions.send


        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        waitForJVM(3000);

        try {
            List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

            for (WebElement e:  list_auto_complete){
                if(e.getText().contains("Chandigarh")){
                    e.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Ignore this");
        }


    }

}
