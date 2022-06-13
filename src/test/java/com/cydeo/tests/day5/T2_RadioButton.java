package com.cydeo.tests.day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class T2_RadioButton {
    public static void main(String[] args) {
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();// Her seferinde WebDriverManager.chromedriver().setup();
        //ve WebDriver driver=new ChromeDriver(); yazmak yerine bir utilities package olustur ve
        // WebDriverFactory diye utilies paketinin bir sinifi olsun ve buraya bu setup kur ve sen
        //bundan sonra oradan WebElement driver=WebDriverFactory getDriver("chrome) diye cagir
        //Go to https://practice.cydeo.com/radio_buttons/
        driver.get("https://practice.cydeo.com/radio_buttons");
        //Click to "Hockey" radio button
        WebElement radioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        radioBtn.click();
        //Verify hockeybutton is selected after clicking
        if (radioBtn.isSelected()) {
            System.out.println("button is selected. Verification passed");
        } else {
            System.out.println("Button is not selected. Verification failed");
        }
        clickAndVerifyRadioButton(driver, "sport", "hockey");

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "yellow");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> sportRadioButton = driver.findElements(By.name(nameAttribute));
        //Loop through the list of web element and select matching result 'hockey'
        for (WebElement each : sportRadioButton) {
            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);
            if (eachId.equals("hockey")) {
                each.click();
                System.out.println("Hockey is selected: " + each.isSelected());
                break;
            }

        }
    }
}