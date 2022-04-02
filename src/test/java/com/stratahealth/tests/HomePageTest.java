package com.stratahealth.tests;

import com.stratahealth.base.BaseTest;
import com.stratahealth.util.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTest() {
        homePage.verifyClickOnAlert();
        Assert.assertEquals(homePage.getPageTitle(),constants.PAGE_TITLE);
        Assert.assertTrue(homePage.verifyLogo());
        Assert.assertTrue(homePage.verifyOurSolutionsDropDown());
        Assert.assertEquals(homePage.getOurSolutionsDropDownItem(), Constants.actualOurSolutionsDropDownList());
        Assert.assertTrue(homePage.verifyOurImpactDropDown());
        Assert.assertEquals(homePage.getOurImpactDropDownItem(),Constants.actualOurImpactDropdownList());
        Assert.assertTrue(homePage.verifyOurCustomersLink());
        Assert.assertTrue(homePage.verifyAboutDropDown());
        Assert.assertEquals(homePage.verifyAboutDropDownList(),Constants.actualAboutDropdownList());
        Assert.assertTrue(homePage.verifyContactLink());
        Assert.assertTrue(homePage.verifyRequestADemoBtn());
        Assert.assertTrue(homePage.verifyNeedHelpFooter());
        Assert.assertTrue(homePage.verifySupportEmail());
        Assert.assertTrue(homePage.verifyInfoEmail());
        Assert.assertTrue(homePage.verifySubscribeLink());
        Assert.assertTrue(homePage.verifyLinkedinLink());
        Assert.assertTrue(homePage.verifyLinkedinLinkUK());
        Assert.assertTrue(homePage.verifyLinkedinLinkUS());
        Assert.assertTrue(homePage.verifyTwitterLink());
        Assert.assertTrue(homePage.verifyTwitterLinkUK());
        Assert.assertTrue(homePage.verifyYoutubeLink());
        Assert.assertTrue(homePage.verifyBuildersTag());


    }


}
