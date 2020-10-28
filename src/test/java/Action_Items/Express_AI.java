package Action_Items;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods;
import Reusable_Library.Reusable_Methods_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;



    public class Express_AI  extends Abstract_Class {
    //declare all the global variables outside of the methods
    //WebDriver driver;
    Workbook readableFile;
    Sheet readableSheet;
    WritableWorkbook writeableFile;
    WritableSheet writableSheet;
    int rowCount;
    public static ExtentReports reports;
    public static ExtentTest logger;
    private Object ExtentTest;
    private Object String;





    //Reusable_Methods_Loggers.getScreenShot();

    @Test
    public void Express_AI() throws InterruptedException, WriteException, IOException, BiffException {

        //capture the home page title and verify it matches the expected title
        String actualTitle = driver.getTitle();
        if (actualTitle == "https://www.express.com"){
            System.out.println("Title Matches");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//end of conditional statement

        for(int i = 1; i <= rowCount; i++) {
           String Size = writableSheet.getCell(0,i).getContents();
           String Quantity = writableSheet.getCell(1,i).getContents();
           String firstName = writableSheet.getCell(2,i).getContents();
           String lastName = writableSheet.getCell(3,i).getContents();
           String email = writableSheet.getCell(4,i).getContents();
           String phoneNum = writableSheet.getCell(5,i).getContents();
           String address = writableSheet.getCell(6,i).getContents();
           String zipCode = writableSheet.getCell(7,i).getContents();
           String City  = writableSheet.getCell(8,i).getContents();
           String State = writableSheet.getCell(9,i).getContents();
           String cardNumber = writableSheet.getCell(10,i).getContents();
           String expMonth = writableSheet.getCell(11,i).getContents();
           String expYear = writableSheet.getCell(12,i).getContents();
           String CVV = writableSheet.getCell(13,i).getContents();


            //Step 1. locate excel workbook
            readableFile = Workbook.getWorkbook(new File(("src/main/resources/Express_AI.xls")));
            //Step 2:Locate the excel sheet for this readable workbook
            readableSheet = readableFile.getSheet(0);
            //Step 3:Make a copy of the readable file
            writeableFile = Workbook.createWorkbook(new File("src/main/resources/Express_AI.xls"),readableFile);
            //Step 4: define writable sheet for the writable file
            writableSheet = writeableFile.getSheet(0);
            //Step 5: Get row count
            rowCount = writableSheet.getRows();


            //navigate to Express.com
            driver.manage().deleteAllCookies();
            driver.navigate().to("https://www.express.com");
            Thread.sleep(2000);

            //navigate to men's tab
           // Reusable_Methods_Loggers.clickByIndex();
            Reusable_Methods.click(driver, "//*[contains(@href='href=/mens-clothing/shirts/cat410008')]", "Shirts");
            Thread.sleep(2000);
            //select 3rd image



            //select quantity
            Reusable_Methods_Loggers.dropDownMenu(driver, "//*[@id='qdd-0-quantity']", Quantity, logger, "Quantity");
            //checkout
            Reusable_Methods_Loggers.click(driver,"//*[@id='continue-to-checkout']",logger,"Checkout");
            Thread.sleep(1000);
            //checkout as guest
            Reusable_Methods_Loggers.click(driver,"//*[@class='_1UFak _2YpK4 _1f9t- _2yrqS']",logger,"Checkout as Guest");
            Thread.sleep(2000);
            //first name
            Reusable_Methods_Loggers.click(driver,"//*[@name='firstname']",logger,"First Name");
            Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='firstname']",firstName,logger,"First Name");
            //last name
            Reusable_Methods_Loggers.click(driver,"//*[@name='lastname']",logger,"Last Name");
            Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='lastname']",lastName,logger,"Last Name");
            //email
           // Reusable_Methods_Loggers.click(driver,"//*[@");


        }//end of main method
        }//end of test

    //end of java class
    }



