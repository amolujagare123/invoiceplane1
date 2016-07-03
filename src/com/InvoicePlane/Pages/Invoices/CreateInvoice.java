package com.InvoicePlane.Pages.Invoices;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by RENU on 6/26/2016.
 */
public class CreateInvoice
{

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[4]/a/span")
    WebElement Invoices;

    @FindBy(xpath = ".//*[@id='create-invoice']/form/div[1]/h3")
    WebElement lblCreateInvoice;

    @FindBy(xpath = ".//*[@id='create-invoice']/form/div[2]/div[1]/label")
    WebElement lblClient;

    @FindBy(xpath = ".//*[@id='create-invoice']/form/div[2]/div[2]/label")
    WebElement lblInvoiceDate;

    @FindBy(xpath = ".//*[@id='create-invoice']/form/div[2]/div[1]/span/span[1]/span")
    WebElement DropDownClient;

    @FindBy(xpath = ".//*[@id='create-invoice']/form/div[2]/div[3]/label")
    WebElement lblPDFpassword;


    @FindBy(xpath = ".//*[@id='invoice_password']")
    WebElement txtPDFpassword;

    @FindBy(xpath = ".//*[@id='create-invoice']/form/div[2]/div[4]/label")
    WebElement lblInvoiceGroup;

    @FindBy(xpath =".//*[@id='invoice_group_id']")
    WebElement DropDownInvoiceGroup;

    @FindBy(xpath =".//*[@id='create-invoice']/form/div[3]/div/button[1]")
    WebElement btnCancel;

    @FindBy(xpath = ".//*[@id='invoice_create_confirm']")
    WebElement btnSubmit;


    WebDriver driver;

    public CreateInvoice(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblClient.isDisplayed()){
            throw new IllegalStateException("This is not Create Invoice Page");
        }
    }


    public String getTextCreateInvoice()

    {
        return lblCreateInvoice.getText();
    }


    public void setClient(String Client)
    {
        Select cLient= new Select(DropDownClient);

        cLient.selectByVisibleText(Client);
    }




    public void setInvoiceDate(String InvoiceDate) throws ParseException
    {
        driver.findElement(By.xpath(".//*[@id='invoice_date_created']")).click();

        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat CalDateFormat = new SimpleDateFormat("MMMM yyyy");

        Date setDate = myDateFormat.parse(InvoiceDate);

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


    public String getTextInvoiceDate()

    {
        return lblInvoiceDate.getText();
    }

    public String getTextPDFpassword()

    {
        return lblPDFpassword.getText();
    }

    public void setPDFpassword(String PDFpassword)
    {
        txtPDFpassword.sendKeys(PDFpassword);
    }

    public String getTextInvoiceGroup()

    {
        return lblInvoiceGroup.getText();
    }

    public void setInvoiceGroup(String InvoiceGroup)
    {
        Select invoice= new Select(DropDownInvoiceGroup);

        invoice.selectByVisibleText(InvoiceGroup);
    }

    public String getTextCancel()
    {
        return btnCancel.getText();

    }

    public String getTextSubmit()

    {
        return btnSubmit.getText();

    }


}
