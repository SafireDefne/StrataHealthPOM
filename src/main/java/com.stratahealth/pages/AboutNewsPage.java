package com.stratahealth.pages;

import com.stratahealth.base.BasePage;
import com.stratahealth.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutNewsPage extends BasePage {

    private WebDriver driver;
    private ElementUtil elementUtil;

    public AboutNewsPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }
    private By newsPageName = By.xpath("//article[@id='post-2004']/div/div/div/div/section[1]/div/div/div/div/div/section/div/div/div[1]/div/div/div/div/h2");
    private By searchField = By.name("s");
    private By nextBtn = By.xpath("//a[@class='page-numbers next']");
    private By preButton = By.xpath("//a[@class='page-numbers prev']");


    public String verifyNewsPageTitle() {
        return driver.getTitle();
    }
    public String verifyNewsPageName() {
        return elementUtil.doGetText(newsPageName);
    }
    public boolean verifySearchField() {
        return elementUtil.checkIsDisplayed(searchField);
    }
    public void verifySearchFunction(String searchItemName) {
        elementUtil.doSendKeys(searchField,searchItemName);
        elementUtil.waitForElementToBeClickable(searchField,5);
        elementUtil.doClick(searchField);
    }

    public boolean verifyNextBtn() {
        return elementUtil.checkIsDisplayed(nextBtn);
    }
    public void clickOnNextBtn() {
        elementUtil.doClick(nextBtn);
        elementUtil.doClick(preButton);//if prebutton is not clicked, that means we are still on page 1

    }





}
