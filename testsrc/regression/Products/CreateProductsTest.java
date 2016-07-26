package regression.Products;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.Pages.Products.CreateProduct;
import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 19/06/2016.
 */
public class CreateProductsTest {
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

    @BeforeMethod
    public void doLogin()
    {
        Login login = new Login(driver,"http://billing.scriptinglogic.net");
        DashBoard dashBoard= login.LoginOperation("amolujagare@gmail.com","admin123");
    }

    @Test
    public  void createProductTest() {

        Menu menu = new Menu(driver);
        menu.ClickCreateProduct();

        CreateProduct createPro=new CreateProduct(driver);
        createPro.setFamily("Medicine");
        createPro.setSKU("123");
        createPro.setProductName("Bag");
        createPro.setProductDesc("Skybag");
        createPro.setPrice("1000");
        createPro.setTaxrate("None");
        createPro.setPurchaseprice("999");
        createPro.ClickSave();
    }

}
