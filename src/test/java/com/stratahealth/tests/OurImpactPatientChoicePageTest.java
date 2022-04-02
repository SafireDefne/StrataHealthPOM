package com.stratahealth.tests;

import com.stratahealth.base.BaseTest;
import com.stratahealth.util.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurImpactPatientChoicePageTest extends BaseTest {

    @BeforeMethod
    public void patientChoicePageSetup() {
        patientChoicePage = homePage.goToPatientChoicePage();
    }
    @Test(priority = 1)
    public void verifyPatientChoicePageTest() {
        Assert.assertEquals(patientChoicePage.verifyPatientChoicePageName(), Constants.PATIENT_CHOICE_PAGE_NAME);
        Assert.assertEquals(patientChoicePage.getPatientChoicePageTitle(),Constants.PATIENT_CHOICE_PAGE_TITLE);
        Assert.assertTrue(patientChoicePage.verifyTheProblemParagraph());
        Assert.assertTrue(patientChoicePage.verifyOurSolutionParagraph());
        //Assert.assertTrue(patientChoicePage.verifyMoviePlayer());
        Assert.assertTrue(patientChoicePage.verifyImage());
    }

}
