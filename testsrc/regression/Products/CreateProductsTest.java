package regression.Products;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.Pages.Products.CreateProduct;
import com.InvoicePlane.utilities.DbCon;
import com.InvoicePlane.utilities.Driver;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;

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
        public  void createProductTest() throws ClassNotFoundException, SQLException {

            Menu menu = new Menu(driver);
            menu.ClickCreateProduct();

        String familyExpected = "Medicines";
        String skuExpected="456";
        String prooductnmExpected="Bag";
        String productdescExpected="Skybag";
        String priceExpected="1000";
        String TaxrateExpected="None";
        String purchasepriceExpected="999";

        ArrayList<String> Expectedlist =new ArrayList<String>();
        Expectedlist.add(familyExpected);
        Expectedlist.add(skuExpected);
        Expectedlist.add(prooductnmExpected);
        Expectedlist.add(productdescExpected);
        Expectedlist.add(priceExpected);
        Expectedlist.add(TaxrateExpected);
        Expectedlist.add(purchasepriceExpected);

        CreateProduct createPro=new CreateProduct(driver);
        createPro.setFamily(familyExpected);
        createPro.setSKU(skuExpected);
        createPro.setProductName(prooductnmExpected);
        createPro.setProductDesc(productdescExpected);
        createPro.setPrice(priceExpected);
        createPro.setTaxrate(TaxrateExpected);
        createPro.setPurchaseprice(purchasepriceExpected);
        createPro.ClickSave();

        for(int i=0;i<Expectedlist.size();i++)
        {
            System.out.println("Product Information:" + Expectedlist.get(i));
        }

        Connection con;
        Statement stmt;
        ResultSet rs = null;
        String sql;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/invoiceplane", "root", "root");
        stmt = con.createStatement();

        ArrayList<String> ActualList=new ArrayList<String>();
        sql="Select * from ip_products where product_name= ";

        String familyActual;
        String skuActual;
        String productnmActual;
        String productdescActual;
        String priceActual;
        String TaxrateActual;
        String purchasepriceActual;

        while (rs.next())
        {
                familyActual=rs.getString("family_id");
                skuActual=rs.getString("product_sku");
                productnmActual=rs.getString("product_name");
                productdescActual=rs.getString("product_description");
                priceActual=rs.getString("product_price");
                TaxrateActual=rs.getString("tax_rate_id");
                purchasepriceActual=rs.getString("purchase_price");

                ActualList.add(familyActual);
                ActualList.add(skuActual);
                ActualList.add(productnmActual);
                ActualList.add(productdescActual);
                ActualList.add(priceActual);
                ActualList.add(purchasepriceActual);
                ActualList.add(TaxrateActual);
        }
        System.out.println("Query Executed");
        Assert.assertEquals("fail ", Expectedlist, ActualList);


    }


}
