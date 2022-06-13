package com.cydeo.tests.day2_FindElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class FindingElement_PracticeChallange {
    public static void main(String[] args) {
        //1.set up chrome driver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2.Navigate to "https://saucedemo.com"
        driver.get("https://saucedemo.com");
        //3.Make the window maximize
        driver.manage().window().maximize();
        //4.Print out the page title
        String pageTitle=driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);
        //5.Enter username provided: standard_user
        WebElement userNameBox=driver.findElement(By.id("user-name"));
        userNameBox.sendKeys("standard_user");
        //6.Enter password provided: secret_sauce
        WebElement passwordBox=driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");
        //7.Click on login button to log in
        WebElement logIn=driver.findElement(By.id("login-button"));
        logIn.submit();
        //8.Get the name and price of first product
        WebElement firstProductLink=driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLink.getAttribute(\"id\") = " + firstProductLink.getAttribute("id"));
        WebElement firstPrice=driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstPrice.getText() = " + firstPrice.getText());
        //9.Get all product(findElement) names into List<WebElement>
        List<WebElement> allProductTitle=driver.findElements(By.className("inventory_item_name"));
        //Birden fazla urun oldugu icin bu sefer findElements kullanilmistir
        //get the count
        System.out.println("allProductTitle count is = " + allProductTitle.size());
        //print out all product title
        for(WebElement eachProductTitle:allProductTitle){
            System.out.println("eachProductTitle.getText() = " + eachProductTitle.getText());
        }
        //10.Click on the shopping cart link top right corner
        WebElement cart=driver.findElement(By.id("shopping_cart_container"));
        cart.submit();

    }
}