package com.cydeo.tests.day10_upload_actions_jsexecutor;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {
    @Test
    public void registration_form_test(){
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        //Create JavaFaker object
        Faker faker=new Faker();

        //Enter first name
        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstName']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //Enter last name
        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //Enter user name
        WebElement inputUserName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //  inputUserName.sendKeys(faker.name().username().replaceAll(".",""));
        String user=faker.bothify("helpdesk###");
        inputUserName.sendKeys(user);

        //Enter email address
        WebElement inputEmail=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user+"@email.com");

        //Enter password
        WebElement inputPassword=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
        System.out.println("faker.internet().password() = " + faker.internet().password());

        //Enter a phone number
        WebElement inputPhone=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10.Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004, 1920)
        inputBirthday.sendKeys("03/08/2000");

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

    }
}
