package com.InvoicePlane.Pages.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by dell on 19/06/2016.
 */
public class CreateProduct {

    @FindBy(xpath = ".//*[@id='btn-submit']")
    WebElement btnSave;

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblProductForm;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/legend")
    WebElement lblNewproduct;

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblFamily;

    @FindBy(xpath = ".//*[@id='family_id']")
    WebElement comboBox;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[2]/div[1]/label")
    WebElement lblSKU;

    @FindBy(xpath = ".//*[@id='product_sku']")
    WebElement txtSKU;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[3]/div[1]/label")
    WebElement lblProductname;

    @FindBy(xpath = ".//*[@id='product_name']")
    WebElement txtProductname;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[4]/div[1]/label")
    WebElement lblProductdesc;

    @FindBy(xpath = ".//*[@id='product_description']")
    WebElement txtProductdesc;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[5]/div[1]")
    WebElement lblPrice;

    @FindBy(xpath = ".//*[@id='product_price']")
    WebElement txtPrice;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[6]/div[1]/label")
    WebElement lblTaxRate;

    @FindBy(xpath = ".//*[@id='tax_rate_id']")
    WebElement comboTaxRate;

    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div/div[1]/label")
    WebElement lblPurchaseprice;

    @FindBy(xpath = ".//*[@id='purchase_price']")
    WebElement txtPurchaseprice;

    @FindBy(xpath = ".//*[@id='btn-cancel']")
    WebElement btnCancel;


    WebDriver driver;

    public CreateProduct(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblProductForm.isDisplayed()){
            throw new IllegalStateException("This is not Create Product Page");
        }
    }

    public String getTextNewProduct()

    {
        return lblNewproduct.getText();
    }

    public String getFamily()
    {
        return lblFamily.getText();
    }

    public void setFamily(String family)
   {
       Select obj = new Select(comboBox);

       obj.selectByVisibleText(family);
    }

    public String getSKU()
    {
        return lblSKU.getText();
    }
    public void setSKU(String sku)
    {
        txtSKU.sendKeys(sku);
    }
    public String getProductname()
    {
        return lblProductname.getText();
    }
    public void setProductName(String productname)
    {
        txtProductname.sendKeys(productname);
    }
    public String getProductdesc()
    {
        return lblProductdesc.getText();
    }
    public void setProductDesc(String productdesc)
    {
        txtProductdesc.sendKeys(productdesc);
    }
    public String getPrice()
    {
        return lblPrice.getText();
    }
    public void setPrice(String price)
    {
        txtPrice.sendKeys(price);
    }
    public String getTaxrate()
    {
        return lblTaxRate.getText();
    }
    public void setTaxrate(String
                                   taxrate)
    {
        Select tr=new Select(comboTaxRate);
        tr.selectByVisibleText(taxrate);
    }
    public String getPurchaseprice()
    {
        return lblPurchaseprice.getText();
    }
    public void setPurchaseprice(String purchseprice)
    {
        txtPurchaseprice.sendKeys(purchseprice);
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
