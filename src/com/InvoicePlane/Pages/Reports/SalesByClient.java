package com.InvoicePlane.Pages.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 19/06/2016.
 */
public class SalesByClient {

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblSalesByClient;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/div[1]/label")
    WebElement lblFromDate;

    @FindBy(xpath = ".//*[@id='from_date']")
    WebElement inputFromDate;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/div[2]/label")
    WebElement lblToDate;

    @FindBy(xpath = ".//*[@id='to_date']")
    WebElement inputToDate;

    @FindBy(xpath = ".//*[@id='report_options']/div[2]/form/input")
    WebElement btnRunReport;

    WebDriver driver;
    public SalesByClient(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblSalesByClient.isDisplayed()){
            throw new IllegalStateException("This is not Sales By Client Page");
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
