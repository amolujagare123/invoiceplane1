package com.InvoicePlane.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amol on 15/06/2016.
 */
public class Menu {

    @FindBy (xpath="//span[text()='Dashboard']")
    WebElement lnkDashboard;

    @FindBy (xpath="//span[text()='Clients']")
    WebElement lnkClients;

    @FindBy (linkText ="Add Client")
    WebElement lnkAddClient;


    @FindBy (xpath="//span[text()='View Clients']")
    WebElement lnkViewClients;


    @FindBy (xpath = "//span[text()='Quotes']")
    WebElement lnkQuotes;


    @FindBy (xpath = "//span[text()='Create Quote']")
    WebElement lnkCreateQuote;

    @FindBy (xpath = "//span[text()='View Quote']")
    WebElement lnkViewQuotes;

    @FindBy (xpath = "//span[text()='Invoices']")
    WebElement lnkInvoices;

    @FindBy (xpath = "//span[text()='Create Invoice']")
    WebElement lnkCreateInvoice;

    @FindBy (xpath = "//span[text()='View Invoices']")
    WebElement lnkViewInvoices;

    @FindBy (xpath ="//span[text()='View Recurring Invoices']")
    WebElement lnkViewRecurringInvoices;

    @FindBy(xpath = "//span[@class='hidden-sm' and text()='Products']")
    WebElement lnkProducts;

//    @FindBy(xpath = "//span[text()='Create Product']")
//    WebElement lnkCreateProduct;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[5]/ul/li[1]/a")
    WebElement lnkCreateProduct;

    @FindBy(xpath = "//span[text()='View products']")
    WebElement lnkViewProducts;

    @FindBy(linkText = "Product families")
    WebElement lnkProductfamilies;

    @FindBy(xpath ="//span[text()='Payments']")
    WebElement lnkPayments;

    @FindBy(xpath= "//span[text()='Enter Payment']")
    WebElement lnkEnterPayment;

    @FindBy(xpath = "//span[text()='View Payments']")
    WebElement lnkViewPayments;

    @FindBy(xpath = "//span[text()='Reports']")
    WebElement lnkReports;

    @FindBy(xpath = "//span[text()='Invoice Aging']")
    WebElement lnkInvoiceAging;

    @FindBy(xpath= "//span[text()='Payment History']")
    WebElement lnkPaymentHistory;

    @FindBy(xpath= "//span[text()='Sales by Client']")
    WebElement lnkSalesbyClient;

    @FindBy(xpath= "//span[text()='Sales by Date']")
    WebElement lnksalesbyDate;

    WebDriver driver;

    public Menu(WebDriver driver)

    {
        this.driver=driver;

        PageFactory.initElements(driver, this);

    }


    public void clickDashboard()
    {
        lnkDashboard.click();
    }

    public void clickaddclient()
    {
        lnkClients.click();
        lnkAddClient.click();
    }

    public void clickviewclient()
    {
        lnkClients.click();
        lnkViewClients.click();
    }

    public  void  ClickCreateQuote()
    {
        lnkQuotes.click();
        lnkCreateQuote.click();
    }

    public void ClickViewQuote()
    {
        lnkQuotes.click();
        lnkViewQuotes.click();
    }

    public void ClickCreateInvoice()
    {
        lnkInvoices.click();
        lnkCreateInvoice.click();
    }

   public  void ClickViewInvoices()
    {
        lnkInvoices.click();
        lnkViewInvoices.click();
    }

    public void ClickViewRecurringInvoices()
    {
        lnkInvoices.click();
        lnkViewRecurringInvoices.click();
    }

   public void ClickCreateProduct()
   {
       lnkProducts.click();
       lnkCreateProduct.click();
   }

    public void ClickViewProduct()
    {
        lnkProducts.click();
        lnkViewProducts.click();
    }

    public void ClickProductfamilies()
    {
        lnkProducts.click();
        lnkProductfamilies.click();
    }

    public void ClickEnterPayment()
    {
        lnkPayments.click();
        lnkEnterPayment.click();
    }
    public void ClickViewPayments()
    {
        lnkPayments.click();
        lnkViewPayments.click();
    }

    public void ClickInvoiceAging()
    {
        lnkReports.click();
        lnkInvoiceAging.click();
    }

    public void ClickPaymentHistory()
    {
        lnkReports.click();
        lnkPaymentHistory.click();
    }


    void ClickSalesbyClient()
    {
        lnkReports.click();
        lnkSalesbyClient.click();
    }

    void ClickSalesbyDate()
    {
        lnkReports.click();
        lnksalesbyDate.click();

    }


}











