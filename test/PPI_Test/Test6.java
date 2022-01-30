
package PPI_Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.conectionsuccess_test6;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
/**
 *
 * @author ecopark
 */
public class Test6 {
    private static WebDriver driver = null;
    conectionsuccess_test6 success;

    public Test6() {
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
        
        LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> Logs = entry.getAll();
        
        for (LogEntry Log : Logs) {
            System.out.println("Logging the console logs \n"+ Log);
            //do something useful with the data
        }
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
        success = new conectionsuccess_test6(driver);
        success.loginApplication(name, userName, password);

        //Thread.sleep(5000);
        //assertEquals("validate test 8", "HTTP Status 500 – Internal Server Error", success.getValueConfirmation());

    }
}
