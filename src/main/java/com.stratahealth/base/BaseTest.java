package com.stratahealth.base;

import com.stratahealth.pages.*;
import com.stratahealth.util.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
    public BasePage basePage;
    public Properties prop;
    public HomePage homePage;
    public Constants constants;
    public ContactPage contactPage;
    public OurCustomersPage ourCustomersPage;
    public AboutCompanyPage aboutCompanyPage;
    public AboutNewsPage aboutNewsPage;
    public OurImpactPatientChoicePage patientChoicePage;
    public OurImpactSiloedSystemsPage ourImpactSiloedSystemsPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        prop = basePage.init_prop();
        driver = basePage.init_driver(prop.getProperty("browser"));
        homePage = new HomePage(driver);
        driver.get(prop.getProperty("url"));

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
