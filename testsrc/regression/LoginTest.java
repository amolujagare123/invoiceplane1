package regression;

import com.InvoicePlane.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import static com.InvoicePlane.utilities.Driver.getDriver;


/**
 * Created by amol on 14/06/2016.
 */

public class LoginTest {
    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);
    @Test
    public void login() {
        driver.manage().window().maximize();
        driver.get("http://clinic.scriptinglogic.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='login_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@value='Enter']")).click();
        boolean logoutLinkDisplayed = driver.findElement(By.linkText("Logout")).isDisplayed();
        Assert.assertEquals(true, logoutLinkDisplayed, "Login Failed");
        driver.quit();
    }
}
