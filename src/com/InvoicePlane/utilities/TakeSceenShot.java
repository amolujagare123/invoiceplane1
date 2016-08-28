package com.InvoicePlane.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dell on 15/08/2016.
 */
public class TakeSceenShot {
    public static String takeScreenshot(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String DateStr = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
        String imageName = "Extended-reports" + DateStr + ".png";
        String imagePath = "Extended-reports/screenshots/" + imageName;
        FileUtils.copyFile(scrFile, new File(imagePath));

        return imageName;

    }
}
