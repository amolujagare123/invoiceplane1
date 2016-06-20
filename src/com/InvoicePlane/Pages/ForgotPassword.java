package com.InvoicePlane.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amol on 15/06/2016.
 */
public class ForgotPassword {
    @FindBy(xpath = ".//*[@id='email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@value='Reset password']")
    WebElement btnResetPass;

    @FindBy (xpath=".//*[@id='password_reset']/h3")
        WebElement textPasswordReset;

    WebDriver driver;

    public ForgotPassword(WebDriver driver) {
        this.driver=driver;
     //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!textPasswordReset.isDisplayed()){
            throw new IllegalStateException("This is not Forgot Password Page");
        }
    }

    public void clickReset()
    {
        btnResetPass.click();
    }

    public void setEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

}
