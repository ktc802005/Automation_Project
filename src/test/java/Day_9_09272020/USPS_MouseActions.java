package Day_9_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class USPS_MouseActions {
    public static void main(String[] args) throws InterruptedException {
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

        //navigate to usps.com
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2000);

        //declare your mouse actions command
        Actions actions = new Actions(driver);

        //move your mouse to quick tools to open the dropdown
        WebElement quicktools = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
        actions.moveToElement(quicktools).perform();
        Thread.sleep(2000);
        //move your mouse to quick tools to open the dropdown
        WebElement trackPackage = driver.findElement(By.xpath("//*[text()='Track a Package']"));
        actions.moveToElement(trackPackage).click().perform();
        //entering tracking number
        Thread.sleep(2000);
        WebElement trackNumber = driver.findElement(By.xpath("//*[@id'tracking-input']"));
        //actions.moveToElement(trackNumber).sendKeys("123456789").perfom();
        trackNumber.sendKeys("123456789");

        //to submit on to something
        //driver.findeElement(By.xpath("")).submit;




    }//end of main method
}//end of java class
