package Day_5_09132020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_search_result {
    public static void main(String[] args) throws InterruptedException {

        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver();

        //let's get to google home page

        //driver.get("https://www.google.com");

        //let's navigaate to google home page
        driver.navigate(). to("https://www.google.com");
        Thread.sleep(2000);
        //locate search field by name and enter a keyword on the field
        driver.findElement(By.name("q")).sendKeys("cars");
        //click on google search
        //driver.findElement(By.name("btnK")).click();
        driver.findElement(By.name("btnK")).submit(); //hitting enter is same as submit#
        //delay to load search result page
        Thread.sleep(2000);
        //capture the search result text
        String result = driver.findElement(By.id("result-stats")).getText();
        //System.out.println(result);
        String[] arrayResult = result.split(" ");
        //print out the search number
        System.out.println("My search number is " + arrayResult[1]);

        //close driver
        //driver.close();
        //quit the entire session
        driver.quit();

    }//end of main method

}//end of java class
