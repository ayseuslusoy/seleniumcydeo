package com.cydeo.tests.day12_PageObjectModel_Synchronization;
import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class POMPractices {
    LibraryLoginPage libraryLoginPage;

    @Test
    public void reqired_field_error_message_test() {
        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        Driver.getDriver().get("https://library1.cydeo.com/");

        //3- Do not enter any information
        //4- Click to “Sign in” button
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

    }

    @Test
    public void invalid_email_format_error_message_test() {
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        Driver.getDriver().get("https://library1.cydeo.com/");
        //3- Enter invalid email format
        libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.username.sendKeys("somethingwrong");
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test() {
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
       Driver.getDriver().get("https://library1.cydeo.com");
        //3- Enter incorrect username or incorrect password
        libraryLoginPage=new LibraryLoginPage();
        libraryLoginPage.username.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrong password");
        libraryLoginPage.signInButton.click();
        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
    }
}