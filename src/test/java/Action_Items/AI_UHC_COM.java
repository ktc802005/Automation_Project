package Action_Items;


import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_UHC_COM {
    public static void main(String[] args) throws InterruptedException {
        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //setting the chrome options before defining the driver
        ChromeOptions options = new ChromeOptions();
        //set the driver to be maximized
        options.addArguments("start-maximized");
        //set the driver to be incognito mode(private)
        options.addArguments("incognito");
        //run the driver in headless mode
        //options.addArguments("headless");

        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver(options); //options variable should be passed here

        ArrayList<String> firstname = new ArrayList<>();
        firstname.add("Kenny");
        firstname.add("john");
        firstname.add("mike");

        ArrayList<String> lastname = new ArrayList<>();
        lastname.add("carter");
        lastname.add("johnson");
        lastname.add("alston");

        ArrayList<String> ssn = new ArrayList<>();
        ssn.add("123456");
        ssn.add("234567");
        ssn.add("345678");

        ArrayList<String> month = new ArrayList<>();
        month.add("January");
        month.add("February");
        month.add("March");

        ArrayList<String> Day = new ArrayList<>();
        Day.add("01");
        Day.add("02");
        Day.add("03");

        ArrayList<String> Year = new ArrayList<>();
        Year.add("1990");
        Year.add("1991");
        Year.add("1992");

        ArrayList<String> Zipcode = new ArrayList<>();
        Zipcode.add("10701");
        Zipcode.add("10702");
        Zipcode.add("11239");




        //tell driver to go to website
        driver.navigate().to("https://www.uhc.com");
        driver.manage().window().maximize();

        //capture the home page title and verify it matches the expected title
        String actualTitle = driver.getTitle();
        //verify it matches the expected title
        if (actualTitle == "https://www.uhc.com"){
            System.out.println("Title Matches");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//end of conditional statement
        for (int i = 0;i < firstname.size();i++) {
            driver.navigate().to("https://www.uhc.com");
            driver.manage().window().maximize();
            //define the element
            ////set up to click on 'find a doctor link'
            Reusable_Methods.click(driver, "//*[text()='Find a Doctor']", "find a doctor");
            Thread.sleep(2000);

            //define the element
            //set up to click on 'find a provider'
            Reusable_Methods.click(driver, "//*[@id='btn-sign-in']", "find a provider");
            Thread.sleep(2000);

            //need to store get window handles command in as ArrayList to switch tab(s)
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            //switch to second tab
            driver.switchTo().window(tabs.get(1));

            //click on register button
            Reusable_Methods.click(driver, "//*[@id='registerbutton']", "click on register button");
            Thread.sleep(2000);

            //enter value in first name element, this is where you pass the firstName.get(i)
            Reusable_Methods.sendKeys(driver, "//*[@id='firstName']", firstname.get(i),"first name");

            //enter value in last name element
            Reusable_Methods.sendKeys(driver, "//*[@id='lastName']", lastname.get(i),"last name");


            //enter value for DOB element in xx/xx/xxxx format
            Reusable_Methods.dropDownMenu(driver,"//*[@id='dob_month_input']", month.get(i),"month");


            Reusable_Methods.sendKeys(driver,"//*[@id='dob_day']", Day.get(i),"Day");


            Reusable_Methods.sendKeys(driver,"//*[@id='dob_year']",Year.get(i),"Year");


            //need to scroll to the bottom of the page to capture the search result
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            //scroll down using executeScript command
            jse.executeScript("scroll(0,1000)");
            Thread.sleep(1000);

            //click on ssn
            Reusable_Methods.click(driver,"//*[@id='ssn_container']","SSN");
            Thread.sleep(1000);

            Reusable_Methods.sendKeys(driver,"//*[@id='ssnLastSixDigits']",ssn.get(i),"Last six digits");
            Thread.sleep(1000);

            Reusable_Methods.sendKeys(driver,"//*[@id='zipCode']", Zipcode.get(i),"zip code");
            Thread.sleep(1000);

            Reusable_Methods.click(driver,"//*[@id='submitBtn']","continue");
            Thread.sleep(1000);

            Reusable_Methods.captureResult(driver,"//*[@id='plainText_error']","error message");
            Thread.sleep(1000);

            driver.close();  //to close the new tab if you don't need it again
            driver.switchTo().window(tabs.get(0));



        }//end of for loop
        driver.quit();
    }//end of main method
}//end of java class

