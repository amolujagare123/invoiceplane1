package regression.Clients;

import com.InvoicePlane.Pages.Clients.AddClient;
import com.InvoicePlane.Pages.DashBoard;
import com.InvoicePlane.Pages.Login;
import com.InvoicePlane.Pages.Menu;
import com.InvoicePlane.utilities.Driver;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import static com.InvoicePlane.utilities.Driver.getDriver;

/**
 * Created by dell on 19/06/2016.
 */


public class AddClientTest {
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

    @BeforeMethod
    public void doLogin() {
        Login login = new Login(driver, "http://localhost/invoiceplane/index.php/sessions/login");
        DashBoard dashBoard = login.LoginOperation("renukakhate@gmail.com", "renuka123");


    }

    @Test (dataProvider = "getAddClientData")
    public void addClientTest(String clientName, String StreetAddress1, String StreetAddress2,String City,String State,String Zipcode,String Country,String PhoneNumber,String FaxNumber,String MobileNumber,String EmailAddress,String WebAddress,String VatId,String TaxCode) throws InterruptedException {

        Menu menu = new Menu(driver);

        menu.clickaddclient();

        AddClient addClient = new AddClient(driver);
        addClient.setClientName(clientName);
        addClient.setStreetAddress(StreetAddress1);
        addClient.setStreetAddress2(StreetAddress2);
        addClient.setCity(City);
        addClient.setState(State);
        addClient.setZipCode(Zipcode);
        addClient.setCountry(Country);
        addClient.setPhoneNumber(PhoneNumber);
        addClient.setFaxNumber(FaxNumber);
        addClient.setMobileNumber(MobileNumber);
        addClient.setEmailAddress(EmailAddress);
        addClient.setWebAddres(WebAddress);
        addClient.setVatId(VatId);
        addClient.setTaxesCode(TaxCode);
        System.out.println("Saving the record");
        Thread.sleep(3000);
        System.out.println("After sleep");
        addClient.clickSave();

        System.out.println("Record Saved");

    }


    @Test
    public void trail() {

        Menu menu = new Menu(driver);

        menu.clickaddclient();

        AddClient addClient = new AddClient(driver);


        addClient.clickSave();


        String resultText = "Record successfully created";


        Assert.assertEquals("[fail] The given information submitted successfully", resultText, addClient.getTextSuccessMsg());


    }


    @DataProvider
    public Object[][] getAddClientData() {
        //Rows - Number of times your test has to be repeated.
        //Columns - Number of parameters in test data.
        //Object[][] data = new Object[4][14];
        String[][] data = new String[5][14];

        try {
            FileInputStream fileInputStream = new FileInputStream("testdata/InvoicePlane-Test-Data.xls");

            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            HSSFSheet worksheet = workbook.getSheet("add client");

            int rowCount = worksheet.getPhysicalNumberOfRows();


            for (int i = 1; i < rowCount; i++)
            {
                HSSFRow row = worksheet.getRow(i);

                HSSFCell clientName = row.getCell(0);
                data[i][0] = ""+clientName.getStringCellValue();

                HSSFCell StreetAddress1 = row.getCell(1);
                data[i][1] = ""+StreetAddress1.getStringCellValue();

                HSSFCell StreetAddress2 = row.getCell(2);
                data[i][2] = ""+StreetAddress2.getStringCellValue();

                HSSFCell City = row.getCell(3);
                data[i][3] = ""+City.getStringCellValue();

                HSSFCell State = row.getCell(4);
                data[i][4] = ""+State.getStringCellValue();

                HSSFCell Zipcode = row.getCell(5);
                data[i][1] = ""+Zipcode.getNumericCellValue();

                HSSFCell Country = row.getCell(6);
                data[i][6] = ""+Country.getStringCellValue();

                HSSFCell PhoneNumber = row.getCell(7);
                data[i][7] = ""+PhoneNumber.getNumericCellValue();

                HSSFCell FaxNumber = row.getCell(8);
                data[i][8] = ""+FaxNumber.getNumericCellValue();

                HSSFCell MobileNumber = row.getCell(9);
                data[i][9] = ""+MobileNumber.getNumericCellValue();

                HSSFCell EmailAddress = row.getCell(10);
                data[i][10] = ""+EmailAddress.getStringCellValue();

                HSSFCell WebAddress = row.getCell(11);
                data[i][11] = ""+WebAddress.getStringCellValue();

                HSSFCell VATID = row.getCell(12);
                data[i][12] = ""+VATID.getNumericCellValue();

                HSSFCell TaxCode = row.getCell(13);
                data[i][13] = ""+TaxCode.getNumericCellValue();


                // System.out.println("username:" + a1Val+", Password:" + a2Val);
            }

        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }


        catch (IOException e)
        {
            e.printStackTrace();
        }


        return data;
    }


}

