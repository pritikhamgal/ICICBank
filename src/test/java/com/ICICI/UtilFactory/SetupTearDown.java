package com.ICICI.UtilFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static com.ICICI.UtilFactory.HarnessVariables.driver;

public class SetupTearDown {

    static WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

    @BeforeTest
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void loadURL(String url){
        driver.get(url);
    }

    public void waitforPageToLoad()
    {

    }

    public static void waitUntilClickable(WebElement element)
    {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

//    public  static void hightlightElemet(WebElement element)
//    {
//        try
//        {
//            JavascriptExecutor jse= (JavascriptExecutor) driver;
//            jse.executeScript("argument[0].setAttribute('style',background:yellow;border:2px solid red');",element);
//        }
//        catch(Exception e)
//        {
//            throw new RuntimeException(e);
//        }
//
//    }

    public static void waitUntilVisible(WebElement element)
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
