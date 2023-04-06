package finalTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class MyPostsTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://test-stand.gb.ru/?sort=createdAt&order=ASC");

        WebElement webElement1 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[1]/label/input"));
        webElement1.click();
        webElement1.sendKeys("GB202303616b924");


        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[2]/label/input"));
        webElement2.click();
        webElement2.sendKeys("65d10c63ae");


        WebElement webElement3 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[3]/button/span"));
        webElement3.click();

        Thread.sleep(3000);

        WebElement webElement4 = driver.findElement(By.xpath("/html/body/div/main/div/div/div[1]/div[3]/div/div[2]/button[3]"));
        webElement4.click();

        Thread.sleep(2000);

        WebElement webElement5 = driver.findElement(By.xpath("/html/body/div/main/div/div/div[1]/div[3]/div/div[2]/button[2]"));
        webElement5.click();

        Thread.sleep(3000);

        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"create-btn\"]"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath("/html/body/div/main/div/div/div[3]/div[2]/div/div[2]/div/form/div[1]/label/input"));
        webElement7.click();
        webElement7.sendKeys("Hello");

        WebElement webElement8 = driver.findElement(By.xpath("/html/body/div/main/div/div/div[3]/div[2]/div/div[2]/div/form/div[5]/label/input"));
        webElement8.click();
        webElement8.sendKeys("World");

        Thread.sleep(1000);

        WebElement webElement9 = driver.findElement(By.xpath("/html/body/div/main/div/div/div[3]/div[2]/div/div[2]/div/form/div[8]/button/span"));
        webElement9.click();

        WebElement webElement10 = driver.findElement(By.xpath("/html/body/div/main/div/div/div[3]/div[2]/div/div[1]/button"));
        webElement10.click();



    }

}
