package com.ICICI.Tests.modules;

import com.ICICI.PageObjects.CalculatorPage;
import com.ICICI.PageObjects.LandingPage;
import com.ICICI.UtilFactory.SetupTearDown;

import static com.ICICI.UtilFactory.HarnessVariables.*;

public class ICICITest extends SetupTearDown {

    private final LandingPage landingPage;
    private final CalculatorPage calculatorPage;

    public ICICITest(){
        landingPage=new LandingPage(driver);
        calculatorPage= new CalculatorPage(driver);
    }

    public void validateCarLoan_1() throws InterruptedException {
        loadURL(guiURL);

        landingPage.searchProduct(carLoan)
                .clickCalculatorButton()
                .navigateToCalculatorPage(1);

        calculatorPage.InputloanAmount(210005)
                .InputRateofInterest(9.45)
                .InputTenure(3);

    }
}
