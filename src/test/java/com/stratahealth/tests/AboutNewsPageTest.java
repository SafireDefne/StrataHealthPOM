package com.stratahealth.tests;

import com.stratahealth.base.BaseTest;
import com.stratahealth.util.Constants;
import com.stratahealth.util.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AboutNewsPageTest extends BaseTest {
    @BeforeMethod
    public void aboutNewsPageSetup() {
        aboutNewsPage = homePage.goToAboutNewsPage();
    }

    @Test(priority = 1)
    public void verifyNewsPageTitleTest() {
        Assert.assertEquals(aboutNewsPage.verifyNewsPageTitle(), Constants.ABOUT_NEWS_PAGE_TITLE);
    }
    @Test(priority = 2)
    public void verifyNewsPageNameTest() {
        Assert.assertEquals(aboutNewsPage.verifyNewsPageName(),Constants.ABOUT_NEWS_PAGE_NAME);
    }
    @Test(priority = 3)
    public void verifySearchFieldTest() {
        Assert.assertTrue(aboutNewsPage.verifySearchField());
    }

    @Test(dataProvider = "getUserData",priority = 4)
    public void verifySearchFunctionTest(String searchItemName) {
        aboutNewsPage.verifySearchFunction(searchItemName);
    }

    @Test(priority = 5)
    public void verifyNextBtnTest() {
        Assert.assertTrue(aboutNewsPage.verifyNextBtn());
        aboutNewsPage.clickOnNextBtn();

    }

    @DataProvider
    public Object[][] getUserData() {
        Object data[][] = ExcelUtil.getTestData("sheet2");
        return data;
    }

}
