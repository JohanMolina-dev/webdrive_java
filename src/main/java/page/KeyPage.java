package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPage {
    private WebDriver driver;
    private By inputKey = By.id("target");
    private By resultText = By.id("result");

    public KeyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String texto){
        driver.findElement(inputKey).sendKeys(texto);
    }
    public String getResult(){
        return driver.findElement(resultText).getText();
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.CONTROL,Keys.ALT,"q") + "= Arroba");
    }

}
