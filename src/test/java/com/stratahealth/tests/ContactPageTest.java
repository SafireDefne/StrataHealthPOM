package com.stratahealth.tests;

import com.stratahealth.base.BaseTest;
import com.stratahealth.util.Constants;
import com.stratahealth.util.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactPageTest extends BaseTest{
    @BeforeMethod
    public void contactPageSetup() {
        contactPage = homePage.goToContactPage();
    }
    @Test(priority = 1)
    public void verifyContactPageNameTest() {
        Assert.assertEquals(contactPage.getContactPageName(), Constants.CONTACT_PAGE_NAME);

    }
    @Test(priority = 2)
    public void validateContactPageTitleTest() {
        Assert.assertEquals(contactPage.getContactPageTitle(),Constants.CONTACT_PAGE_TITLE);
    }

    @Test(priority = 3)
    public void verifyAddressPresentTest() {
        Assert.assertTrue(contactPage.checkCanadianAddressPresent());
        Assert.assertTrue(contactPage.checkUKAddressPresent());
        Assert.assertTrue(contactPage.checkUSAAddressPresent());
    }

    @Test(dataProvider = "getUserData" ,priority = 4)
    public void fillContactFormTest(String firstName, String lastName, String email, String phone,
                                    String organization, String jobTitle, String province, String help) {

        Assert.assertEquals(contactPage.fillContactForm(firstName, lastName, email, phone,
                organization, jobTitle, province, help),Constants.FAIL_MESSAGE);

    }


    @DataProvider
    public Object[][] getUserData() {
        return ExcelUtil.getTestData("sheet1");
    }

}
