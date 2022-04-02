package com.stratahealth.pages;

import com.stratahealth.base.BasePage;
import com.stratahealth.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurCustomersPage extends BasePage {

    private WebDriver driver;
    private ElementUtil elementUtil;
    public OurCustomersPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }
    private By ourCustomersPageName = By.xpath("//h2[text()='Our Customers']");
    private By anySectorAnySettingBlock = By.xpath("//div/ul/li/span[2]");
    private By leftDirectionCanada = By.xpath("//section[4]/div/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/div[2]/i");
    private By rightDirectionCanada = By.xpath("//section[4]/div/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/div[3]/i");
    private By leftDirectionUSA = By.xpath("//section[5]/div/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/div[2]/i");
    private By rightDirectionUSA = By.xpath("//section[5]/div/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/div[3]/i");
    private By leftDirectionUK = By.xpath("//section[6]/div/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/div[2]/i");
    private By rightDirectionUK = By.xpath("//section[6]/div/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/div[3]/i");

    public String getOurCustomersPageName() {
        return elementUtil.doGetText(ourCustomersPageName);
    }

    public String getOurCustomersPageTitle() {
        return driver.getTitle();
    }

    public boolean verifyAnySectorAnySettingBlock() {
        return elementUtil.checkIsDisplayed(anySectorAnySettingBlock);
    }

    public boolean verifyLeftDirectionCanada() {
        return elementUtil.checkIsDisplayed(leftDirectionCanada);
    }
    public boolean verifyRightDirectionCanada() {
        return elementUtil.checkIsDisplayed(rightDirectionCanada);
    }
    public boolean verifyLeftDirectionUSA() {
        return elementUtil.checkIsDisplayed(leftDirectionUSA);
    }
    public boolean verifyRightDirectionUSA() {
        return elementUtil.checkIsDisplayed(rightDirectionUSA);
    }
    public boolean verifyLeftDirectionUK() {
        return elementUtil.checkIsDisplayed(leftDirectionUK);
    }
    public boolean verifyRightDirectionUK() {
        return elementUtil.checkIsDisplayed(rightDirectionUK);
    }

}
