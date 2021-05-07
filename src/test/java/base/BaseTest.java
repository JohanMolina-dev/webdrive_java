package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import page.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp() {
        //Se proporciona la ruta en donde se encuentra el driver.
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Se genera una instancia del objeto WebDriver, tenemos la opción de Chrome o cualquier otro navegador
        driver = new ChromeDriver();
        //Se instancia la URL a la cual queremos acceder.
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
        //Cerramos el navegador

    }
    //@AfterClass
    //public void finishTests(){
        //driver.quit();
    //}

}
