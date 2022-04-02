package com.stratahealth.util;

import com.stratahealth.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class ElementUtil {
    private WebDriver driver;
    private JavaScriptUtil javaScriptUtil;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
        javaScriptUtil = new JavaScriptUtil(this.driver);
    }

    public WebElement getElement(By locator) {
       // return driver.findElement(locator);
        WebElement element = driver.findElement(locator);
        if(BasePage.highlight.equalsIgnoreCase("true")) {
            javaScriptUtil.flash(element);
        }
        return element;
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public void doClick(By locator) {
        getElement(locator).click();
    }

    public void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public boolean checkIsDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public String doGetText(By locator) {
        return getElement(locator).getText();
    }

    public void waitFor(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectDropDownItem(By locator, String visibleText) {
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(visibleText);

    }

    public void clickOnAlert(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator)).click().build().perform();

    }

    public String generateRandomStringFromIntegers(int length) {
        String str = "0123456789";
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder(length);

        for(int i = 0; i < length; i++) {
            stringBuilder.append(str.charAt(secureRandom.nextInt(str.length())));
        }
        return stringBuilder.toString();
    }

    public String generateRandomString(int length) {
        String str = "0123456789abcdefghijklmnopqrstuvwxyz";
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder(length);

        for(int i = 0; i < length; i++) {
            stringBuilder.append(str.charAt(secureRandom.nextInt(str.length())));
        }
        return stringBuilder.toString();
    }

    public List<WebElement> getAllDropDownOptions(By locator) {
        Select select = new Select(getElement(locator));
        return select.getOptions();
    }

    public boolean compareDropDownOptions(By locator, String[] expected) {
        List<WebElement> options = getAllDropDownOptions(locator);
        int i = 0;
        for(WebElement option : options) {
            if(!option.getText().equals(expected[i])) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }


    public void waitForElementPresent(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        //return getElement(locator);
    }

    public WebElement waitForElementToBeVisible(By locator, int timeout) {
        WebElement element = getElement(locator);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitForElementToBeClickable(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public boolean waitForUrl(String url, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.urlContains(url));
    }

    public Alert waitForAlertToBePresent(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    // clickWhenReady:
    public void clickWhenReady(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public String waitForTitleToBePresent(String title, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.titleContains(title));
        return driver.getTitle();
    }
    public void waitForFameToBeAvailableAndSwitchToIt(WebDriver driver, int timeout, By locator) {
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

}
