package Day_6_09192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yahoo_with_find_elements {
    public static void main(String[] args) throws InterruptedException {
        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //defining the web driver that you will be using
        ChromeOptions options = new ChromeOptions();
        //set the driver to be maximized
        options.addArguments("start-maximized");
        //set the driver to be incognito mode(private)
        options.addArguments("incognito");
        //run the driver in headless mode
        //options.addArguments("headless");

        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver(options); //options variable should be passed here

        //navigate to yahoo page
        driver.navigate().to("https://yahoo.com");
        //delay 2 seconds
        Thread.sleep(2000);

        /*
        storing search field locator as a WebElement variable so I can re use that locator
        more than once
         */

        WebElement searchField = driver.findElement(By.xpath("//*[@name='p']"));
        //clear any pre defined value on the field
        searchField.clear();
        //enter your new keyword
        searchField.sendKeys("cars");
        //submit on the same field after the value
        searchField.submit();
        Thread.sleep(2000);

        //using find element to click on 3rd link(news)
        //driver.findElements(By.xpath("//*[@class='_yb_e4mte ']")).get(2).click();

        driver.quit();
    }//end of main method

}//end of java class
