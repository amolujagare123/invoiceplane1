package com.InvoicePlane.Pages.Clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by RENU on 6/22/2016.
 */
public class AddClient
{

    @FindBy(xpath = "//*[@id='ip-navbar-collapse']/ul[1]/li[2]/a/span")
    WebElement Clients;

    @FindBy(xpath = "//*[@id='headerbar']/h1")
    WebElement lblClientForm;


    @FindBy(xpath = "//*[@id='content']/fieldset/legend")
    WebElement lblPersonalInformation ;

    @FindBy(xpath = "//*[@id='content']/fieldset/div/span")
    WebElement chkboxActive ;


    @FindBy(xpath = "//*[@id='client_name']")
    WebElement txtCleintName ;

    @FindBy(xpath = "//*[@id='content']/div/div[1]/fieldset/legend")
    WebElement lblAddress ;


    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[1]/label")
    WebElement lblStreetAddress ;

    @FindBy(xpath = "//*[@id='client_address_1']")
    WebElement txtStreetAddress;


    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[2]/label")
    WebElement lblStreetAddress2;

    @FindBy(xpath = "//*[@id='client_address_2']")
    WebElement txtStreetAddress2;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[3]/label")
    WebElement lblCity;


    @FindBy(xpath = ".//*[@id='client_city']")
    WebElement txtCity;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[4]/label")
    WebElement lblState;

    @FindBy(xpath = ".//*[@id='client_state']")
    WebElement txtState;

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[5]/label")
    WebElement lblZipCode;

    @FindBy(xpath = ".//*[@id='client_zip']")
    WebElement txtZipCode;


    @FindBy (xpath="//span[@id='select2-client_country-container']")
    WebElement containerContry;
    //click

    @FindBy(xpath = ".//*[@id='content']/div/div[1]/fieldset/div[6]/label")
    WebElement lblCountry;


//    @FindBy(xpath = "//input[@class='select2-search__field']")
  @FindBy (xpath = "//input[@class='select2-search__field']")
    WebElement inputCountry;


    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/legend")
    WebElement lblContactInformation;



    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div[1]/label")
    WebElement lblphoneNumber;

    @FindBy(xpath = ".//*[@id='client_phone']")
    WebElement txtphoneNumber;

    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div[2]/label")
    WebElement lblFaxNumber;


    @FindBy(xpath = ".//*[@id='client_fax']")
    WebElement txtFaxNumber;

    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div[3]/label")
    WebElement lblMobileNumber;

    @FindBy(xpath = ".//*[@id='client_mobile']")
    WebElement txtMobileNumber;

    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div[4]/label")
    WebElement lblEmailAddress;

    @FindBy(xpath = ".//*[@id='client_email']")
    WebElement txtEmailAddress;
//set

    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div[5]/label")
    WebElement lblWebAddress;

    @FindBy(xpath = ".//*[@id='client_web']")
    WebElement txtWebAddress;

    @FindBy(xpath = ".//*[@id='content']/div/div[3]/fieldset/legend")
    WebElement lblTaxInformation;

    @FindBy(xpath = "//*[@id='content']/div/div[3]/fieldset/div[1]/label")
    WebElement lblVatId;

    @FindBy(xpath = ".//*[@id='client_vat_id']")
    WebElement txtVatId;

    @FindBy(xpath = ".//*[@id='content']/div/div[3]/fieldset/div[2]/label")
    WebElement lblTaxesInformation;


    @FindBy(xpath = ".//*[@id='content']/div/div[3]/fieldset/div[2]/label")
    WebElement lblTaxesCode;

    @FindBy(xpath = ".//*[@id='client_tax_code']")
    WebElement txtTaxesCode;


    @FindBy(xpath = ".//*[@id='btn-submit']")
    WebElement btnSave;

    WebDriver driver;

    public AddClient(WebDriver driver)
    {
        this.driver=driver;
        //   driver.get(url);
        PageFactory.initElements(driver, this);

        if(!lblClientForm.isDisplayed()){
            throw new IllegalStateException("This is not Add CLient Page");
        }
    }



    public String getTextPersonalInformation()

    {
        return lblPersonalInformation.getText();
    }



    public void setClientName(String clientName)

    {
        txtCleintName.sendKeys(clientName);
    }



    public String getTextAddress()
    {
        return lblAddress.getText();
    }

    public String getTextStreetAddress()

    {
        return lblStreetAddress.getText();
    }

    public void setStreetAddress(String StreetAddress)
    {
        txtStreetAddress.sendKeys(StreetAddress);
    }

    public String getTextStreetAddress2()
    {
        return lblStreetAddress2.getText();
    }

    public void setStreetAddress2(String StreetAddress2)
    {
        txtStreetAddress2.sendKeys(StreetAddress2);
    }

    public String getTextCity()
    {
        return lblCity.getText();
    }

    public void setCity(String City)
    {
        txtCity.sendKeys(City);
    }


    public String getTextState()
    {
        return lblState.getText();
    }

    public void setState(String State)
    {
        txtState.sendKeys(State);
    }

    public String getTextZipCode()
    {
        return lblZipCode.getText();
    }

    public void setZipCode(String ZipCode)
    {
        txtZipCode.sendKeys(ZipCode);
    }


    public void setCountry(String country)
    {
        containerContry.click();

             inputCountry.sendKeys(country);
    }


    public String getTextContactInformation()
    {
        return lblContactInformation.getText();
    }


    public String getTextPhoneNumber()
    {
        return lblphoneNumber.getText();
    }

    public void setPhoneNumber(String PhoneNumber)
    {
        txtphoneNumber.sendKeys(PhoneNumber);
    }


    public String getTextFaxNumber()
    {
        return lblFaxNumber.getText();
    }

    public void setFaxNumber(String FaxNumber)
    {
        txtFaxNumber.sendKeys(FaxNumber);
    }

    public String getTextMobileNumber()
    {
        return lblMobileNumber.getText();
    }

    public void setMobileNumber(String MobileNumber)
    {
        txtMobileNumber.sendKeys(MobileNumber);
    }

    public String getTextEmailAddress()
    {
        return lblEmailAddress.getText();
    }

    public void setEmailAddress(String EmailAddress)
    {
        txtEmailAddress.sendKeys(EmailAddress);
    }

    public String getTextWebAddress()
    {
        return lblWebAddress.getText();
    }

    public void setWebAddres(String WebAddress)
    {
        txtWebAddress.sendKeys(WebAddress);
    }


    public String getTextTaxesInformation()
    {
        return lblTaxesInformation.getText();
    }


    public String getTextVatId()
    {
        return lblVatId.getText();
    }

    public void setVatId(String VatId)
    {
        txtVatId.sendKeys(VatId);
    }

    public String getTextTaxesCode()
    {
        return lblTaxesCode.getText();
    }

    public void setTaxesCode(String TaxesCode)
    {
        txtTaxesCode.sendKeys(TaxesCode);
    }


    public void clickSave()
    {
        btnSave.click();
    }
}
