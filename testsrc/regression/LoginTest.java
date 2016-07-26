package regression;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import static com.InvoicePlane.utilities.Driver.getDriver;


/**
 * Created by amol on 14/06/2016.
 */

public class LoginTest
{
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);
    ResourceBundle dbDetails = ResourceBundle.getBundle("InvoicePlane");
    String url=dbDetails.getString("url");
    @Test
    public void login()
    {
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


       Login login=new Login(driver,url);
        DashBoard dashBoard=login.LoginOperation("vedujagtap187@gmail.com","Vedashree187");
        driver.quit();

//         Login login = new Login(driver,url);
//        DashBoard dashBoard= login.LoginOperation("amolujagare@gmail.com","admin123");
//
//        driver.quit();

    }
}
