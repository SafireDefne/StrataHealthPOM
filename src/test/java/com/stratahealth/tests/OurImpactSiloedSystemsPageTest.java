package com.stratahealth.tests;

import com.stratahealth.base.BaseTest;
import com.stratahealth.util.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurImpactSiloedSystemsPageTest extends BaseTest {

    @BeforeMethod
    public void ourImpactSiloedSystemsPageSetup() {
       ourImpactSiloedSystemsPage = homePage.goToOurImpactSiloedSystemsPage();

    }

    @Test
    public void siloedSystemsPageTest() {
        Assert.assertEquals(ourImpactSiloedSystemsPage.getPageTitle(),Constants.SILOED_SYSTEMS_PAGE_TITLE);
        Assert.assertEquals(ourImpactSiloedSystemsPage.getPageName(),Constants.SILOED_SYSTEMS_PAGE_NAME);
        Assert.assertTrue(ourImpactSiloedSystemsPage.verifyTheProblemParagraphTest());
        Assert.assertTrue(ourImpactSiloedSystemsPage.verifyOurSolutionParagraphTest());
        Assert.assertTrue(ourImpactSiloedSystemsPage.verifyImageTest());
    }

}
