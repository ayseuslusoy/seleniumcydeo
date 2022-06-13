package com.cydeo.tests.day2_FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day2_LocatorID {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://yahoo.com");
        WebElement agreeButton=driver.findElement(By.name("agree"));//cookies engellemek icin
        agreeButton.click();//cookies engellemek icin
        //id locator ini test et ve arama kutucuguna a hello yazdir
        //id locatorini test etmek icin once chrome acip yahoo.com derim  ve bos yere tiklayip
        // inspect yazarim ve karsima gelen ekrandan kutucugu secip tekrar yahoo arama kutucugunu
        // tikladigimda bana id nin ismini soyleyecek. Bu id yi alip kopyalarim ve intelliJ geri
        // donup WebElement herhangiisim=driver.findElement(By.id("kopyaladigin id yi yapistir"));
        //identify and save the element
        WebElement researchBox=driver.findElement(By.id("ybar-sbq"));
        Thread.sleep(2000);
        researchBox.sendKeys("hello");
        researchBox.submit();
        //hello yazdiktan sonra birde yazilan yaziya tiklamasini istersem yapacagim birden fazla
        // yontem var
        //1.sendKeys ve yazidan sonra parantez icine +Keys.Enter yazmaktir
        //2.Ya da bir alt satira verilen isim.click() yani  researchBox.click() yazmaktir
        //3.Ya da bir alt satira verilen isim.submit() yani  researchBox.submit
        // () yazmaktir



    }
}