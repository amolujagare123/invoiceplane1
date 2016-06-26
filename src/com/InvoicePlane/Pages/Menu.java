package com.InvoicePlane.Pages;

import org.openqa.selenium.WebElement;
<<<<<<< HEAD
=======
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
>>>>>>> origin/master
import org.openqa.selenium.support.FindBy;

/**
 * Created by amol on 15/06/2016.
 */
public class Menu {

<<<<<<< HEAD
    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[1]/a[1]")
    WebElement lnkDashboard;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[1]/a[1]")
    WebElement lnkClient;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/ul/li[1]/a")
    WebElement lnkAddClient;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/ul/li[2]/a")
    WebElement lnkViewClient;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/ul/li[2]/a")
    WebElement lnkQuotes;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[3]/ul/li[1]/a")
    WebElement lnkCreateQuote;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[3]/ul/li[1]/a")
    WebElement lnkViewQuotes;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/a/span")
    WebElement lnkInvoices;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/ul/li[1]/a")
    WebElement lnkCreateInvoice;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/ul/li[2]/a")
    WebElement lnkViewInvoices;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/ul/li[3]/a")
    WebElement lnkViewRecurringInvoices;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[5]/a/span")
    WebElement lnkProducts;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[5]/ul/li[1]/a")
    WebElement lnkCreateProduct;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[5]/ul/li[2]/a")
    WebElement lnkViewProducts;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[5]/ul/li[3]/a")
    WebElement lnkProductFamilies;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[6]/a/span")
    WebElement lnkPayments;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[6]/ul/li[1]/a")
    WebElement lnkEnterPayment;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[6]/ul/li[2]/a")
    WebElement lnkViewPayments;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[8]/a/span")
    WebElement lnkReports;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[8]/ul/li[1]/a")
    WebElement lnkInvoiceAging;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[8]/ul/li[2]/a")
    WebElement lnkPaymentHistory;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[8]/ul/li[3]/a")
    WebElement lnkSalesbyClient;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[8]/ul/li[4]/a")
    WebElement lnkSalesbyDate;

    void addClient()
    {
        lnkClient.click();
        lnkAddClient.click();
    }

    void viewClient()
    {
        lnkClient.click();
        lnkViewClient.click();
    }

    void createQuote()
=======
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
>>>>>>> origin/master
    {
        lnkQuotes.click();
        lnkCreateQuote.click();
    }

<<<<<<< HEAD
    void viewQuotes()
=======
    void ClickViewQuote()
>>>>>>> origin/master
    {
        lnkQuotes.click();
        lnkViewQuotes.click();
    }

<<<<<<< HEAD
    void createInvoice()
=======
    void ClickCreateInvoices()
>>>>>>> origin/master
    {
        lnkInvoices.click();
        lnkCreateInvoice.click();
    }

<<<<<<< HEAD
    void viewInvoices()
=======
    void ClickViewInvoices()
>>>>>>> origin/master
    {
        lnkInvoices.click();
        lnkViewInvoices.click();
    }

<<<<<<< HEAD
    void viewRecurringInvoices()
=======
    void ClickViewRecurringInvoices()
>>>>>>> origin/master
    {
        lnkInvoices.click();
        lnkViewRecurringInvoices.click();
    }

<<<<<<< HEAD
    void createProduct()
    {
        lnkProducts.click();
        lnkCreateProduct.click();
    }

    void viewProducts()
=======
   void ClickCreateProduct()
   {
       lnkProducts.click();
       lnkCreateProduct.click();
   }

    void ClickViewProduct()
>>>>>>> origin/master
    {
        lnkProducts.click();
        lnkViewProducts.click();
    }

<<<<<<< HEAD
    void productFamilies()
    {
        lnkProducts.click();
        lnkProductFamilies.click();
    }

    void enterPaymnet()
=======
    void ClickProductfamilies()
    {
        lnkProducts.click();
        lnkProductfamilies.click();
    }

    void ClickEnterPayment()
>>>>>>> origin/master
    {
        lnkPayments.click();
        lnkEnterPayment.click();
    }
<<<<<<< HEAD

    void viewPaymentsO()
    {
        lnkPayments.click();
        lnkEnterPayment.click();
    }

    void invoiceAging()
=======
    void ClickViewPayments()
    {
        lnkPayments.click();
        lnkViewPayments.click();
    }

    void ClickInvoiceAging()
>>>>>>> origin/master
    {
        lnkReports.click();
        lnkInvoiceAging.click();
    }

<<<<<<< HEAD
    void paymentHistory()
=======
    void ClickPaymentHistory()
>>>>>>> origin/master
    {
        lnkReports.click();
        lnkPaymentHistory.click();
    }

<<<<<<< HEAD
    void salesByClient()
=======

    void ClickSalesbyClient()
>>>>>>> origin/master
    {
        lnkReports.click();
        lnkSalesbyClient.click();
    }

<<<<<<< HEAD
    void salesByDate()
    {
        lnkReports.click();
        lnkSalesbyDate.click();
=======
    void ClickSalesbyDate()
    {
        lnkReports.click();
        lnksalesbyDate.click();

>>>>>>> origin/master
    }



}











