package Day_8_09262020;

import Day_7_09202020.Array_List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class try_catch_in_class {
    /*public static void main(String[] args) throws InterruptedException {
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
        //options variable should be passed here
        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> locations = new ArrayList<>();
        locations.add("New York");
        locations.add("Miami");
        locations.add("Los Angels");

        ArrayList<String> checkIn = new ArrayList<>();
        checkIn.add("09/28/20");
        checkIn.add("09/29/20");
        checkIn.add("09/30/20");

        ArrayList<String> checkout = new ArrayList<>();
        checkout.add("10/15/20");
        checkout.add("10/16/20");
        checkout.add("10/17/20");

        ArrayList<String> rooms = new ArrayList<>();
        rooms.add("1");
        rooms.add("2");
        rooms.add("3");

        ArrayList<String> adults = new ArrayList<>();
        adults.add("1");
        adults.add("2");
        adults.add("3");


        //navigate to hotels.com website
        driver.navigate().to("https://www.hotels.com");
        Thread.sleep(2000);
        for (int i = 0; i < locations.size(); i++) {
            try {
                WebElement searchfield = driver.findElement(By.xpath("//*[@name='q-destination']"));
                searchfield.clear();
                searchfield.sendKeys(locations.get(i));
            } catch (Exception err) {
                System.out.println("unable to enter location name" + err);
            }//end of location exception
            Thread.sleep(1000);
            try {
                driver.findElement(By.xpath("//*[@id='qf-8q-destination-label']")).click();
            } catch (Exception err) {
                System.out.println("Unable to click on suggestion" + err);
            }//end of click suggestion exception
            try {
                WebElement searchfield = driver.findElement(By.xpath("//*[@name'q"));
                checkIn_Field.clear();
                checkIn_Field.sendKeys(checkIn.get(i));
            } catch (Exception err) {
                System.out.println("Unable to enter check in date" + err);
            }//end of check in exception

            try {
                WebElement checkout_Field = driver.findElement(By.xpath("//*[@name'q-localized"));
                checkout_Field.clear();
                checkout_Field.sendKeys(checkout.get(i));
            } catch (Exception err) {
                System.out.println("Unable to enter check out date" + err);
            }//end of check out exception

        }//end of main method
    }*/
}//end of class