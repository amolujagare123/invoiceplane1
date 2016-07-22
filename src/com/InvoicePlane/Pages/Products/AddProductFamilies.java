package com.InvoicePlane.Pages.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 03/07/2016.
 */
public class AddProductFamilies {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblAddFamily;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/label")
    WebElement lblFamilyName;

    @FindBy(xpath = ".//*[@id='family_name']")
    WebElement txtFamilyName;

    @FindBy(xpath = ".//*[@id='btn-submit']")
    static WebElement btnSave;

    @FindBy(xpath = ".//*[@id='btn-cancel']")
    static WebElement btnCancel;

    @FindBy(linkText = "Record successfully created")
    WebElement recordAdded;

    @FindBy(linkText = "Family already exists!")
    WebElement alreadyExistsRecord;

    WebDriver driver;

    public AddProductFamilies(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblAddFamily.isDisplayed()){
            throw new IllegalStateException("This is not Add product families Page");
        }
    }

    public String getFamilyName()

    {
        return lblFamilyName.getText();
    }
    public void setProductFamily(String productfamiily)
    {
        txtFamilyName.sendKeys(productfamiily);

    }
    public void ClickSave()
    {
        btnSave.click();
    }
    public void ClickCancel()
    {
        btnCancel.click();
    }
}
