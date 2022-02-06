
package PPI_Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.viewecopark_test7;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
/**
 *
 * @author ecopark
 */
public class Test7 {
    private static WebDriver driver = null;
    viewecopark_test7 view;

    public Test7() {
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
        
        //Test 7
        view = new viewecopark_test7(driver);
        view.loginApplication(name, userName, password);

        Thread.sleep(2000);
        assertEquals("validate test 7", "Arvi", view.getValueConfirmation());

    }
}
