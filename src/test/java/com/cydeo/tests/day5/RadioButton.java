package com.cydeo.tests.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        //check if it is selected or not
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();
        WebElement greenRadioButton=driver.findElement(By.id("green"));
        //isSelected() methodu kutucuk isaretlimi demektir. Eger isaretli ise true isaretli degilse
        //false degerini dondurur
        System.out.println("greenRadioButton.isSelected() = " + greenRadioButton.isSelected());
        //isEnabled() method tiklanabilir mi demektir. Eger ifade tiklanabilirse isEnable ve true
        //yoksa false dur ve disable dir
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());
        List<WebElement> allColourRadios= (List<WebElement>) driver.findElement(By.name("color"));
        System.out.println("allColourRadios.size() = " + allColourRadios.size());
       for( WebElement eachRadioButton:allColourRadios){
           System.out.println("current radio button is "+eachRadioButton.getAttribute("id"));
           System.out.println("is it enabled"+eachRadioButton.isEnabled());
           System.out.println("is it selected"+eachRadioButton.isSelected());
       }



    }
}
