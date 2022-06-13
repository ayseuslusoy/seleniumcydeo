package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.CRM_UTILITIES;
import org.testng.annotations.Test;

import static com.cydeo.utilities.CRM_UTILITIES.crm_login;

public class CRM extends TestBase {

        @Test
        public void crm_login_test () {
            //Go to : https://login1.nextbasecrm.com/
            driver.get("https://login1.nextbasecrm.com/");
            //Calling my utility method to login helpdesk1
            crm_login(driver, "helpdesk1@cybertekschool.com");
            //Verify title is expected. Expected:Portal
            BrowserUtilities.verifyTitle(driver, "Portal");

        }
    @Test
    public void crm_login_test1 () {
        //Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //Calling my utility method to login helpdesk1
        CRM_UTILITIES.crm_login (driver,
                "helpdesk1@cybertekschool.com",
                "UserUser");
    }
    }
