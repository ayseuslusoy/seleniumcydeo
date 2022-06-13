package com.cydeo.tests.day3_cssSelectorAndXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByCssSelector {
    public static class FindingByCss {
        public static void main(String[] args) {
            //set up chrome and create web driver instance
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            //navigate to https://search.yahoo.com
            driver.get("https://search.yahoo.com");
            //use css selector to identify(findElement) search box and enter(sendKeys) "css selector"
            //Asagidaki seceneklerden herhangi birini findElement icindeki parantez icin kullan
            // #yschsp
            // input#yschsp or input[id='yschsp']
            // input[name='p']
            // input[name='p'][class='sbq'] or input.sbq[name='p']
            // div>input[name='p']
            // div#sbq=wrap>input[name='p']
            // #sbq=wrap>#yschsp
            WebElement searchBox=driver.findElement(By.cssSelector("#yschsp"));
            searchBox.sendKeys("css selector");
            //click on x icon to clear out the text
            WebElement clearIcon=driver.findElement(By.cssSelector("button#sbq-clear>span"));
            clearIcon.click();
            //enter "selenium locators" into searchbox
            searchBox.sendKeys("selenium locators");
            //identify search icon and click on it
            WebElement searchIcon=driver.findElement(By.cssSelector("span.ico-syc.mag-glass[title=\"Search\"]"));

        }
    }
}
