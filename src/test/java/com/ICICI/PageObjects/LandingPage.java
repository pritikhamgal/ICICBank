package com.ICICI.PageObjects;

import com.ICICI.UtilFactory.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.ICICI.UtilFactory.SetupTearDown.*;

public class LandingPage {



    @FindBy(xpath = "//input[@id='search-chatInput']") private WebElement inputProduct;
    @FindBy(xpath = "//div[@id='panelCarousel']//div[text()='Calculator']") private WebElement buttonCalculator;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public LandingPage searchProduct(String product) throws InterruptedException {
        waitUntilClickable(inputProduct);
        waitUntilVisible(inputProduct);
   //    hightlightElemet(inputProduct);
        inputProduct.sendKeys(product);
        Thread.sleep(3000);
        inputProduct.sendKeys(Keys.ENTER);
        return this;
    }

    public LandingPage clickCalculatorButton() throws InterruptedException {
        waitUntilVisible(buttonCalculator);
        waitUntilClickable(buttonCalculator);
     //   hightlightElemet(buttonCalculator);
        buttonCalculator.click();
        Thread.sleep(3000);
        return this;
    }

    public LandingPage navigateToCalculatorPage(int id)
    {
        Config.switchToChildWindow(id);
        return this;
    }


}
