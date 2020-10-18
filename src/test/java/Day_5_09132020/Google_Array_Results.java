package Day_5_09132020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_Array_Results {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");


        //defining the web driver that you will be using
        ChromeOptions options = new ChromeOptions();
        //set the driver to be maximized
        options.addArguments("start-maximized");
        //set the driver to be incognito mode(private)
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        //run the driver in headless mode
        //options.addArguments("headless");

        //defining the web driver that you will be using


        //lets create dynamic array to handle multiple boroughs on google search
        String[] boroughs = new String[5];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten Island";

        for (int i = 0; i < boroughs.length; i++) {
            //let's navigate to google home page
            driver.navigate().to("https://www.google.com");
            Thread.sleep(2000);
            //locate search field by name and enter a keyword on the field
            driver.findElement(By.name("q")).sendKeys(boroughs[i]);
            //click on google search
            //driver.findElement(By.name("btnK")).click();
            driver.findElement(By.name("btnK")).submit(); //hitting enter is same as submit#
            //delay to load search result page
            Thread.sleep(2000);

            //Getting a certain string result and storing it in a searchResult variable
            //capture the search result text
            String searchResult = driver.findElement(By.id("result-stats")).getText();
            //defining a string array called SplitResult
            String[] splitResult;
            //using the Split result method to split the searchResult
            splitResult = searchResult.split(" ");
            //print out the search number
            System.out.println("My search number for " + boroughs[i] + " is " + splitResult[1]);
        
        }//end of for loop
        driver.quit(); //quit the driver
    }//end of main method
}//end of java class
