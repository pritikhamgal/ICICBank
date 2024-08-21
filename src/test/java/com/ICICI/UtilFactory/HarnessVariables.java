package com.ICICI.UtilFactory;

import org.openqa.selenium.WebDriver;

public class HarnessVariables {

    public static WebDriver driver;

    public static final String guiURL = Config.getProperty("guiURL");
    public static final String carLoan = Config.getProperty("carLoan");

}
