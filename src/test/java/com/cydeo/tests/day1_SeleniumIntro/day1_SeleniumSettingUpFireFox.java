package com.cydeo.tests.day1_SeleniumIntro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class day1_SeleniumSettingUpFireFox {
    public static void main(String[] args) {
        //Setup firefox driver so selenium can use it automate firefox
        WebDriverManager.firefoxdriver().setup();
        //2.Create WebDriver instance that point to firefox driver
        WebDriver driver=new FirefoxDriver();
        //3.Navigate to the https://google.com
        driver.navigate().to("https://google.com");

    }
}
