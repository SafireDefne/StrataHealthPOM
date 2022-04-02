package com.stratahealth.pages;

import com.stratahealth.base.BasePage;
import com.stratahealth.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);

    }



    private By logo = By.xpath("//div/nav/div[1]/a/img");
    private By ourSolutionsDropDown = By.xpath("//*[@id='menu-item-dropdown-1478']");
    private By ourSolutionsDropDownList = By.xpath("//*[@id='menu-item-1478']/ul/li/a");
    private By ourImpactDropDown = By.xpath("//*[@id='menu-item-dropdown-3051']");
    private By ourImpactList = By.xpath("//*[@id='menu-item-3051']/ul/li/a");
    private By ourCustomersLink = By.linkText("Our Customers");
    private By aboutDropDown = By.xpath("//*[@id='menu-item-dropdown-1878']");
    private By aboutDropDownList = By.xpath("//*[@id='menu-item-1878']/ul/li/a");
    private By contactLink = By.linkText("Contact");
    private By requestADemoBtn = By.xpath("//div/nav/a");
    private By cookieAlert = By.xpath("//span[text()='Accept & Continue']");
    private By needAHelpFooter = By.xpath("//h2[text()='Need a hand?']");
    private By supportEmail = By.xpath("//span[text()='support@stratahealth.com']");
    private By infoEmail = By.xpath("//span[text()='info@stratahealth.com']");
    private By subscribeLink = By.linkText("Subscribe today");
    private By linkedinLink = By.xpath("//div[1]/div/div/div[2]/p/a[1]");
    private By linkedinLinkUK = By.xpath("//div[1]/div/div/div[2]/p/a[2]");
    private By linkedinLinkUS = By.xpath("//div[1]/div/div/div[2]/p/a[3]");
    private By twitterLink = By.xpath("//div[2]/div/div/div[2]/p/a[1]");
    private By twitterLinkUK = By.xpath("//div[2]/div/div/div[2]/p/a[2]");
    private By youtubeLink = By.xpath("//div[3]/div/div/div[2]/p/a");
    private By builderTag = By.xpath("//a[text()='Strata Health Solutions Inc.']");
    private By companyDropDown = By.xpath("//ul/li[4]/ul/li[1]/a");
    private By newsDropDown = By.xpath("//li[@id='menu-item-2010']/a");
    private By patientChoice = By.xpath("//ul/li[3]/a[text()='Patient Choice']");
    private By siloedSystems = By.xpath("//a[text()='Siloed Systems']");




    public boolean verifyLogo() {
//       return driver.findElement(logo).isDisplayed();
        return elementUtil.checkIsDisplayed(logo);
    }

    public String getPageTitle() {
       return driver.getTitle();

    }


    public boolean verifyOurSolutionsDropDown() {
//        return driver.findElement(ourSolutionsDropDown).isDisplayed();
        return elementUtil.checkIsDisplayed(ourSolutionsDropDown);
    }



    public List<String> getOurSolutionsDropDownItem() {
        elementUtil.doClick(ourSolutionsDropDown);
        elementUtil.waitFor(2000);
        List<String> ourSolutionsItemName = new ArrayList<>();
        List<WebElement> ourSolutionsListElement = elementUtil.getElements(ourSolutionsDropDownList);
        for(WebElement elm : ourSolutionsListElement) {
            ourSolutionsItemName.add(elm.getText());
        }
        return ourSolutionsItemName;
    }

    public boolean verifyOurImpactDropDown() {
        return elementUtil.checkIsDisplayed(ourImpactDropDown);
    }

    public List<String> getOurImpactDropDownItem() {
        elementUtil.doClick(ourImpactDropDown);
        elementUtil.waitFor(2000);
        List<String> ourImpactItemName = new ArrayList<>();
        List<WebElement> ourImpactListElement = elementUtil.getElements(ourImpactList);
        for(WebElement elm : ourImpactListElement) {
            ourImpactItemName.add(elm.getText());
        }
        return ourImpactItemName;
    }

    public boolean verifyOurCustomersLink() {
        return elementUtil.checkIsDisplayed(ourCustomersLink);
    }

    public boolean verifyAboutDropDown() {
        return elementUtil.checkIsDisplayed(aboutDropDown);
    }

    public List<String> verifyAboutDropDownList() {
        elementUtil.doClick(aboutDropDown);
        elementUtil.waitFor(2000);
        List<String> aboutDropdownItems = new ArrayList<>();
        List<WebElement> aboutDropDownListItemName = elementUtil.getElements(aboutDropDownList);
        for(WebElement elm : aboutDropDownListItemName) {
            aboutDropdownItems.add(elm.getText());
        }
        return aboutDropdownItems;
    }


    public boolean verifyContactLink() {
        return elementUtil.checkIsDisplayed(contactLink);
    }

    public boolean verifyRequestADemoBtn() {
        return elementUtil.checkIsDisplayed(requestADemoBtn);
    }

    public void verifyClickOnAlert() {
        elementUtil.waitFor(5000);
        elementUtil.clickOnAlert(cookieAlert);
        //elementUtil.doClick(cookieAlert);


    }

    public ContactPage goToContactPage() {
        elementUtil.doClick(contactLink);
        elementUtil.doClick(cookieAlert);
        return new ContactPage(driver);
    }

    public OurCustomersPage goToOurCustomersPage() {
        elementUtil.doClick(ourCustomersLink);
        elementUtil.doClick(cookieAlert);
        return new OurCustomersPage(driver);
    }

    public boolean verifyNeedHelpFooter() {
       return elementUtil.checkIsDisplayed(needAHelpFooter);
    }
    public boolean verifySupportEmail() {
        return elementUtil.checkIsDisplayed(supportEmail);
    }

    public boolean verifyInfoEmail() {
        return elementUtil.checkIsDisplayed(infoEmail);
    }

    public boolean verifySubscribeLink() {
        return elementUtil.checkIsDisplayed(subscribeLink);
    }
    public boolean verifyLinkedinLink() {
        return elementUtil.checkIsDisplayed(linkedinLink);
    }

    public boolean verifyLinkedinLinkUK() {
        return elementUtil.checkIsDisplayed(linkedinLinkUK);
    }
    public boolean verifyLinkedinLinkUS() {
        return elementUtil.checkIsDisplayed(linkedinLinkUS);
    }

    public boolean verifyTwitterLink() {
        return elementUtil.checkIsDisplayed(twitterLink);
    }

    public boolean verifyTwitterLinkUK() {
        return elementUtil.checkIsDisplayed(twitterLinkUK);
    }

    public boolean verifyYoutubeLink() {
        return elementUtil.checkIsDisplayed(youtubeLink);
    }

    public boolean verifyBuildersTag() {
        return elementUtil.checkIsDisplayed(builderTag);
    }

    public AboutCompanyPage goToAboutCompanyPage() {
        elementUtil.waitForElementToBeClickable(cookieAlert,10);
        elementUtil.doClick(cookieAlert);
        elementUtil.doClick(aboutDropDown);
        elementUtil.waitForElementToBeClickable(companyDropDown,10);
        elementUtil.doClick(companyDropDown);
        return new AboutCompanyPage(driver);
    }

    public AboutNewsPage goToAboutNewsPage() {
        elementUtil.waitForElementToBeClickable(cookieAlert,4);
        elementUtil.doClick(cookieAlert);
        elementUtil.doClick(aboutDropDown);
        elementUtil.waitForElementToBeClickable(newsDropDown,5);
        elementUtil.doClick(newsDropDown);
        return new AboutNewsPage(driver);
    }

    public OurImpactPatientChoicePage goToPatientChoicePage() {
        elementUtil.doClick(cookieAlert);
        elementUtil.doClick(ourImpactDropDown);
        elementUtil.doClick(patientChoice);
        return new OurImpactPatientChoicePage(driver);
    }

    public OurImpactSiloedSystemsPage goToOurImpactSiloedSystemsPage() {
        elementUtil.doClick(cookieAlert);
        elementUtil.doClick(ourImpactDropDown);
        elementUtil.doClick(siloedSystems);
        return new OurImpactSiloedSystemsPage(driver);
    }





}
