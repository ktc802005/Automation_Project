package Day_13_10112020;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Dummy_Abstract_class {



    @BeforeSuite
    public void m6(){
        System.out.println("before suite");
    }


    @AfterSuite
    public void m7(){
        System.out.println("after suite");
    }

    @BeforeMethod
    public void m3(){
        System.out.println("before method");
    }


    @AfterMethod
    public void m4(){
        System.out.println("after method");
    }

}
