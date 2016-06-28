package com.InvoicePlane.Pages.Quotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RENU on 6/26/2016.
 */
public class ViewQuotes
{
    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[3]/a/span")
    WebElement Quotes;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[3]/ul/li[2]/a")
    WebElement ViewQuotes;

    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblQuotes;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[1]")
    WebElement lblStatus;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[2]")
    WebElement lblQuote;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[3]")
    WebElement lblCreated;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[4]")
    WebElement lblDueDate;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[5]")
    WebElement lblClientName;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[6]")
    WebElement lblAmount;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[7]")
    WebElement lblOptions;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/button")
    WebElement btnSubmenu;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a")
    WebElement btnNew;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a/i")
    WebElement SignPlus;

    WebDriver driver;

    public ViewQuotes(WebDriver driver)
    {
        this.driver = driver;
        //   driver.get(url);
        PageFactory.initElements(driver,this);

        if (!lblQuotes.isDisplayed())
        {
            throw new IllegalStateException("This is not View Quote Page");
        }
    }



}
