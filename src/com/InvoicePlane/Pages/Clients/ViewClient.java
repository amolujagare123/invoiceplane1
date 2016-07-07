package com.InvoicePlane.Pages.Clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RENU on 6/22/2016.
 */
public class ViewClient
{

    @FindBy(xpath = "//*[@id='ip-navbar-collapse']/ul[1]/li[2]/a/span")
    WebElement Client;


    @FindBy(xpath = ".//*[@id='headerbar']/h1")
    WebElement lblClients;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[1]")
    WebElement lblClientName;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[2]")
    WebElement lblEmailAddress;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[3]")
    WebElement lblphoneNumber;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[4]")
    WebElement lblBalance;


    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[5]")
    WebElement lblActive;

    @FindBy(xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[6]")
    WebElement lblOptions;

    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/button")
    WebElement btnSubmenu;

    @FindBy(xpath = ".//*[@id='ip-submenu-collapse']/div[1]/div")
    WebElement btnGroup;


    @FindBy(xpath=".//*[@id='ip-submenu-collapse']/div[2]/ul/li[1]/a")
    WebElement btnActive;

    @FindBy(xpath=".//*[@id='ip-submenu-collapse']/div[2]/ul/li[2]/a")
    WebElement btnInActive;


    @FindBy(xpath=".//*[@id='ip-submenu-collapse']/div[2]/ul/li[3]/a")
    WebElement btnAll;



    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a")
    WebElement btnNew;


    @FindBy(xpath = ".//*[@id='headerbar']/div[1]/a/i")
    WebElement SymbolPlus;


    WebDriver driver;

    public ViewClient(WebDriver driver)
    {
        this.driver = driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if (!lblClients.isDisplayed())
        {
            throw new IllegalStateException("This is not View CLient Page");
        }
    }

    public String getTextClients()

    {
        return lblClients.getText();
    }

    public String getTextClientName()

    {
        return lblClientName.getText();
    }

    public String getTextEmailAddress()

    {
        return lblEmailAddress.getText();
    }

    public String getTextPhoneNumber()

    {
        return lblphoneNumber.getText();
    }


    public String getTextBalance()

    {
        return lblBalance.getText();
    }


    public String getTextActive()

    {
        return lblActive.getText();
    }

    public String getTextOptions()

    {
        return lblOptions.getText();
    }

    public String getTextSubmenu()

    {
        return btnSubmenu.getText();
    }


    public String getTextbtngroup()
    {
        return btnGroup.getText();
    }


    public String getTextbtnActive()
    {
      return btnActive.getText();
    }



    public String getTextbtnInActive()
    {
        return btnInActive.getText();
    }



    public String getTextbtnAll()
    {
        return btnAll.getText();
    }



    public String getTextNew()

    {
        return btnNew.getText();
    }


    public String getTextSymbolPlus()

    {
        return SymbolPlus.getText();
    }




}





