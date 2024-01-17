package SeleniumGlueCode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hook {

    private static WebDriver driver;
    private  static int numCase=0;



    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        driver.quit();

    }

    public static WebDriver getDriver(){
        return  driver;
    }
}
