package com.InvoicePlane.Pages.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 19/06/2016.
 */
public class ViewProducts {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblProducts;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[1]")
    WebElement lblFamily;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[2]")
    WebElement lblSKU;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[3]")
    WebElement lblProductname;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[4]")
    WebElement lblProductDescription;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[5]")
    WebElement lblPrice;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[6]")
    WebElement lblTaxrate;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[7]")
    WebElement lblOptions;

    @FindBy(xpath = ".//*[@id='content']/div/table/thead/tr/th[7]")
    WebElement btnNew;


    WebDriver driver;

    public ViewProducts(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblProducts.isDisplayed()){
            throw new IllegalStateException("This is not View Product Page");
        }
    }

    public String getFamilt()
    {
        return lblFamily.getText();
    }
    public String getSKU()
    {
        return lblSKU.getText();
    }
    public String getProductname()
    {
        return lblProductname.getText();
    }
    public String getProductdesc()
    {
        return lblProductDescription.getText();
    }
    public String getPrice()
    {
        return lblPrice.getText();
    }
    public String getTaxrate()
    {
        return lblTaxrate.getText();
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
