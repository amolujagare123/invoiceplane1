package com.InvoicePlane.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by amol on 15/06/2016.
 */
public class Menu {

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
    {
        lnkQuotes.click();
        lnkCreateQuote.click();
    }

    void viewQuotes()
    {
        lnkQuotes.click();
        lnkViewQuotes.click();
    }

    void createInvoice()
    {
        lnkInvoices.click();
        lnkCreateInvoice.click();
    }

    void viewInvoices()
    {
        lnkInvoices.click();
        lnkViewInvoices.click();
    }

    void viewRecurringInvoices()
    {
        lnkInvoices.click();
        lnkViewRecurringInvoices.click();
    }

    void createProduct()
    {
        lnkProducts.click();
        lnkCreateProduct.click();
    }

    void viewProducts()
    {
        lnkProducts.click();
        lnkViewProducts.click();
    }

    void productFamilies()
    {
        lnkProducts.click();
        lnkProductFamilies.click();
    }

    void enterPaymnet()
    {
        lnkPayments.click();
        lnkEnterPayment.click();
    }

    void viewPaymentsO()
    {
        lnkPayments.click();
        lnkEnterPayment.click();
    }

    void invoiceAging()
    {
        lnkReports.click();
        lnkInvoiceAging.click();
    }

    void paymentHistory()
    {
        lnkReports.click();
        lnkPaymentHistory.click();
    }

    void salesByClient()
    {
        lnkReports.click();
        lnkSalesbyClient.click();
    }

    void salesByDate()
    {
        lnkReports.click();
        lnkSalesbyDate.click();
    }



}
