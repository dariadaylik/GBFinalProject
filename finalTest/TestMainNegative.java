package finalTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class TestMainNegative {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://test-stand.gb.ru/login");

        WebElement webElement4 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[1]/label/input"));
        webElement4.click();
        webElement4.sendKeys("GBDaria111");

        WebElement webElement5 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[2]/label/input"));
        webElement5.click();
        webElement5.sendKeys("1234567");

        WebElement webElement6 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[3]/button/span"));
        webElement6.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
