package com.InvoicePlane.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

/**
 * Created by amol on 15/06/2016.
 */
public class Menu {

    @FindBy (linkText="Dashboard")
    WebElement lnkDashboard;

    @FindBy (linkText="Clients")
    WebElement lnkClients;

    @FindBy (linkText="Add Client")
    WebElement lnkAddClient;


    @FindBy (linkText="View Clients")
    WebElement lnkViewClients;


    @FindBy (linkText="Quotes")
    WebElement lnkQuotes;


    @FindBy (linkText ="Create Quote")
    WebElement lnkCreateQuote;

    @FindBy (linkText ="View Quotes")
    WebElement lnkViewQuotes;

    @FindBy (linkText = "Invoices")
    WebElement lnkInvoices;

    @FindBy (linkText ="Create Invoice")
    WebElement lnkCreateInvoice;

    @FindBy (linkText ="View Invoices")
    WebElement lnkViewInvoices;

    @FindBy (linkText ="View Recurring Invoices")
    WebElement lnkViewRecurringInvoices;

    @FindBy(linkText = "Products")
    WebElement lnkProducts;

    @FindBy(linkText = " Create Product")
    WebElement lnkCreateProduct;

    @FindBy(linkText = "View Product")
    WebElement lnkViewProducts;

    @FindBy(linkText = "Product families")
    WebElement lnkProductfamilies;

    @FindBy(linkText ="Payments")
    WebElement lnkPayments;

    @FindBy(linkText = "Enter Payment")
    WebElement lnkEnterPayment;

    @FindBy(linkText = "View Payments")
    WebElement lnkViewPayments;

    @FindBy(linkText = "Reports")
    WebElement lnkReports;

    @FindBy(linkText = "Invoice Aging")
    WebElement lnkInvoiceAging;

    @FindBy(linkText = "Payment History")
    WebElement lnkPaymentHistory;

    @FindBy(linkText = "Sales by Client")
    WebElement lnkSalesbyClient;

    @FindBy(linkText = "Sales by Date")
    WebElement lnksalesbyDate;

    void clickDashboard()
    {
        lnkDashboard.click();
    }

    void clickaddclient()
    {
        lnkClients.click();
        lnkAddClient.click();
    }

    void clickviewclient()
    {
        lnkClients.click();
        lnkViewClients.click();
    }

    void ClickCreateQuote()
    {
        lnkQuotes.click();
        lnkCreateQuote.click();
    }

    void ClickViewQuote()
    {
        lnkQuotes.click();
        lnkViewQuotes.click();
    }

    void ClickCreateInvoices()
    {
        lnkInvoices.click();
        lnkCreateInvoice.click();
    }

    void ClickViewInvoices()
    {
        lnkInvoices.click();
        lnkViewInvoices.click();
    }

    void ClickViewRecurringInvoices()
    {
        lnkInvoices.click();
        lnkViewRecurringInvoices.click();
    }

   void ClickCreateProduct()
   {
       lnkProducts.click();
       lnkCreateProduct.click();
   }

    void ClickViewProduct()
    {
        lnkProducts.click();
        lnkViewProducts.click();
    }

    void ClickProductfamilies()
    {
        lnkProducts.click();
        lnkProductfamilies.click();
    }

    void ClickEnterPayment()
    {
        lnkPayments.click();
        lnkEnterPayment.click();
    }
    void ClickViewPayments()
    {
        lnkPayments.click();
        lnkViewPayments.click();
    }

    void ClickInvoiceAging()
    {
        lnkReports.click();
        lnkInvoiceAging.click();
    }

    void ClickPaymentHistory()
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











