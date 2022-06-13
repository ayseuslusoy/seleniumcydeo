package com.cydeo.tests.day8_WebTables_ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class WebTables {
    public WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Go to https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @Test
    public void practice() {
        //Locate the cell that has Bob Martin text in it.
        //Verify Bob's name is listed as expected
        //Expected "Bob Martin"
        WebElement name = driver.findElement
                (By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
        String expected = "Bob Martin";
        String actual = name.getText();
        Assert.assertEquals(actual, expected);
        //Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement order = driver.findElement(By.xpath(
                "//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));
        // alternative locator to bobMartinDateCell = "//td[.='Bob Martin']/../td[
        String expectedDate = "12/31/2021";
        String actualDate = order.getText();
        Assert.assertTrue(actualDate.equals(expectedDate));
    }
    //We use the utility method we created
    @Test
    public void test2(){
     String customerOrderDate=WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate = " + customerOrderDate);
        String customerOrderDate2=WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println("customerOrderDate = " + customerOrderDate);


    }
    //Using WebTableUtils.orderVerify(); method
    @Test
    public void test3() {

        WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");
    }
    }
