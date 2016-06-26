package com.InvoicePlane.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amol on 14/06/2016.
 */
public class DashBoard {
    WebDriver driver;

    @FindBy(xpath = "//a[@data-original-title='Logout']")
    WebElement imgLogout;

    public DashBoard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        if (!imgLogout.isDisplayed()) {
            throw new IllegalStateException("This is not Dash board");
        }
    }

}