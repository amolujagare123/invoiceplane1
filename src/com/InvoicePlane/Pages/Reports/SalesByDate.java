package com.InvoicePlane.Pages.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dell on 19/06/2016.
 */
public class SalesByDate {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblSalesByDate;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/div[1]/label")
    WebElement lblFromDate;

    @FindBy(xpath = ".//*[@id='from_date']")
    WebElement inputFromDate;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/div[2]/label")
    WebElement lblToDate;

    @FindBy(xpath = ".//*[@id='to_date']")
    WebElement inputToDate;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/div[3]/div[1]/label")
    WebElement lblMinimalQunatity;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/div[3]/div[2]/label")
    WebElement lblMaximumQuantity;

    @FindBy(xpath = ".//*[@id='checkboxTax']")
    WebElement checkbox;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/input")
    WebElement btnRunReport;

    WebDriver driver;
    public SalesByDate(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblSalesByDate.isDisplayed()){
            throw new IllegalStateException("This is not Sales By Date Page");
        }
    }
    public void clickInputFromDate()
    {
        inputFromDate.click();
    }
    public void clickInputToDate()
    {
        inputToDate.click();
    }

    public void setFromDate(String dateStr) throws ParseException
    {
        clickInputFromDate();
        SimpleDateFormat setDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat curDateFormat = new SimpleDateFormat("MMMM yyyy");
        Date setDate = setDateFormat.parse(dateStr);
    }
    public void setToDate(String dateStr) throws ParseException
    {
        clickInputToDate();
        SimpleDateFormat setDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat curDateFormat = new SimpleDateFormat("MMMM yyyy");
        Date setDate = setDateFormat.parse(dateStr);
    }
    public String getFromDate()
    {
        return lblFromDate.getText();
    }
    public String getToDate()
    {
        return lblToDate.getText();
    }
    public void ClickRunReport()
    {
        btnRunReport.click();
    }



}
