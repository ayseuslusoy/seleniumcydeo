package com.cydeo.tests.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingMultipleDropDown {
    public static void main(String[] args) {
        //1.set up chrome driver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2.Navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/dropdown");
        //identify the dropdown with multiple select options
        WebElement multipleDropDown= driver.findElement(By.name("Languages"));
        //wrap this element into select object
        Select multiObj=new Select(multipleDropDown);

        //check if this element has multi select option
        System.out.println("multiObj.isMultiple() = " + multiObj.isMultiple());
        //multiObj.isMultiple().soutv ve enter dedigimde otomatik bu ifade yazilmis olur

        //check if this is a multi select list
        multiObj.selectByIndex(3);//index 0 dan baslar index3 dedigimde index3deki kodun yan
        // taraftaki secenekten hangisine denk geliyorsa otomatik olarak secilir
        multiObj.selectByValue("c#");//c# iceren kod yan tarafta hangi secenege denk geliyorsa
        // otomatik olarak secilir ve index3 de secilmisti.Multi element oldugu icin her ikiside
        // secilmis oldu
        multiObj.selectByVisibleText("Java");//kod da java yazili text yan tarafta denk gelen
        // secenek otomatik secilir. Su an uc tane ifade secildi. Eger bunlardan silmek istedigim
        // secenek olursa deSelect method kullanmaliyim
//deSelect item
        multiObj.deselectByIndex(3);//deselect methodunda her yazan ifadeye karsilik gelen yapi silinir
        multiObj.deselectByValue("c#");
        multiObj.deselectByVisibleText("Java");
        multiObj.deselectAll();
    }
}
