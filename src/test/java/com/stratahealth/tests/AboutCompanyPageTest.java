package com.stratahealth.tests;

import com.stratahealth.base.BaseTest;
import com.stratahealth.util.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutCompanyPageTest extends BaseTest {
    @BeforeMethod
    public void aboutPageSetup() {
        aboutCompanyPage = homePage.goToAboutCompanyPage();
    }

    @Test(priority = 1)

    public void verifyGetCompanyPageNameTest() {
        Assert.assertEquals(aboutCompanyPage.getCompanyPageName(), Constants.COMPANY_PAGE_NAME);
    }

    @Test(priority = 2)
    public void verifyGetCompanyPageTitleTest() {
        Assert.assertEquals(aboutCompanyPage.getCompanyPageTitle(),Constants.COMPANY_PAGE_TITLE);
    }




}
