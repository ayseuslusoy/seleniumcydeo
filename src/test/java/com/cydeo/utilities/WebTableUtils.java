package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class WebTableUtils {
    public static String returnOrderDate(WebDriver driver,String customerName){
        String locator="//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell= driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
        //Bunun yerine asagidaki gibide yazabilirdik
        // public static String returnOrderDate(WebDriver driver,String customerName){
        // return driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]"));
    }
    public static void orderVerify(WebDriver driver,String customerName, String expectedOrderDate){
        String locator="//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell= driver.findElement(By.xpath(locator));
        String actualOrderDate=customerDateCell.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);
    }
}
