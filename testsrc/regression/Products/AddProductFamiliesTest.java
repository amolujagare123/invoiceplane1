package regression.Products;

import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.Pages.Products.AddProductFamilies;
import com.InvoicePlane.Pages.Products.ProductFamilies;
import com.InvoicePlane.utilities.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.InvoicePlane.utilities.Driver.getDriver;
import static com.InvoicePlane.utilities.TakeSceenShot.takeScreenshot;

/**
 * Created by dell on 17/07/2016.
 */
public class AddProductFamiliesTest {
      WebDriver driver = getDriver(Driver.DriverTypes.CHROME);


    @BeforeClass
    public void doLogin()
    {
        Login login = new Login(driver,"http://billing.scriptinglogic.net");
        //localhost/invoiceplane
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        DashBoard dashBoar = login.LoginOperation("amolujagare@gmail.com","admin123");
    }

    @Test (dataProvider = "getFamiliesData")
    public void CheckFamilyGetsAdded(String ProductFamilies,String Xpathofactualresult,String ExpectedResult) throws IOException {
        ExtentReports logger = new ExtentReports("Extended-reports/report.html", false);
        ExtentTest test = logger.startTest("Add Families TestExpected result " + ExpectedResult, "To test save button functinality Expected result " + ExpectedResult);
        try
        {
        test.log(LogStatus.INFO, "Browser is running");
        System.out.println("Product Families:" + ProductFamilies + ", Xpath:" + Xpathofactualresult + " , Message: " + ExpectedResult);

        String title = driver.getTitle();
        test.log(LogStatus.INFO, "Title captured");



            Menu menu = new Menu(driver);
            menu.ClickProductfamilies();

            ProductFamilies obj = new ProductFamilies(driver);
            obj.clickNew();

            AddProductFamilies pf = new AddProductFamilies(driver);
            pf.setProductFamily(ProductFamilies);
            pf.ClickSave();
            try {
                Assert.assertEquals(driver.findElement(By.xpath(Xpathofactualresult)).getText(), ExpectedResult);
                test.log(LogStatus.PASS, "Family added successfully");
            } catch (Throwable t) {
                test.log(LogStatus.FAIL, "Family not added Expeced  :" + ExpectedResult + " But Actual : " + driver.findElement(By.xpath(Xpathofactualresult)).getText());
                test.log(LogStatus.INFO, "Screenshot Below :" + test.addScreenCapture("./screenshot/" + takeScreenshot(driver)));
            }

            test.log(LogStatus.INFO, "Product Family gets added");
            logger.endTest(test);
            logger.flush();
        }catch (AssertionError t)
        {
            test.log(LogStatus.ERROR,"Error"+t);
            test.log(LogStatus.INFO, "Screenshot Below :" + test.addScreenCapture("./screenshot/" + takeScreenshot(driver)));
        }
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
                System.out.println("Product Families:" + data[i-1][0] + ", Xpath:" + data[i-1][1] +" , Message: " + data[i-1][2]);

            }

        } catch (Throwable e) {
            e.printStackTrace();
        }
        return data;

    }

/*
    @AfterMethod
    public void afterRun()
    {
        driver.close();
    }
*/

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
