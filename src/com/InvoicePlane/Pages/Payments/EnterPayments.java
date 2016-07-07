package com.InvoicePlane.Pages.Payments;

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
 * Created by dell on 19/06/2016.
 */
public class EnterPayments {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblPaymentForm;

    @FindBy(xpath = ".//*[@id='content']/div[1]/div[1]/label")
    WebElement lblInvoice;

    @FindBy(xpath = ".//*[@id='invoice_id']")
    WebElement inputInvoice;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/label")
    WebElement lblDate;

    @FindBy(xpath = ".//*[@id='content']/div[3]/div[1]/label")
    WebElement lblAmount;

    @FindBy(xpath = ".//*[@id='payment_amount']")
    WebElement txtAmount;

    @FindBy (xpath = "//input[@id='payment_date']")
            WebElement inputDate;

    @FindBy(xpath = ".//*[@id='payment_method_id']")
            WebElement inputPaymentMethod;

    @FindBy(xpath = ".//*[@id='content']/div[5]/div[1]/label")
            WebElement lblNote;

    @FindBy(xpath = ".//*[@id='content']/div[5]/div[2]/textarea")
            WebElement txtNote;

    @FindBy(xpath = ".//*[@id='btn-submit']")
            WebElement btnSave;

    @FindBy(xpath = ".//*[@id='btn-cancel']")
            WebElement btnCancel;

    WebDriver driver;

    public EnterPayments(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblPaymentForm.isDisplayed()){
            throw new IllegalStateException("This is not Payment Page");
        }
    }

    public String getlblInvoice() {return lblInvoice.getText();}
    public String getlblDate() {return lblDate.getText();}
    public String getlblAmount() {return lblAmount.getText();}

    public void setAmount(String amt){txtAmount.sendKeys(amt);}
    public void setNote(String note)
    {
        txtNote.sendKeys(note);
    }

    public void setInvoice(String Invoice)
    {
        Select obj = new Select(inputInvoice);

        obj.selectByVisibleText(Invoice);
    }
    public void setPaymentMethod(String Method)
    {
        Select obj = new Select(inputPaymentMethod);

        obj.selectByVisibleText(Method);
    }
    public void clickSavebtn()
    {
        btnSave.click();
    }

    public void clickInputDate()
    {
        inputDate.click();
    }

    public void clickCancel()
    {
        btnCancel.click();
    }

    public void setDate(String dateStr) throws ParseException {
        clickInputDate();
        SimpleDateFormat setDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat curDateFormat = new SimpleDateFormat("MMMM yyyy");
        Date setInvDate = setDateFormat.parse(dateStr);
        Date curDate = curDateFormat.parse(driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText());

        int months = Months.monthsBetween(new DateTime(curDate).withDayOfMonth(1),new DateTime(setInvDate).withDayOfMonth(1)).getMonths();
        boolean isFuture = true;
        // decided whether set date is in past or future
        if(months<0){
            isFuture = false;
            months*=-1;
        }
        // iterate through month difference
        for(int i=1;i<=months;i++){
            if(isFuture)
            {
                driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
            }
            else
            {
                driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev']")).click();
            }
        }

        SimpleDateFormat formatDate=new SimpleDateFormat("dd");

        int curDateDay = Integer.parseInt(formatDate.format(setInvDate));

        driver.findElement(By.xpath("//td[@class='day' and text()='" + curDateDay + "']")).click();



    }



}
