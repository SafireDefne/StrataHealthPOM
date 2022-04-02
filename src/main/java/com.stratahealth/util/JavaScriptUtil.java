package com.stratahealth.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
    WebDriver driver;


    public JavaScriptUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void flash(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgColor = element.getCssValue("backgroundColor");

        for (int i = 0; i < 3; i++) {
            js.executeScript("arguments[0].setAttribute('style',arguments[1]);",element, "background: yellow; border: 2px solid red");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].setAttribute('style',arguments[1]);",element,"");
        }
    }

}
