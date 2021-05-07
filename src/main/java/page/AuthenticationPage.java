package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
    private  WebDriver driver;
    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By buttonLogin = By.cssSelector("#login button");

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void usernameSelected (String username){
        driver.findElement(inputUsername).sendKeys(username);
    }
    public void passwordSelected(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }
    public SecureArea clicLogin(){
        driver.findElement(buttonLogin).click();
        return new SecureArea(driver);
    }

}
