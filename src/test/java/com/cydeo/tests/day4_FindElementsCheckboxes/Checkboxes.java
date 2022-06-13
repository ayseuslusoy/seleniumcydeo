package com.cydeo.tests.day4_FindElementsCheckboxes;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //Go the https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");
        //Confirm checkbox1 is not selected by default
WebElement box1=driver.findElement(By.xpath("//span[@class='checktext' and .='Checkbox 1']"));
        System.out.println("box1.isSelected() = " + box1.isSelected());
        //Confirm checkbox1 is selected by default
WebElement box2=driver.findElement(By.xpath("span[contains(text(), 'Checkbox 2')]"));
        System.out.println("box2.isSelected() = " + box2.isSelected());
        //Click checkbox 1 to select it
        Thread.sleep(2000);
        box1.click();
        //Click checkbox 2 to deselect it
        Thread.sleep(2000);
        box2.click();
//Confirm checkbox1 is selected
        System.out.println("box1.isSelected() =, expecting true " + box1.isSelected());
        //Confirm checkbox2 is not selected
        System.out.println("box2.isSelected() =, expecting false " + box2.isSelected());
    }
}
