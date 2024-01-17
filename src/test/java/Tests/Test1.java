package Tests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1 {

    @Test
    public void  setup() {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();

       /* driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();

        WebElement logInModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
        driver.findElement(By.id("loginusername")).sendKeys("alandg2");
        driver.findElement(By.id("loginpassword")).sendKeys("notelavoyadecir");
        driver.findElement(By.cssSelector("div.modal-footer button[type='button'][onclick='logIn()']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.cssSelector(("div.list-group a.list-group-item[onclick=\"byCat('monitor')\"]"))).click();
        // driver.findElement(By.cssSelector(" div.list-group a.list-group-item[onclick=\"byCat('monitor')\"]"));
        // driver.findElement(By.cssSelector(" div.list-group a.list-group-item[onclick=\"byCat('monitor')\"]"));
        // driver.findElement(By.xpath("//a[@class=\"list-group-item\" and  text()=\"Monitors\"]"));
        // driver.findElement(By.xpath("//a[text()='Monitors' and @onclick=\"byCat('monitor')\"]"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"ASUS Full HD\"]"))).click();
        //driver.findElement(By.linkText("ASUS Full HD"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart"))).click();
       // driver.findElement(By.xpath("//a[text()='Add to cart']"));
       // driver.findElement(By.className("btn btn-success btn-lg"));

        wait.until(ExpectedConditions.alertIsPresent()).accept();*/

        driver.get("https://www.instagram.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']"))).sendKeys("alandg2");
       // driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("alandg2");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("notelavoyadecir");













        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
