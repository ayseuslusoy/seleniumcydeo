package com.cydeo.tests.day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class T1_StaleElementRefEx {
    public static void main(String[] args) {
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();// Her seferinde WebDriverManager.chromedriver().setup();
       //ve WebDriver driver=new ChromeDriver(); yazmak yerine bir utilities package olustur ve
        // WebDriverFactory diye utilies paketinin bir sinifi olsun ve buraya bu setup kur ve sen
        //bundan sonra oradan WebElement driver=WebDriverFactory getDriver("chrome) diye cagir
        //Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //Click to add element button
        WebElement addElementButton=driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();
        //Verify delete button is displayed after clicking
        WebElement delr=driver.findElement(By.xpath("//div[@id='elements']/button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed() = " + delr.isDisplayed());
        //deleteButton.isDisplayed().soutv enter dediginde otomatik olarak System.out.println("deleteButton.// isDisplayed
        // () = " + deleteButton.isDisplayed()); olusmus olur
        //click to delete button
        delr.click();
        //verify "delete" button is not displayed after clicking
       // System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed()); //Run dedigim
        //zaman konsolda nosuchelement yazisini gorecegim bunun yok olmasi icin try catch kullan
        try{
            System.out.println("deleteButton.isDisplayed() = " + delr.isDisplayed());
        }catch(StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("deleteButton.isDisplayed() = false");
        }
        driver.close();

    }
}
