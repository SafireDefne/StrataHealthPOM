package com.stratahealth.tests;
import com.stratahealth.base.BaseTest;
import com.stratahealth.util.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurCustomersPageTest extends BaseTest {
    @BeforeMethod
    public void ourCustomersPageSetup() {
        ourCustomersPage = homePage.goToOurCustomersPage();
    }
    @Test
    public void verifyOurCustomersPageTest() {
        Assert.assertEquals(ourCustomersPage.getOurCustomersPageName(), Constants.OUR_CUSTOMERS_PAGE_NAME);
        Assert.assertEquals(ourCustomersPage.getOurCustomersPageTitle(),Constants.OUR_CUSTOMERS_PAGE_TITLE);
        Assert.assertTrue(ourCustomersPage.verifyAnySectorAnySettingBlock());
        Assert.assertTrue(ourCustomersPage.verifyLeftDirectionCanada());
        Assert.assertTrue(ourCustomersPage.verifyRightDirectionCanada());
        Assert.assertTrue(ourCustomersPage.verifyLeftDirectionUSA());
        Assert.assertTrue(ourCustomersPage.verifyRightDirectionUSA());
        Assert.assertTrue(ourCustomersPage.verifyLeftDirectionUK());
        Assert.assertTrue(ourCustomersPage.verifyRightDirectionUK());

    }

}
