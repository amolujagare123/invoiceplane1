package com.InvoicePlane.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by amol on 14/06/2016.
 */
public class Login {

    @FindBy(xpath = ".//*[@id='email']")
    WebElement txtUserName;

    @FindBy(xpath = ".//*[@id='password']")
    WebElement txtPassword;

    @FindBy(xpath = ".//*[@id='login']/div[2]/small/a")
    WebElement linkForgotPassword;

    @FindBy(xpath = ".//*[@id='login']/div[2]/small/a")
    WebElement lnkForgotPassword;

    @FindBy(xpath = "./*//*[@id='login']/form/input")
    WebElement btnLogin;


    WebDriver driver;

    public Login(WebDriver driver, String url)

    {
        this.driver = driver;
        driver.get(url);


        PageFactory.initElements(driver, this);
        if (!btnLogin.isDisplayed()) {
            throw new IllegalStateException("This is not Login Page");
        }
    }

    public DashBoard LoginOperation(String userName, String password) {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return new DashBoard(driver);
    }

    public void clickForgotPassword()

    {
        linkForgotPassword.click();


        {
            lnkForgotPassword.click();

        }
    }
}