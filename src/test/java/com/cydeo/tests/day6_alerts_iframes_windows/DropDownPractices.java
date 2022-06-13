package com.cydeo.tests.day6_alerts_iframes_windows;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class DropDownPractices {
    @Test//Test annotation da main method kullanilmaz ama @Test yazdiktan sonra public void isim seklinde
    //method yazilir
            public void  dropdown_task5() throws InterruptedException {
        //Open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        //We located the dropdown and it is ready to use.(Dropdown a ozel select methodu vardir. Her ne zaman
        // dropdown kullanirsan once Select object=new Select(driver.findElement(By.xpath(""); yazmalisin.
        Select objectDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //Select Illinois(genel select nesnesi olusturduktan sonra bunun altinda secilmesini istedigim ogeler
        //icin selectByVisibleText, selectByValue, selectByIndex gibi metotlar olsutururum)
        Thread.sleep(1000);
        objectDropdown.selectByVisibleText("Illinois");
        //Select Virginia
        Thread.sleep(1000);
        objectDropdown.selectByValue("VA");
        //Select California
        Thread.sleep(1000);
        objectDropdown.selectByIndex(5);
        //Verify final selected option is California
        String expectedSelectedOption="California";
       // String actualSelectedOption=objectDropdown.getFirstSelectedOption(); bu sekilde yazarsam mutlaka
       // hata verecektir cunku getFirstSelectedOption() bana webelement return ederken = den once String
        // vardir. String return icin getText() metot sona eklenir
        String actualSelectedOption=objectDropdown.getFirstSelectedOption().getText();//metodun adi kafani
        // karistirmasin getFirstSelectedMethod aslinda su an secili degeri gosterir. keske ismi get currently
        // method olsaydi
        Assert.assertEquals(expectedSelectedOption,actualSelectedOption);
    }
}
