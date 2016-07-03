package com.InvoicePlane.Pages.Payments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by dell on 19/06/2016.
 */
public class EnterPayments {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblPaymentForm;

    @FindBy(xpath = ".//*[@id='content']/div[1]/div[1]/label")
    WebElement lblInvoice;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/label")
    WebElement lblDate;

    @FindBy(xpath = ".//*[@id='content']/div[3]/div[1]/label")
    WebElement lblAmount;
}
