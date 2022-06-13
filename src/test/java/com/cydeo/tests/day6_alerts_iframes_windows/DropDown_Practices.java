package com.cydeo.tests.day6_alerts_iframes_windows;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class DropDown_Practices {
    @Test//Test annotation da main method kullanilmaz ama @Test yazdiktan sonra public void isim seklinde
    //method yazilir
    public void  dropdown_task6() throws InterruptedException {
        //Open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        //Select December 1, 1923 and verify it is selected. Select year using:visible text
        yearDropdown.selectByVisibleText("1923");

        //Select month using:value attribute
        monthDropdown.selectByValue("11");
        //Select day using index number
        dayDropdown.selectByIndex(0);//index number xpath de bir den baslar burada xpath kullanmadigim
        //icin sifirdan baslar
        //creating expected values
        String expectedYear="1923";
        String expectedMonth="December";
        String expectedDay="1";

        //getting actual values from browser
        String actualYear=yearDropdown.getFirstSelectedOption().getText();
        String actualMonth=monthDropdown.getFirstSelectedOption().getText();
        String actualDay=dayDropdown.getFirstSelectedOption().getText();
        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);
    }

}
