package com.gk.test.page_objects.mobile;

import com.gk.test.framework.AndroidObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class MobileContactsPage extends AndroidObject {

    private By addContactButton = By.name("Add Contact");
    private String contactFormFields = ("android.widget.EditText");
    private String saveButton = ("Save");


    public void clickOnAddContact() {
        androidDriver.findElement(addContactButton).click();
    }

    public List<AndroidElement> getContactFormFields() {
        return androidDriver.findElementsByClassName(contactFormFields);
    }

    public void saveContact() {
        androidDriver.findElementByName(saveButton).click();
    }
}
