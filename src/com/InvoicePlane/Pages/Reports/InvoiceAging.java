package com.InvoicePlane.Pages.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 19/06/2016.
 */
public class InvoiceAging {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblInvoiceAging;

    @FindBy(xpath = ".//*[@id='report_options']/div[1]/h3")
    WebElement lblReportOption;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/div/input")
    WebElement btnRunReport;

    WebDriver driver;
    public InvoiceAging(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblInvoiceAging.isDisplayed()){
            throw new IllegalStateException("This is not Invoice Aging Page");
        }
    }

    public void clickRunReport()
    {
        btnRunReport.click();
    }
    public String getInvoceAging(){
        return lblInvoiceAging.getText();
    }

    public String getReport()
    {
        return lblReportOption.getText();
    }
}
