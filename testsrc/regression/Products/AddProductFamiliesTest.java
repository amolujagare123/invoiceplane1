package regression.Products;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.Pages.Products.AddProductFamilies;
import com.InvoicePlane.Pages.Products.ProductFamilies;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 17/07/2016.
 */
public class AddProductFamiliesTest {
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);
    AddProductFamilies pf=new AddProductFamilies(driver);

    @BeforeMethod
    public void doLogin()
    {
        Login login = new Login(driver,"http://billing.scriptinglogic.net");
        //localhost/invoiceplane
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
        pf.setProductFamily("ABC");
        pf.ClickSave();

    }
    @Test
    public void CheckFamilyExists()
    {
        Menu menu = new Menu(driver);
        menu.ClickProductfamilies();

        ProductFamilies obj=new ProductFamilies(driver);
        obj.clickNew();

        String NewFamilyName=pf.getFamilyName();

    }

    @Test
    public void CheckFamilyGetsAdded()
    {

        }
}
