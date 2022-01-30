
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author ecopark
 */
public class conectionerror_test8 {
    WebDriver driver;
    
    By name = By.cssSelector("#formulario > div.inputs > input[type=text]:nth-child(2)");
    By userName = By.cssSelector("#formulario > div.inputs > input[type=text]:nth-child(5)");
    By password = By.cssSelector("#formulario > div.inputs > input[type=password]:nth-child(8)");
    By passwordAgain = By.cssSelector("#formulario > div.inputs > input[type=password]:nth-child(11)");
    By signIn = By.cssSelector("#formulario > div.inputs > input[type=submit]:nth-child(13)");
    By confirm = By.cssSelector("#title-ecopark");
    By ecopark = By.cssSelector("body > div:nth-child(4) > form > input[type=submit]:nth-child(1)");
    By msg = By.cssSelector("body > h1");

    
    public conectionerror_test8(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getValueConfirmation(){
        return driver.findElement(msg).getText();
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
        driver.findElement(signIn).click();
    }
    
    public void clickEcopark(){
        driver.findElement(ecopark).click();
    }
    
    public void loginApplication(String name, String userName, String password){
        
        this.setName(name);
        this.setUserName(userName);
        this.setPassword(password);
        this.setPasswordAgain(password);
        this.clickLogin();
        this.clickEcopark();
    }
}
