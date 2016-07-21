package regression.Reports;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.text.ParseException;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 19/06/2016.
 */
public class SalesByDateTest {
    WebDriver driver;

    @Test
    public void setDateTest() throws ParseException {
        driver = getDriver(Driver.DriverTypes.CHROME);
        Login login = new Login(driver, "http://billing.scriptinglogic.net");
        DashBoard dashBoard = login.LoginOperation("amolujagare@gmail.com", "admin123");

        Menu menu = new Menu(driver);
    }
}
