package finalTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class TestCorner {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://test-stand.gb.ru/login");

        WebElement webElement = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[1]/label/input"));
        webElement.click();
        webElement.sendKeys("");

        WebElement webElement1 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[2]/label/input"));
        webElement1.click();
        webElement1.sendKeys("");

        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[3]/button/span"));
        webElement2.click();

        Thread.sleep(1000);

        WebElement webElement3 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[1]/label/input"));
        webElement3.click();
        webElement3.sendKeys("GB");

        WebElement webElement4 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[2]/label/input"));
        webElement4.click();
        webElement4.sendKeys("123456789012345678901");

        WebElement webElement5 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[3]/button/span"));
        webElement5.click();

        Thread.sleep(2000);

            WebElement webElement6 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[1]/label/input"));
            webElement6.click();
            webElement6.sendKeys("Dgb!@#$%^");

            WebElement webElement7 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[2]/label/input"));
            webElement7.click();
            webElement7.sendKeys("");

            WebElement webElement8 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[3]/button/span"));
            webElement8.click();

            Thread.sleep(2000);

        driver.quit();
        }
    }
