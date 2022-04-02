package com.stratahealth.pages;

import com.stratahealth.base.BasePage;
import com.stratahealth.util.Constants;
import com.stratahealth.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactPage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;


    public ContactPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }
    private By contactPageName = By.xpath("//h2[text()='Contact Strata Health']");
    private By fName = By.id("ff_1_names_first_name_");
    private By lName = By.id("ff_1_names_1_last_name_");
    private By emailAddress = By.name("email");
    private By telephone = By.xpath("//input[@placeholder='Phone Number']");
    private By organizationField = By.xpath("//input[@placeholder='Organization']");
    private By jobTitleFiled = By.xpath("//input[@placeholder='Job Title']");
    private By countryFiled = By.name("country-list");
    private By provinceField = By.xpath("//input[@placeholder='Province (eg. BC, AB, SK)']");
    private By helpBox = By.xpath("//textarea[@placeholder='How can we help?']");
    private By iframeRobotCheckBox = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
    private By robotCheckbox = By.cssSelector("div.recaptcha-checkbox-border");
    private By submitBtn = By.xpath("//*[@id='fluentform_1']/div[12]/button");
    private By failMessage = By.xpath("//form[@id='fluentform_1']/div[11]/div/div[2]");
    private By addressCanada = By.xpath("//section[2]/div/div/div/div/div/section/div/div/div[1]/div/div/div[3]");
    private By addressUK = By.xpath("//section[2]/div/div/div/div/div/section/div/div/div[1]/div/div/div[5]");
    private By addressUSA = By.xpath("//section[2]/div/div/div/div/div/section/div/div/div[1]/div/div/div[7]");

    public String getContactPageName() {
        return elementUtil.doGetText(contactPageName);
    }

    public String getContactPageTitle() {
        return driver.getTitle();
    }

    public boolean checkCanadianAddressPresent() {
        return elementUtil.checkIsDisplayed(addressCanada);
    }

    public boolean checkUKAddressPresent() {
        return elementUtil.checkIsDisplayed(addressUK);
    }
    public boolean checkUSAAddressPresent() {
        return elementUtil.checkIsDisplayed(addressUSA);
    }

    public String fillContactForm(String firstName, String lastName, String email, String phone,
                                       String organization, String jobTitle, String province, String help) {


        elementUtil.doSendKeys(fName, elementUtil.generateRandomString(5) + firstName);
        elementUtil.doSendKeys(lName, elementUtil.generateRandomString(6) + lastName);
        elementUtil.doSendKeys(emailAddress, elementUtil.generateRandomString(8) + email);
        elementUtil.waitFor(2000);
        elementUtil.doSendKeys(telephone, phone + elementUtil.generateRandomStringFromIntegers(7));
        elementUtil.doSendKeys(organizationField, organization);
        elementUtil.doSendKeys(jobTitleFiled, jobTitle);
        elementUtil.selectDropDownItem(countryFiled, Constants.COUNTRY);
        elementUtil.waitFor(1000);
        elementUtil.doSendKeys(provinceField, province);
        elementUtil.doSendKeys(helpBox, help);
        elementUtil.doClick(submitBtn);
        elementUtil.waitForElementToBeVisible(failMessage,12);
        return elementUtil.doGetText(failMessage);

    }


}
