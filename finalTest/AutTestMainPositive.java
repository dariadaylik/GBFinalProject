package finalTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class AutTestMainPositive {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://test-stand.gb.ru/login");

        WebElement webElement1 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[1]/label/input"));
        webElement1.click();
        webElement1.sendKeys("GB202303616b924");


        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[2]/label/input"));
        webElement2.click();
        webElement2.sendKeys("65d10c63ae");


        WebElement webElement3 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[3]/button/span"));
        webElement3.click();


    }



}
