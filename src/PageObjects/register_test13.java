package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/**
 *
 * @author ecopark
 */
public class register_test13 {
    WebDriver driver;
    
    By name = By.cssSelector("#formulario > input[type=text]:nth-child(3)");
    By userName = By.cssSelector("#formulario > input[type=text]:nth-child(6)");
    By password = By.cssSelector("#formulario > input[type=password]:nth-child(9)");
    By passwordAgain = By.cssSelector("#formulario > input[type=password]:nth-child(12)");
    By signUp = By.cssSelector("#formulario > input[type=button]:nth-child(15)");
    By next = By.cssSelector("#crear-cuenta > span");
    By confirm = By.cssSelector("#validar");
    
    public register_test13(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getValueConfirmation(){
        return driver.findElement(confirm).getText();
    }
    
    public void clickNext(){
        driver.findElement(next).click();
    }
    
    public void setName(String strName){
        driver.findElement(name).sendKeys(strName);
    }
    
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }
    
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }
    
    public void setPasswordAgain(String strPasswordAgain){
        driver.findElement(passwordAgain).sendKeys(strPasswordAgain);
    }
    
    public void clickLogin(){
        driver.findElement(signUp).click();
    }    
    public void loginApplication(String name, String userName, String password){
        
        this.clickNext();
        this.setName(name);
        this.setUserName(userName);
        this.setPassword(password);
        this.setPasswordAgain(password);
        this.clickLogin();
    }
}
