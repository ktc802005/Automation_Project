package Day3_090620;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Method_Day3 {

    public static WebDriver getDriver() {
        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

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
        return driver;
    }
    //end of get driver


    //custom method to add two integer values
    //void methods only executes the statements inside
    //but doesn't return anything
    public static void add(int a, int b) {
        System.out.println("My result of a + b is " + (a + b));
    }//end of add method

    public static void subtraction(int a, int b) {
        System.out.println("My result of a - b is " + (a - b));
    }//end of subtract method
        public static int returnAdd ( int a, int b) {
            int result = a + b;
            return result;
        }


}//end of java class


