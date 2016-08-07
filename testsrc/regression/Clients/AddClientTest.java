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
import org.apache.poi.ss.usermodel.Cell;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.io.Zip;
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


/*
    @Test
    public void trail() {

        Menu menu = new Menu(driver);

        menu.clickaddclient();

        AddClient addClient = new AddClient(driver);


        addClient.clickSave();


        String resultText = "Record successfully created";


        Assert.assertEquals("[fail] The given information submitted successfully", resultText, addClient.getTextSuccessMsg());


    }
*/


    @DataProvider
    public Object[][] getAddClientData() {
        //Rows - Number of times your test has to be repeated.
        //Columns - Number of parameters in test data.
        //Object[][] data = new Object[4][14];
       // String[][] data = new String[6][14];
        String[][] data={{""},{""}};
        try {
            FileInputStream fileInputStream = new FileInputStream("testdata/InvoicePlane-Test-Data.xls");

            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            HSSFSheet worksheet = workbook.getSheet("add client");

            int rowCount = worksheet.getPhysicalNumberOfRows();
           System.out.println(rowCount);
              data = new String[rowCount-1][14];
            //System.out.println(rowCount);

            for (int i = 1; i < rowCount; i++)
            {
                HSSFRow row = worksheet.getRow(i);
               // System.out.println(rowCount);

                HSSFCell clientName = row.getCell(0);
                if(clientName==null)
                    data[i-1][0] = "";
                else
                    data[i-1][0] = ""+clientName.getStringCellValue();

                HSSFCell StreetAddress1 = row.getCell(1);
                if(StreetAddress1==null)
                    data[i-1][1] = "";
                else
                data[i-1][1] = ""+StreetAddress1.getStringCellValue();

                HSSFCell StreetAddress2 = row.getCell(2);
                if(StreetAddress2==null)
                    data[i-1][2] = "";
                else
                    data[i-1][2] = ""+StreetAddress2.getStringCellValue();

                HSSFCell City = row.getCell(3);
                if(City==null)
                    data[i-1][3] = "";
                else
                    data[i-1][3] = ""+City.getStringCellValue();

                HSSFCell State = row.getCell(4);
                if(State==null)
                    data[i-1][4] = "";
                else
                    data[i-1][4] = ""+State.getStringCellValue();

                HSSFCell Zipcode = row.getCell(5);
                if(Zipcode==null)
                    data[i-1][5] = "";
                else {
                    Zipcode.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][5] = "" + Zipcode.getStringCellValue();
                }
                HSSFCell Country = row.getCell(6);
                if(Country==null)
                    data[i-1][6] = "";
                else
                    data[i-1][6] = ""+Country.getStringCellValue();

                HSSFCell PhoneNumber = row.getCell(7);
                if(PhoneNumber==null)
                    data[i-1][7] = "";
                else {
                    PhoneNumber.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][7] = "" + PhoneNumber.getStringCellValue();
                }

                HSSFCell FaxNumber = row.getCell(8);
                if(FaxNumber==null)
                    data[i-1][8] = "";
                else {
                    FaxNumber.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][8] = "" + FaxNumber.getStringCellValue();
                }

                HSSFCell MobileNumber = row.getCell(9);
                if(MobileNumber==null)
                    data[i-1][9] = "";
                else {
                    MobileNumber.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][9] = "" + MobileNumber.getStringCellValue();
                }

                HSSFCell EmailAddress = row.getCell(10);
                if(EmailAddress==null)
                    data[i-1][10] = "";
                else
                    data[i-1][10] = ""+EmailAddress.getStringCellValue();

                HSSFCell WebAddress = row.getCell(11);
                if(WebAddress==null)
                    data[i-1][11] = "";
                else
                    data[i-1][11] = ""+WebAddress.getStringCellValue();

                HSSFCell VATID = row.getCell(12);
                if(VATID==null)
                    data[i-1][12] = "";
                else {
                    VATID.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][12] = "" + VATID.getStringCellValue();
                }

                HSSFCell TaxCode = row.getCell(13);
                if(TaxCode==null)
                    data[i-1][13] = "";
                else {
                    TaxCode.setCellType(Cell.CELL_TYPE_STRING);

                    data[i - 1][13] = "" + TaxCode.getStringCellValue();
                }

                // System.out.println("username:" + a1Val+", Password:" + a2Val);
            }

//            return data;

        }


        catch (Throwable e)
        {
            e.printStackTrace();
        }





//        catch (WebDriverException e)
//        {
//            e.printStackTrace();
//        }


        return data;

    }

}

