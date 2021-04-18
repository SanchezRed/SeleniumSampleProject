package Hillel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    WebDriver driver;
    @Test
    public void checkMethod() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\berez\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://research.mawashi.tools:8080/");
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("dec21");
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("asdffdsA1");
        driver.findElement(By.cssSelector("input.btn")).click();
    }
}

