package Action_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bing_AI {
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
        //headless means browser runs w/o a UI

        //defining the web driver that you will be using
        //lets create dynamic array to handle multiple boroughs on google search

        String[] hobbies = new String[5];
        hobbies [0] = "sports";
        hobbies [1] = "football";
        hobbies [2] = "swimming";
        hobbies [3] = "fishing";
        hobbies [4] = "kayaking";



        for (int i = 0; i < hobbies.length; i++) {
            //let's navigate to bing home page
            driver.navigate().to("https://www.bing.com");
            //set time in milliseconds
            Thread.sleep(2000);
            //locate search field by name and enter a keyword on the field
            driver.findElement(By.name("q")).sendKeys(hobbies[i]);
           //submit is like pressing enter and is more powerful than .click
            driver.findElement(By.name("q")).submit();
            //click on bing search
            //driver.findElement(By.name("btnK")).click();
            //driver.findElement(By.id("sb_form_go")).submit();//hitting enter is same as submit
            //delay to load search result page
            Thread.sleep(2000);
            //Getting a certain string result and storing it in a searchResult variable
            //capture the search result text
            String searchResult = driver.findElement(By.className("sb_count")).getText();
            //defining a string array called SplitResult
            String[] splitResult;
            //using the Split result method to split the searchResult
            splitResult = searchResult.split(" ");
            //print out the search number
            System.out.println("My search number for" + hobbies[i] + " is " + splitResult[0]);
        }//end of for loop
        //quit the driver
        driver.quit();
    } //end of main method
}//end of java class
