package Hillel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    WebDriver driver;
     @Test
    public void checkMethod() {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\berez\\Downloads\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://151.80.70.42:3000/");
    }

}