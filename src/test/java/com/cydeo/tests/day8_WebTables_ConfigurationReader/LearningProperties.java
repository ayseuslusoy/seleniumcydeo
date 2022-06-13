package com.cydeo.tests.day8_WebTables_ConfigurationReader;
import org.testng.annotations.Test;
public class LearningProperties {
    @Test
    public void java_properties_reading_test(){
     //getProperty class allows us to use some values to get from our computer
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user name"));
        //You provide the key and return value to you
    }
}
