package Action_Items;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods;
import Reusable_Library.Reusable_Methods_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import gherkin.lexer.Th;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class USAA extends Abstract_Class {
    @Test
            public void USAA_TestCase() throws InterruptedException {


        driver.manage().deleteAllCookies();
        driver.get("https://www.usaa.com");

        // register an account
        Reusable_Methods_Loggers.clickByIndex(driver,"//*[@class ='navStandard-menuLink']",2,"join Usaa",logger);
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@class='cta-major secondary']",logger,"Join Usaa");
        Thread.sleep(2000);



        Reusable_Methods_Loggers.click(driver,"//*[@class ='usaa-button4 usaa-button4--hollow']",logger,"Continue");

        //Reusable_Methods.mouseHover(driver,"//*[@name ='firstName']","Continue");
        //Reusable_Methods.click(driver,"//*[@name ='firstName']","Continue");
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name ='firstName']","Kenneth",logger,"first name");
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name ='lastName']","Carter",logger, "last name");
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name ='birthDate']","08121990",logger,"birthDate");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 350);");
        Thread.sleep(2000);
        //Reusable_Methods.click(driver,"//*[text() ='Next']","Continue");
        Reusable_Methods_Loggers.click(driver,"//*[@type ='submit']",logger,"Next");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='con-x']")).click();
        Thread.sleep(3000);
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name ='email']","carterkenneth1@icloud.com",logger,"phone number");
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@type = 'tel']","718-555-5555",logger,"email");


        Thread.sleep(1000);
        Reusable_Methods_Loggers.click(driver,"//*[@type ='submit']",logger,"submit");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@class = 'col-md-1-2']",logger,"me checkbox");
        Reusable_Methods_Loggers.click(driver,"//*[@type ='submit']",logger,"Next");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@class ='usaa-select-browserSelect']", "U.S. Navy",logger,"Branch");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name ='selfStatus']", "Separated",logger,"Status");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name ='selfRank']", "E4 - Petty Officer Third Class",logger,"Rank");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name ='selfDischargeType']", "Honorable",logger,"Discharge Type");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name = 'selfStartDate']","042000",logger,"Enlistment Date");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name = 'selfEndDate']","042013",logger,"Separation Date");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.click(driver,"//*[@type ='submit']",logger,"Next");
        Thread.sleep(5000);

        Reusable_Methods_Loggers.click(driver, "//input[@name='mailingCitizen']//following-sibling::label[text() = 'Yes']",logger,"U.S. Citizen?");
        Thread.sleep(3000);
        Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name = 'mailingMarital']","Married",logger,"Marital Status");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name='mailingGender']","Male",logger,"Gender");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name ='mailingAddressLine1']","20 Water Grant St.",logger,"Address");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name = 'mailingZipCode']","10701",logger,"Zip Code");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.click(driver, "//input[@name = 'hasSamePhysicalAddress']//following-sibling::label[text() = 'Yes']",logger,"Yes");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.click(driver,"//*[@type = 'submit']",logger,"Next");
        Thread.sleep(5000);
        Reusable_Methods_Loggers.click(driver,"//*[@class = 'usaa-checkbox']",logger,"No SSN");
        Thread.sleep(1000);
        Reusable_Methods_Loggers.click(driver,"(//label[contains(text(),'have one')])[2]",logger,"checkbox");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@type = 'submit']",logger,"Next");


    }//end of main method
}//end of java class
