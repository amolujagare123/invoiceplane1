package regression;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.ForgotPassword;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 19/06/2016.
 */
public class ForgotPAsswordTest {
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

    @Test
    public void  resetPasswordTest()
    {

        ResourceBundle dbDetails = ResourceBundle.getBundle("InvoicePlane");
        String url=dbDetails.getString("url");
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Login login=new Login(driver,url);
        login.clickForgotPassword();

        ForgotPassword fp=new ForgotPassword(driver);
        DashBoard dashBoard=fp.setEmail("amolujagare@gmail.com");

        fp.clickReset();

    }
}
