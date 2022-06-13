package com.cydeo.tests.day8_WebTables_ConfigurationReader;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class T4_Config_Practice {
   /* public WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //We are getting the browserType dynamically from our
        // configuration.properties file
        String browserType= ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

         */
    //Yorum satirina aldigimda driver lar kirmizi olacak. Kirmizi olan driver yerine olusturdugum
    //Driver class ve getDriver methodundan yararlanacagim
    @Test
    public void google_search_test(){
        //Go to https://practice.cydeo.com/web-tables
        Driver.getDriver().get("https://www.google.com");
        //Write apple in search box
  WebElement searchBox= Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
   searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
  //Verify title
        //Expected:apple-Google Search
        String expected=ConfigurationReader.getProperty("searchValue") +" -Google Search";
        String actual= Driver.getDriver().getTitle();
        Assert.assertEquals(actual, expected);

    }
}
