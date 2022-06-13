package com.cydeo.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {
    //Create the object of properties (static butun kodlardan once calisir)
    private static Properties properties=new Properties();
    static{
        //We need to open the file in java memory:FileInputStream
        try {
            FileInputStream file=new FileInputStream("configuration.properties");
            //Load the properties object using FileInputStreamObject
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
