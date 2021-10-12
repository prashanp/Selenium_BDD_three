package com.gk.test.page_objects.web;

import com.gk.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  Class which contains page objects should extend "PageObject" class
 * This gives access to the webdriver object and utility methods
 * USE CSS,ID,NAME,CLASSNAME selectors instead of xpath
 */
public class HomePage extends PageObject {

    private By email = By.xpath("//input[@id='identifierId']");
    private By NextButton = By.cssSelector("#identifierNext > div > button > span");

    public void clickSignInLink() {
        waitForExpectedElement(email).sendKeys("sameer.sukhija@gmail.com");
    }

    public void clickSignOutLink() {
        waitForExpectedElement(NextButton).click();

    }
}


