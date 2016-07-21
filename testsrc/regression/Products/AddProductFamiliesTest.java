package regression.Products;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.Pages.Products.AddProductFamilies;
import com.InvoicePlane.Pages.Products.ProductFamilies;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 17/07/2016.
 */
public class AddProductFamiliesTest {
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

    @BeforeMethod
    public void doLogin()
    {
        Login login = new Login(driver,"http://billing.scriptinglogic.net");
        DashBoard dashBoard= login.LoginOperation("amolujagare@gmail.com","admin123");
    }

    @Test
    public void setProductFamilies()
    {
        Menu menu = new Menu(driver);
        menu.ClickProductfamilies();

        ProductFamilies obj=new ProductFamilies(driver);
        obj.clickNew();

        AddProductFamilies pf=new AddProductFamilies(driver);
        pf.setProductFamily("Health");
        pf.ClickSave();

    }
}
