package PPI_Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.register_test20;

public class Test20 {

    private static WebDriver driver = null;
    register_test20 signup;
   

    public Test20() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        driver.get("http://localhost:8084/ProyectoPPI-PJIC");
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    /**
     * Test of main method, of class SeleniumPractice.
     */
    @Test
    public void testMain() throws InterruptedException {

        String userName = "usertesteo1";
        String password = "ecoparkpalmas";
        String name = "UserTest";
        
        //Test 20
        signup = new register_test20(driver);
        Thread.sleep(5000);
        signup.loginApplication(name, userName, password);
        assertEquals("validate test 20", "Cuenta creada exitosamente.", signup.getValueConfirmation());

    }
}
