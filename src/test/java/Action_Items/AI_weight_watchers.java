package Action_Items;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_weight_watchers {

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

        ArrayList<String> zipCodeList = new ArrayList<>();
        zipCodeList.add("11238");
        zipCodeList.add("10702");
        zipCodeList.add("10036");
        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Weight Watchers: Weight Loss and Wellness Help";
        System.out.println("Trying to verify title of website with Expected Title");

        //go to weight watchers homepage
        // mac code maximize only(no .exe files)
        driver.manage().window().maximize();
        driver.navigate().to("https://www.weightwatchers.com");
        //2 sec delay
        //click on find a workshop
        Thread.sleep(2000);
        System.out.println("navigated to weight watchers homepage");

        for (int i = 0; i < zipCodeList.size(); i++){

            if (expectedTitle.equalsIgnoreCase(actualTitle)){
                System.out.println("Title Matched");
            }else{
                System.out.println("Title does not match and actual title is " +actualTitle);
            }//end of if_else for title


        try {
            driver.findElement(By.xpath("//*[@data-e2e-name='find_a workshop']")).click();
            System.out.println("finding a workshop");

        } catch (Exception err){
            System.out.println("Unable to click on workshop " + err);
        }//end of workshop exception
        Thread.sleep(2000);

        //enter a zipcode
        try {
            WebElement zip = driver.findElement(By.xpath("//*[@class='input input-3TfT5']"));
            System.out.println("enter a zipcode");
            zip.clear();
            zip.sendKeys(zipCodeList.get(i));
            zip.submit();
        } catch (Exception err){
            System.out.println("Unable to enter value on zipcode " + err);
        } //end of zipcode exception

        //click on first link
        //scroll to bottom of page to capture schedule
        JavascriptExecutor jse = null;
            //scroll down using execute script command
        jse.executeScript("scroll(0,4000)");

         try {
                if (i==0) {

                        driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']")).get(1).click();
                            Thread.sleep(3000);
                                System.out.println("click on 2nd link");
                            }//end of 2nd link if else

                    if (i==1) {
                            driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']")).get(2).click();
                            Thread.sleep(3000);
                        System.out.println("click on third link");
                                 }//end of 3rd link if else

                        if (i==2) {
                                 driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']")).get(0).click();
                                 Thread.sleep(3000);
                                    System.out.println("click on first link");
                                    }//end of fist link if else
            }catch (Exception err){
                System.out.println("Unable to click on first link " + err);
                                 }//end of 1st link exception


        //capture the search result text
        String result = driver.findElement(By.id("location-search")).getText();
        System.out.println(result);
        driver.quit();
        }//end of if else statements
    }//end of main method


}//end of java class

 
