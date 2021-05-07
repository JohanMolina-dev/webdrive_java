package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By figureHover = By.cssSelector(".figure:nth-child(3) > img");
    private By linkFigureProfileOne = By.cssSelector("div#content div:nth-child(3) > div > a");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public void locatorFirstFigure(){
        WebElement figureOne = driver.findElement(figureHover);
        Actions action = new Actions(driver);
        action.moveToElement(figureOne).perform();
    }
    public void clickHoverProfileLink (){
        driver.findElement(linkFigureProfileOne).click();
    }
}
