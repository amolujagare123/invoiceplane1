package com.InvoicePlane.Pages.Payments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 19/06/2016.
 */
public class ViewPayments {
    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblPayments;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[1]")
    WebElement lblPaymentDate;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[2]")
    WebElement lblInvoiceDate;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[3]")
    WebElement lblInvoice;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[4]")
    WebElement lblClient;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[5]")
    WebElement lblAmount;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[6]")
    WebElement lblPaymentMethod;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[7]")
    WebElement lblNote;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[8]")
    WebElement lblOptions;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a")
    WebElement btnNew;

    @FindBy(xpath = ".//*[@id='headerbar']/div[2]/div")
            WebElement btnfrwdback;

    @FindBy(xpath=".//*[@id='filter_results']/div/table/tbody/tr[1]/td[8]/div/ul/li[1]/a")
    WebElement btnEdit;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/tbody/tr[2]/td[8]/div/ul/li[2]/a")
            WebElement btnDelete;
    WebDriver driver;

    public ViewPayments(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblPayments.isDisplayed()){
            throw new IllegalStateException("This is not View Payment Page");
        }
    }

    public String getPaymentdate() {return lblPaymentDate.getText();}
    public String getInvoicedate()
    {
        return lblInvoiceDate.getText();
    }

    public String getInvoice()
    {
        return lblInvoice.getText();
    }
    public String getClient()
    {
        return lblClient.getText();
    }
    public String getAmount()
    {
        return lblAmount.getText();
    }
    public String getPaymentMethod()
    {
        return lblPaymentMethod.getText();
    }
    public String getNote()
    {
        return lblNote.getText();
    }
    public String getOptions()
    {
        return lblOptions.getText();
    }
    public void clickNew()
    {
        btnNew.click();
    }
    public void clickfrwdback(){
        btnfrwdback.click();
    }
    public void clickEditbtn()
    {
        btnEdit.click();
    }
    public void clickDetele()
    {
        btnDelete.click();
    }
}
