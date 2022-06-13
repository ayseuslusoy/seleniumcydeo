package com.cydeo.tests.day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
    public static void main(String[] args) {
        //1.set up chrome driver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2.Navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/dropdown");
        //identify the select element(select element dedigine gore dropdown kullanmaliyim ve
        // identify icin de findElement kullanmaliyim)
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        //wrap this element inside select object(wrap this element icin select class kullan.Bu class
        // olustururken Select isimlendirme=new Select(findElement = den once kullanilan isim parantez
        // icine yazilarak yapilir))
        Select selectObj=new Select(dropdownElement);
        //use ready methods to select options
        //select third item at index 2(index number 0 dan baslar)
        selectObj.selectByIndex(2);
        //select item with value attribute 1
        selectObj.selectByValue("1");
        //select by visible text
        selectObj.selectByVisibleText("option 2");

    }
}
