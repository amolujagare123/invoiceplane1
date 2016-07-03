package com.InvoicePlane.Pages.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.bind.annotation.W3CDomHandler;

/**
 * Created by dell on 19/06/2016.
 */
public class ProductFamilies {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblFamilies;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[1]")
    WebElement lblFamilyname;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[2]")
    WebElement lblOptions;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a")
    WebElement btnNew;

    WebDriver driver;

    public ProductFamilies(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblFamilies.isDisplayed()){
            throw new IllegalStateException("This is not Product Families Page");
        }
    }

    public String getFamilyname()
    {
        return lblFamilyname.getText();
    }
    public String getOptions()
    {
        return lblOptions.getText();
    }
    public void clickNew()
    {
        btnNew.click();
    }
}
