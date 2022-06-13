package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtilities {
    public static void sleep(int second) {
        /*
        This method will accept in(int seconds) and execute Thread.sleep for duration
         */
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }
        public static void switchWindowAndVerify(WebDriver driver,String expectedInUrl, String expectedTitle){
            Set<String> allWindowHandles=driver.getWindowHandles();
                for(String each:allWindowHandles) {
                    driver.switchTo().window(each);
                    System.out.println("current URL"+driver.getCurrentUrl());
                    if(driver.getCurrentUrl().contains("expectedInUrl")){
                        break;
                    }
                }

                String actualTitle=driver.getTitle();
                Assert.assertTrue(actualTitle.contains(expectedTitle));
            }
    public static void verifyTitle(WebDriver driver,String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

        }


