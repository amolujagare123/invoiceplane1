package com.InvoicePlane.Pages.Invoices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RENU on 6/26/2016.
 */
public class ViewInvoices
{
    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/a/span")
    WebElement Invoices;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/ul/li[2]/a")
    WebElement ViewInvoices;

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblInvoices;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[1]")
    WebElement lblStatus;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[2]")
    WebElement lblInvoice;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[3]")
    WebElement lblCreated;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[4]")
    WebElement lblDueDate;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[5]")
    WebElement lblClientName;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[6]")
    WebElement lblAmount;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[7]")
    WebElement lblBalance;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[8]")
    WebElement lblOptions;


    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/button")
    WebElement btnSubmenu;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a")
    WebElement btnNew;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a/i")
    WebElement SignPlus;

    WebDriver driver;

    public ViewInvoices(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblInvoices.isDisplayed()){
            throw new IllegalStateException("This is not View Invoices Page");
        }
    }

    public String getTextInvoices()

    {
        return lblInvoices.getText();
    }

    public String getTextStatus()

    {
        return lblStatus.getText();
    }

    public String getTextInvoice()
    {
        return lblInvoice.getText();
    }

    public String getTextCreated()
    {
        return lblCreated.getText();
    }


    public String getTextDuedate()
    {
        return lblDueDate.getText();
    }


    public String getTextClientName()
    {
        return lblClientName.getText();
    }


    public String getTextAmount()
    {
        return lblAmount.getText();
    }



    public String getTextBalance()
    {
        return lblBalance.getText();
    }


    public String getTextOptions()
    {
        return lblOptions.getText();
    }


    public String getTextSubmenu()
    {
        return btnSubmenu.getText();
    }


    public String getTextNew()
    {
        return btnNew.getText();
    }



    public String getTextSignPlus()
    {
        return SignPlus.getText();
    }




}
