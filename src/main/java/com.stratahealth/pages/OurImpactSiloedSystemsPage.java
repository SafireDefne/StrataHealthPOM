package com.stratahealth.pages;

import com.stratahealth.base.BasePage;
import com.stratahealth.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurImpactSiloedSystemsPage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    public OurImpactSiloedSystemsPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }

    private By soiledSystemsPageName = By.xpath("//h2[text()='Siloed Systems']");
    private By theProblemParagraph = By.xpath("//section[2]/div/div/div/div/div/section/div/div/div[1]/div/div");
    private By ourSolutionsParagraph = By.xpath("//section[2]/div/div/div/div/div/section/div/div/div[2]/div/div");
    private By image = By.xpath("//section[1]/div/div/div[2]/div/div/div/div/div/img");

    public String getPageTitle() {
        return driver.getTitle();
    }
    public String getPageName() {
        return elementUtil.doGetText(soiledSystemsPageName);
    }
    public boolean verifyTheProblemParagraphTest() {
        return elementUtil.checkIsDisplayed(theProblemParagraph);
    }
    public boolean verifyOurSolutionParagraphTest() {
        return elementUtil.checkIsDisplayed(ourSolutionsParagraph);
    }
    public boolean verifyImageTest() {
        return elementUtil.checkIsDisplayed(image);
    }


}
