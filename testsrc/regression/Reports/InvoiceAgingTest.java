package regression.Reports;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 19/06/2016.
 */
public class InvoiceAgingTest {
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

    @BeforeMethod
    public void doLogin()
    {
        Login login = new Login(driver,"http://billing.scriptinglogic.net");
        DashBoard dashBoard= login.LoginOperation("amolujagare@gmail.com","admin123");
    }
}
