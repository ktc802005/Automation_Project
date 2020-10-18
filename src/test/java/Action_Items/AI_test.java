package Action_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AI_test {
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

        //navigate to hotels
        driver.navigate().to("https://www.hotels.com");
        Thread.sleep(2000);

        //Destination
        try
        {
            System.out.println("Entering a new on Destination:");
            WebElement destination = driver.findElement(By.xpath("//*[@id='qf-0q-destination']"));
            //destination.clear();
            Thread.sleep(2000);
            destination.sendKeys("Bali, Indonesia");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='autosuggest-category-result']")).click();
            Thread.sleep(2000);
        } catch (Exception err) {
            System.out.println("Unable to enter a new on Destination\n " + err);
        }
        //CheckIn
        try
        {
            System.out.println("Entering a new date on check in:");
            WebElement checkIn = driver.findElement(By.xpath("//*[@id='qf-0q-localised-check-in']"));
            checkIn.clear();
            Thread.sleep(2000);
            checkIn.sendKeys("10/28/20");
            Thread.sleep(2000);

        } catch (Exception err)
        {
            System.out.println("Unable to enter a new date on check in\n " + err);
        }
        //CheckOut
        try {
            System.out.println("Entering new date to check out");
            WebElement checkIn = driver.findElement(By.xpath("//[@id='qf-0q-localised-check-out']"));
            checkIn.clear();
            checkIn.sendKeys("11/03/20");
            Thread.sleep(3000);

        } catch (Exception err)
        {
            System.out.println("Unable to enter a new date on check out" + err);
        }

        //Rooms
        try{
            System.out.println("Selecting number of rooms");
            WebElement Room1 = driver.findElement(By.xpath("//*[@id='qf-0q-rooms']"));
            Select roomList = new Select(Room1);
            Thread.sleep(2000);
            roomList.selectByVisibleText("1");
            Thread.sleep(2000);
        } catch (Exception err) {
            System.out.println("Unable to select number of rooms" + err);
        }

    }//end of main
}//end of java class
