
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

import PageObjects.login_test14;
/**
 *
 * @author ecopark
 */
public class Test14 {
    private static WebDriver driver = null;
    login_test14 signin;
   

    public Test14() {
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

        String userName = "admin10";
        String password = "wilmer123";
        String name = "admin10";
        
        //Test 20
        signin = new login_test14(driver);
        Thread.sleep(2000);
        signin.loginApplication(name, userName, password);
        assertEquals("validate test 21", "La mejor web de ecoparques Antioqueños", signin.getValueConfirmation());

    }
}
