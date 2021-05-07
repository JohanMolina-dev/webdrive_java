package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
        private  WebDriver driver;

        public HomePage(WebDriver driver){
            this.driver = driver;
        }
        public AuthenticationPage clickFormsAuthentication(){
            clickLinks("Form Authentication");
            return new AuthenticationPage(driver);
        }
        public DropDown clickDropDown(){
            clickLinks("Dropdown");
            return new DropDown(driver);
        }
        public HoverPage clickHoverPage(){
            clickLinks("Hovers");
            return new HoverPage(driver);
        }
        public KeyPage clickKeyPresses(){
            clickLinks("Key Presses");
            return new KeyPage(driver);
        }

        private void clickLinks(String linkTexto){
            driver.findElement(By.linkText(linkTexto)).click();
        }
}
