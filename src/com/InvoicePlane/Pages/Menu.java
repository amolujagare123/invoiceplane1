package com.InvoicePlane.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by amol on 15/06/2016.
 */
public class Menu {

    @FindBy (linkText="Dashboard")
    WebElement lnkDashboard;

    @FindBy (linkText="Clients")
    WebElement lnkClients;

    @FindBy (linkText="Add Client")
    WebElement lnkAddClient;


    @FindBy (linkText="View Clients")
    WebElement lnkViewClients;


    void addclient()
    {
        lnkClients.click();
        lnkAddClient.click();
    }

    void viewclient()
    {
        lnkClients.click();
        lnkViewClients.click();
    }
}
