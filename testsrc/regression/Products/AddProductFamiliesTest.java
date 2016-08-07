package regression.Products;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.Pages.Products.AddProductFamilies;
import com.InvoicePlane.Pages.Products.ProductFamilies;
import com.InvoicePlane.utilities.Driver;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
        //localhost/invoiceplane
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        DashBoard dashBoard= login.LoginOperation("amolujagare@gmail.com","admin123");
    }

    @Test (dataProvider = "getFamiliesData")
    public void CheckFamilyGetsAdded(String ProductFamilies,String Xpathofactualresult,String ExpectedResult)
    {
        Menu menu = new Menu(driver);
        menu.ClickProductfamilies();

        ProductFamilies obj=new ProductFamilies(driver);
        obj.clickNew();

        AddProductFamilies pf=new AddProductFamilies(driver);
        pf.setProductFamily(ProductFamilies);
        pf.ClickSave();
//        String resultExpected ="Record successfully created";
//        String resultActual=pf.getrecordAdded();
//        Assert.assertEquals(resultActual,resultExpected,"Test failed");
    }

    @DataProvider
    public String[][] getFamiliesData() {
        String[][] data = null;
        try

        {
            FileInputStream fileInputStream = new FileInputStream("Data ExcelSheets/ProductFamilies.xls");

            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            HSSFSheet worksheet = workbook.getSheet("Sheet1");

            int rowCount = worksheet.getPhysicalNumberOfRows();
            System.out.println(rowCount);

            data = new String[rowCount-1][3];

            for (int i = 1; i < rowCount; i++) {
                HSSFRow row = worksheet.getRow(i);
                HSSFCell familyCell = row.getCell(0);
                if(familyCell==null)
                {
                    data[i-1][0] ="";
                }
                else
                data[i-1][0] = familyCell.getStringCellValue();

                HSSFCell xpathActualCell = row.getCell(1);
                if(xpathActualCell==null)
                    data[i-1][1] ="";
                else
                    data[i-1][1] = xpathActualCell.getStringCellValue();

                HSSFCell expectedResultCell = row.getCell(2);
                if(expectedResultCell==null)
                    data[i-1][2]="";
                else
                data[i-1][2] = expectedResultCell.getStringCellValue();

                System.out.println("Product Families:" + familyCell + ", Xpath:" + xpathActualCell +" , Message: " + expectedResultCell);

            }


        } catch (Throwable e) {
            e.printStackTrace();
        }
        return data;

    }


//    @Test
//    public void CheckExistedFamily()
//    {
//        Menu menu = new Menu(driver);
//        menu.ClickProductfamilies();
//
//        AddProductFamilies pf=new AddProductFamilies(driver);
//        pf.setProductFamily("ABC");
//        pf.ClickSave();
//        String resultExpected ="Family already exists!";
//        String resultActual=pf.getexistedRecord();
//        Assert.assertEquals(resultActual, resultExpected, "Test failed");
//
//    }
}
