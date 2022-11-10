package maven_test_cases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Maven_test_1 {
	
	WebDriver driver;
	
  @Test
  public void Google() {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("Hello" +Keys.ENTER);
	  
	  
  }
  
  @Test
  public void Facebook() {
	  driver.get("https://www.facebook.com/");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Lib\\64 Bit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
