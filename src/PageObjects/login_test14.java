/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/**
 *
 * @author ecopark
 */
public class login_test14 {
    WebDriver driver;
    
    By name = By.cssSelector("#formulario > input[type=text]:nth-child(2)");
    By userName = By.cssSelector("#formulario > input[type=text]:nth-child(5)");
    By password = By.cssSelector("#formulario > input[type=password]:nth-child(8)");
    By passwordAgain = By.cssSelector("#formulario > input[type=password]:nth-child(11)");
    By signIn = By.cssSelector("#formulario > input[type=submit]:nth-child(13)");
    By confirm = By.cssSelector("body > header > section > h1");
    
    public login_test14(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getValueConfirmation(){
        return driver.findElement(confirm).getText();
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
    
    public void loginApplication(String name, String userName, String password){
        
        this.setName(name);
        this.setUserName(userName);
        this.setPassword(password);
        this.setPasswordAgain(password);
        this.clickLogin();
    }
}
