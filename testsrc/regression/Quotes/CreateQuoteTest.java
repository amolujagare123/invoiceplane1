package regression.Quotes;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Invoices.CreateInvoice;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.InvoicePlane.Pages.Quotes.CreateQuote;

import java.text.ParseException;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by RENU on 6/26/2016.
 */
public class CreateQuoteTest
{
    WebDriver driver;



    @Test
    public void setDateTest() throws ParseException
    {
        driver = getDriver(Driver.DriverTypes.CHROME);
        Login login = new Login(driver,"http://localhost/invoiceplane/index.php/sessions/login");
        DashBoard dashBoard= login.LoginOperation("renukakhate@gmail.com","renuka123");

        Menu menu =  new Menu(driver);
        menu.ClickCreateQuote();
        CreateQuote cq= new CreateQuote(driver);
        cq.setQuotedate("13/08/2016");

       // cq.setClient("Vaishali");
        cq.setQuotePDFpassword("Renu");
       cq.setInvoiceGroup("Quote Default");

        cq.ClickSubmit();

        String resultText="Record successfully created";


        Assert.assertEquals("[fail] The given information submitted successfully", resultText, cq.getTextSuccessMessage());



    }
}
