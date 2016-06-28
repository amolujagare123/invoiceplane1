package regression.Quotes;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Invoices.CreateInvoice;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.text.ParseException;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by RENU on 6/28/2016.
 */
public class CreateInvoiceTest {

    WebDriver driver;


    @Test
    public void setDateTest() throws ParseException {
        driver = getDriver(Driver.DriverTypes.CHROME);
        Login login = new Login(driver, "http://billing.scriptinglogic.net");
        DashBoard dashBoard = login.LoginOperation("amolujagare@gmail.com", "admin123");


        Menu menu = new Menu(driver);
        menu.ClickCreateInvoice();
        CreateInvoice cq = new CreateInvoice(driver);
        cq.setInvoiceDate("13/09/2016");


    }
}