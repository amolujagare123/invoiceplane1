package regression.Clients;

import com.InvoicePlane.Pages.Clients.AddClient;
import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 19/06/2016.
 */


public class AddClientTest
{
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

        @BeforeMethod
    public void doLogin()
    {
        Login login = new Login(driver,"http://billing.scriptinglogic.net");
        DashBoard dashBoard= login.LoginOperation("amolujagare@gmail.com","admin123");


    }

    @Test
    public  void addClientTest()
    {

        Menu menu =  new Menu(driver);

        menu.clickaddclient();

        AddClient addClient = new AddClient(driver);
        addClient.setClientName("Renuka Khate");
        addClient.setStreetAddress("katraj");
        addClient.setStreetAddress2("Dattanagar");
        addClient.setCity("Pune");
        addClient.setState("Maharashtra");
        addClient.setZipCode("411009");
        addClient.setCountry("India");
        addClient.setPhoneNumber("9890878689");
        addClient.setFaxNumber("12345");
        addClient.setMobileNumber("9876545678");
        addClient.setEmailAddress("renukakhate@gmail.com");
        addClient.setWebAddres("");
        addClient.setVatId("1234");
        addClient.setTaxesCode("7654");

addClient.clickSave();


    }
}
