package com.stratahealth.pages;

import com.stratahealth.base.BasePage;
import com.stratahealth.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurImpactPatientChoicePage extends BasePage {
   private WebDriver driver;
   private ElementUtil elementUtil;

   public OurImpactPatientChoicePage(WebDriver driver) {
       this.driver = driver;
       elementUtil = new ElementUtil(driver);
   }
   private By patientChoicePageName = By.xpath("//h2[text()='Patient Choice']");
   private By theProblemParagraph = By.xpath("//section[2]/div/div/div/div/div/section/div/div/div[1]/div/div");
   private By ourSolutionParagraph = By.xpath("//section[2]/div/div/div/div/div/section/div/div/div[2]/div/div");
    private By moviePlayer = By.xpath("//div[@id='movie_player']/div[4]");
    private By image = By.xpath("//div[2]/div/div/div/div/div/img");



   public String verifyPatientChoicePageName() {
       return elementUtil.doGetText(patientChoicePageName);
   }

   public String getPatientChoicePageTitle() {
       return driver.getTitle();
   }

   public boolean verifyTheProblemParagraph() {
       return elementUtil.checkIsDisplayed(theProblemParagraph);
   }
   public boolean verifyOurSolutionParagraph() {
       return elementUtil.checkIsDisplayed(ourSolutionParagraph);
   }

//   public boolean verifyMoviePlayer() {
//       elementUtil.waitForFameToBeAvailableAndSwitchToIt(driver,50,moviePlayer);
//       elementUtil.waitForElementToBeVisible(moviePlayer,10);
//       return elementUtil.checkIsDisplayed(moviePlayer);
//   }

   public boolean verifyImage() {
       return elementUtil.checkIsDisplayed(image);
   }



}
