package com.InvoicePlane.Pages.Quotes;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by RENU on 6/26/2016.
 */
public class CreateQuote {
    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[3]/a/span")
    WebElement Quotes;

    @FindBy(xpath = ".//*[@id='create-quote']/form/div[1]/h3")
    WebElement lblCreateQuote;

    @FindBy(xpath = ".//*[@id='create-quote']/form/div[1]/a/i")
    WebElement btnSymbolClose;

    @FindBy(xpath = ".//*[@id='create-quote']/form/div[2]/div[1]/label")
    WebElement lblClient;

    @FindBy(xpath = ".//*[@id='create-quote']/form/div[2]/div[1]/span/span[1]/span")
    WebElement DropdownClient;

    @FindBy(xpath = ".//*[@id='create-quote']/form/div[2]/div[2]/label")
    WebElement lblQuoteDate;


    @FindBy(xpath = ".//*[@id='create-quote']/form/div[2]/div[3]/label")
    WebElement lblQuotePDFpassword;

    @FindBy(xpath = ".//*[@id='quote_password']")
    WebElement txtQuotePDFpassword;

    @FindBy(xpath = ".//*[@id='create-quote']/form/div[2]/div[4]/label")
    WebElement lblInvoiceGroup;

    @FindBy(xpath = ".//*[@id='invoice_group_id']")
    WebElement DropDownInvoiceGroup;


    @FindBy(xpath = ".//*[@id='create-quote']/form/div[3]/div/button[1]")
    WebElement btnCancel;

    @FindBy(xpath = ".//*[@id='quote_create_confirm']")
    WebElement btnSubmit;


    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement lblSuccessMessage;


    WebDriver driver;

    public CreateQuote(WebDriver driver) {
        this.driver = driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if (!lblClient.isDisplayed()) {
            throw new IllegalStateException("This is not create Quote Page");
        }
    }

    public String getTextCreateQuote() {
        return lblCreateQuote.getText();

    }

    public String getTextClient() {
        return lblClient.getText();
    }

    public void setClient(String Client)
    {
        Select client = new Select(DropdownClient);

        client.selectByVisibleText(Client);
    }


    public String getTextQuoteDate()
    {
        return lblQuoteDate.getText();

    }

    public void setQuotedate(String QuoteDate) throws ParseException
    {
        driver.findElement(By.xpath(".//*[@id='quote_date_created']")).click();

        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat CalDateFormat = new SimpleDateFormat("MMMM yyyy");

        Date setDate = myDateFormat.parse(QuoteDate);

        Date curDate = CalDateFormat.parse(driver.findElement(By.className("datepicker-switch")).getText());


        int monthdiff = Months.monthsBetween(new DateTime(curDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1)).getMonths();
        boolean isFuture = true;

        if (monthdiff < 0)
        {
            isFuture = false;
            monthdiff *= -1;
        }

        for (int i = 0; i < monthdiff; i++)
        {
            if (isFuture == true) {
                driver.findElement(By.xpath("html/body/div[5]/div[1]/table/thead/tr[2]/th[3]")).click();
            } else {
                driver.findElement(By.xpath("html/body/div[5]/div[1]/table/thead/tr[2]/th[1]")).click();
            }
        }
        String daySetDate;
        SimpleDateFormat formatDaySetDate = new SimpleDateFormat("dd");
        daySetDate = formatDaySetDate.format(setDate);
        int daySetDateInt = Integer.parseInt(daySetDate);
        driver.findElement(By.xpath("//td[@class='day' and text()='" + daySetDateInt + "']")).click();


}



    public String getTextQuotePDFpassword()
    {
        return lblQuotePDFpassword.getText();
    }

    public void setQuotePDFpassword(String QuotePDFpassword)
    {
        txtQuotePDFpassword.sendKeys(QuotePDFpassword);
    }


    public String getTextInvoiceGroup()
    {
        return lblInvoiceGroup.getText();
    }


    public void setInvoiceGroup(String InvoiceGroupText)
    {
        Select InvoiceGroup = new Select(DropDownInvoiceGroup);

        InvoiceGroup.selectByVisibleText(InvoiceGroupText);
    }


    public void ClickSubmit()
    {
        btnSubmit.click();
    }


    public String getTextSuccessMessage()
    {
        return lblSuccessMessage.getText();

    }




}