package com.cydeo.tests.day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("Before checkbox1.isSelected() click " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After checkbox1.isSelected() click " + checkbox1.isSelected());
        Thread.sleep(5000);
        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("Before click" + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("After click " + checkbox2.getAttribute("checked"));
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }else{
            System.out.println("checkbox1 is already selected ");
        }
    }
}
