package com.ICICI.UtilFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import static com.ICICI.UtilFactory.HarnessVariables.driver;

public class Config {

    public static void switchToChildWindow(int id)
    {
        Set<String> mulid =  driver.getWindowHandles();
        ArrayList<String> al= new ArrayList<String>(mulid);
        driver.switchTo().window(al.get(id));
    }

    public static String getProperty(String key)
    {
        String value=null;

        try{
            Properties prop= new Properties();
            FileInputStream file= new FileInputStream("src/test/resources/Properties/config.properties");
            prop.load(file);
            value= prop.getProperty(key);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return value;
    }

}
