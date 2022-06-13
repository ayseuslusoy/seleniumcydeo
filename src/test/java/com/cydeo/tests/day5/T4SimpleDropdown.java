package com.cydeo.tests.day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class T4SimpleDropdown {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void test(){
//Verify "simple dropdown" default selected value is correct
        Select selectObject=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
       //Dropdown yukarda yaptigim select object ve new Select parantez icindeki locate ya da
        // identify icin
        // Simdi de default selected value yu verify yapmak icin .getFirstSelectedOption() method
        // kullan
       WebElement currentlyDefaultSelectedValue=selectObject.getFirstSelectedOption();
       String actualSimpleDropDownText=currentlyDefaultSelectedValue.getText();
       //Expected "please select an option"
       String expectedText="please select an option";
        Assert.assertEquals( actualSimpleDropDownText,expectedText);
        //Verify "state selection" default selected value is correct
        Select object=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateDropdownText=object.getFirstSelectedOption().getText();
        //Expected :"Select a state"
       String expectedStateDropdownText="Select a state" ;
       Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);
    }
}
