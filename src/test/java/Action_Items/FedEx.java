package Action_Items;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FedEx extends Abstract_Class {

    @Test
    public void validateFedEx() throws Exception {

            driver.get("https://www.fedex.com/en-us/home.html");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            Reusable_Methods_Loggers.click(driver, "//a/span[contains(text(),'Design & Print')]", logger, "design and pattern");

            Reusable_Methods_Loggers.click(driver, "//a[text()='Upload a Print-Ready File']", logger, "upload print ready file");


            //capture the page title and verify it matches the expected title
            String actualTitle = driver.getTitle();

            if (actualTitle.contains("FedEx Office Print Online")){
                logger.log(LogStatus.PASS,"Expected titile found");
                Assert.assertTrue(true);
            } else {
                logger.log(LogStatus.FAIL,"Expected title not found");
                Assert.assertTrue(false);
            }//end of conditional statement


            try{
                Reusable_Methods_Loggers.click(driver, "//area[@alt='no']", logger, "click unexpected alert");
            }catch(Exception e){
                logger.log(LogStatus.INFO,"Expected title not found");
            }

            Thread.sleep(10000);

            Reusable_Methods_Loggers.click(driver, "//a[@title='Document Printing']", logger, "upload print ready file");
            Reusable_Methods_Loggers.click(driver, "//img[@title='Copies & Custom Projects']", logger, "upload print ready file");

            Thread.sleep(5000);

            Reusable_Methods_Loggers.click(driver, "//a[@name='upload-files-button']", logger, "browse file");

            Thread.sleep(5000);

            Reusable_Methods_Loggers.uploadFile("/Users/kennethtcarter/Desktop/design.jpg");

            Thread.sleep(5000);
    }

//end of java class
}



