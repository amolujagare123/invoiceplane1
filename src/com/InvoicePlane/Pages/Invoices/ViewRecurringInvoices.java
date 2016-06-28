package com.InvoicePlane.Pages.Invoices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RENU on 6/26/2016.
 */
public class ViewRecurringInvoices
{

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/a/span")
    WebElement Invoices;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/ul/li[3]/a")
    WebElement ViewRecurringInvoices;

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblRecurringInvoices;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[1]")
    WebElement lblStatus;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[2]")
    WebElement lblBaseInvoice;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[3]")
    WebElement lblClient;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[4]")
    WebElement lblStartdate;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[5]")
    WebElement lblEndDate;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[6]")
    WebElement lblEvery;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[7]")
    WebElement lblNextDate;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[8]")
    WebElement lblOptions;

    @FindBy(xpath = ".//*[@id='headerbar']/div/div")
    WebElement btnArrow;


    WebDriver driver;

    public ViewRecurringInvoices(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblRecurringInvoices.isDisplayed()){
            throw new IllegalStateException("This is not View Recurring Invoices Page");
        }
    }


    public String getTextRecurringInvoice()

    {
        return lblRecurringInvoices.getText();
    }


    public String getTextStatus()

    {
        return lblStatus.getText();
    }



    public String getTextBaseInvoice()

    {
        return lblBaseInvoice.getText();
    }


    public String getTextClient()

    {
        return lblClient.getText();
    }


    public String getTextStartDate()

    {
        return lblStartdate.getText();
    }


    public String getTextEndDate()

    {
        return lblEndDate.getText();
    }


    public String getTextEvery()

    {
        return lblEvery.getText();
    }



    public String getTextNextDate()

    {
        return lblNextDate.getText();
    }


    public String getTextOptions()

    {
        return lblOptions.getText();
    }


    public String getTextbtnArrow()

    {
        return btnArrow.getText();
    }


}
