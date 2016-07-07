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
        WebElement emailID;

        @FindBy(xpath = ".//*[@id='password_reset']/form/input")
        WebElement resetbtn;

    @FindBy(xpath = ".//*[@id='password_reset']/h3")
        WebElement textPwdReset;

//    WebDriver driver;

    public ForgotPassword(WebDriver driver)
    {
        this.driver=driver;
       // driver.get(url);
        PageFactory.initElements(driver, this);
        if(!textPwdReset.isDisplayed()){
            throw new IllegalStateException("This is not Forgot password Page");
        }
    }

    public DashBoard setEmail(String email)
    {
        emailID.sendKeys(email);
        return null;
    }

    public void clickReset()
    {
        resetbtn.click();
    }

    @FindBy(xpath = ".//*[@id='email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@value='Reset password']")
    WebElement btnResetPass;

    @FindBy (xpath=".//*[@id='password_reset']/h3")
        WebElement textPasswordReset;

    WebDriver driver;




}
