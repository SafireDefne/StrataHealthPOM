package com.stratahealth.pages;

import com.stratahealth.base.BasePage;
import com.stratahealth.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutCompanyPage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    public AboutCompanyPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }

    private By companyPageName = By.xpath("//h2[text()='The Company']");


    public String getCompanyPageName() {
        return elementUtil.doGetText(companyPageName);
    }

    public String getCompanyPageTitle() {
        return driver.getTitle();
    }



}
