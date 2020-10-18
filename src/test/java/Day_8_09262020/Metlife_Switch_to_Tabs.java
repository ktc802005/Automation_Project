package Day_8_09262020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Metlife_Switch_to_Tabs {
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
        //options variable should be passed here
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.metlife.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@aria-label='SOLUTIONS']")).click();
        //click on take along dental link
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='MetLife TakeAlong Dental']")).click();
        Thread.sleep(1500);
        //click on Enroll Now button
        driver.findElement(By.xpath("//*[contains(text(),'Enroll Now')]")).click();

        //need to store get window handles in as ArrayList to switch to different tab(s)
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to second tab
        driver.switchTo().window(tabs.get(1));
        //enter the zipcode
        driver.findElement(By.xpath("//*[@name='txtZipCode']")).sendKeys("11238");
        driver.close();  //to close the new tab if you don't need it again
        driver.switchTo().window(tabs.get(0));
        //renavigate back to met life
        driver.navigate().to("https://www.metlife.com");




    }//end of main method
}//end of java class
