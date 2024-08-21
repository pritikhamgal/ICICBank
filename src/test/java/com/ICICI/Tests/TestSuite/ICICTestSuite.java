package com.ICICI.Tests.TestSuite;

import com.ICICI.Tests.modules.ICICITest;
import com.ICICI.UtilFactory.SetupTearDown;
import org.testng.annotations.Test;

public class ICICTestSuite extends SetupTearDown {

    @Test(testName = "Validate Car Loan")
    public void validateCarLoan() throws InterruptedException {
        ICICITest iciciTest= new ICICITest();
        iciciTest.validateCarLoan_1();
    }


}
