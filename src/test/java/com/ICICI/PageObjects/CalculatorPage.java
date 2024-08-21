package com.ICICI.PageObjects;

import com.ICICI.UtilFactory.SetupTearDown;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends SetupTearDown {

    @FindBy(xpath = "//input[@id='amount_input_emi_calc']")
    private WebElement LoanAmount;

    @FindBy(xpath = "//input[@id='roi_input_emi_calc']")
    private WebElement InterestRate;

    @FindBy(xpath = "//div[@class='tenure-months-input pos-rel']//input")
    private WebElement Year;

    public CalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public CalculatorPage InputloanAmount(int loan){
        waitUntilClickable(LoanAmount);
        waitUntilVisible(LoanAmount);
        LoanAmount.clear();
        LoanAmount.sendKeys(String.valueOf(loan));
        return this;
    }

    public CalculatorPage InputRateofInterest(double ROI){
        waitUntilVisible(InterestRate);
        waitUntilVisible(InterestRate);
        InterestRate.clear();
        InterestRate.sendKeys(String.valueOf(ROI));
        return this;
    }

    public CalculatorPage InputTenure(int tenure){
        waitUntilVisible(Year);
        waitUntilClickable(Year);
        Year.clear();
        Year.sendKeys(String.valueOf(tenure));
        return this;
    }
}
