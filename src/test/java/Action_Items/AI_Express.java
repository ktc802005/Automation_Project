package Action_Items;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;

public class AI_Express extends Abstract_Class {

    @Test
    public void validateMensShirt() throws Exception {

        //Step 1: locate the readable excel workbook
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Express_AI_Data1.xls"));
        //Step 2: locate the excel sheet for this workbook
        //Sheet readableSheet = readableFile.getSheet(0);
        //Step 3: make a copy of readable file to write back to the excel so it doesnt corrupt the original file
        WritableWorkbook writeableFile = Workbook.createWorkbook(new File("src/main/resources/Express_AI_Data1_Results.xls"),readableFile);
        //Step 4: define the writable sheet for writable file
        WritableSheet writableSheet = writeableFile.getSheet(0);
        //Step 5: get the count of the rows that are not empty on your excel workbook
        int rowCount = writableSheet.getRows();

        //all the test steps have to go inside for loop
        for(int i = 1;i < rowCount;i++) {

            driver.get("https://www.express.com/");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


            //capture the home page title and verify it matches the expected title
        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Men's and Women's")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }//end of conditional statement

        //Hover Mens
        Reusable_Methods_Loggers.mouseHover(driver,"//a[contains(@href,'/mens-clothing') and @role='menuitem']","Men");

        //click shirts using text property
        Reusable_Methods_Loggers.click(driver,"//a[text()='Shirts']",logger,"Shirts Link");

        Thread.sleep(5000);

        Reusable_Methods_Loggers.clickByIndex(driver,"//div[@class='L_d7U']",2,"Third Image");

        Thread.sleep(10000);




            //I need to get the content of the cell
            //column is hard coded and row is dynamic(i)
            String size = writableSheet.getCell(0, i).getContents();
            String quantity = writableSheet.getCell(1, i).getContents();
            String first_name = writableSheet.getCell(2, i).getContents();
            String last_name = writableSheet.getCell(3, i).getContents();

            String email = writableSheet.getCell(4, i).getContents();
            String phone = writableSheet.getCell(5, i).getContents();

            String address = writableSheet.getCell(6, i).getContents();
            String zipCode = writableSheet.getCell(7, i).getContents();
            String city = writableSheet.getCell(8, i).getContents();
            String state = writableSheet.getCell(9, i).getContents();
            String cardNumber = writableSheet.getCell(10, i).getContents();

            String exp_month = writableSheet.getCell(11, i).getContents();
            String exp_year = writableSheet.getCell(12, i).getContents();
            String cvv = writableSheet.getCell(13, i).getContents();



           /* if(i==2) {
                try {
                    Thread.sleep(5000);
                    System.out.println("1111111111111");
                    Reusable_Methods_Loggers.click(driver, "//body/div[4]/div[1]/div[1]/div[1]/div", logger, "click close btn");
                    System.out.println("1111111111111");
                    Thread.sleep(15000);
                    WebElement element1 = driver.findElement(By.xpath("//span[text()='"+size+"']"));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
                } catch (Exception e) {
                }
            }*/

            Reusable_Methods_Loggers.click(driver, "//span[text()='"+size+"']", logger, "Shirt Size");

            Thread.sleep(5000);

            Reusable_Methods_Loggers.click(driver, "//button[text()='Add to Bag']", logger, "Add to bag");

            Thread.sleep(5000);



            Reusable_Methods_Loggers.click(driver, "(//a[contains(text(),'View Bag')])[2]", logger, "click view bag");

            Thread.sleep(5000);

            Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@id='qdd-0-quantity']", quantity, logger, "select dropdown");
            Thread.sleep(5000);

            WebElement element = driver.findElement(By.xpath("//button[@id='continue-to-checkout']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(5000);

            Reusable_Methods_Loggers.click(driver, "//button[@id='continue-to-checkout']", logger, "click continue checkout button");

            Thread.sleep(5000);

            Reusable_Methods_Loggers.click(driver, "//button[text()='Checkout as Guest']", logger, "click checkout as guest button");

            Thread.sleep(5000);

            // Reusable_Methods_Loggers.click(driver," (//button[text()='Edit'])[2]",logger,"click edit for shipping and address button");

            // Thread.sleep(2000);



            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='firstname']", first_name, "First name");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='lastname']", last_name, "Last name");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='email']", email, "Email Address");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='confirmEmail']", email, "Conform Email Address");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='phone']", phone, "Phone number");

            Reusable_Methods_Loggers.click(driver, "//button[@type='submit']", logger, "click continue button");


            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='shipping-firstName']", first_name, "First name");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='shipping.lastName']", last_name, "Last name");
            Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name='shipping.countryCode']", "United States", logger, "Country name");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='shipping.line1']", address, "Address name");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='shipping.postalCode']", zipCode, "Postal code");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='shipping.city']", city, "City name");
            Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name='shipping.state']", state, logger, "State name");

            Reusable_Methods_Loggers.click(driver, "//button[@type='submit']", logger, "click continue button");
            Thread.sleep(2000);
            Reusable_Methods_Loggers.click(driver, "//button[@type='submit']", logger, "click delivery continue button");
            Thread.sleep(3000);

            Reusable_Methods_Loggers.click(driver, "//a/strong[text()='NO, THANK YOU']", logger, "click no thanks");

            Thread.sleep(4000);
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='creditCardNumber']", cardNumber, "Card number");
            Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name='expMonth']", exp_month, logger, "month");
            Reusable_Methods_Loggers.dropDownMenu(driver, "//select[@name='expYear']", exp_year, logger, "year");
            Reusable_Methods_Loggers.typeAndSubmit(driver, "//input[@name='cvv']", cvv, "cvv");

            Thread.sleep(2000);
            Reusable_Methods_Loggers.click(driver, "//button[@type='submit']", logger, "click place order button");

            String actual = Reusable_Methods_Loggers.captureResult(driver, "//*[@id=\"rvn-note-NaN\"]", logger, "capture error message");



            //driver.quit();

            //store and send it to the empty column in excel writable file
            Label label = new Label(14,i,actual);
            //adding this label to the writable sheet
            writableSheet.addCell(label);


        }

        writeableFile.write();
        writeableFile.close();



    }

//end of java class
}



