package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LounchBrowser {
	public static WebDriver openChrome() {
	//	System.setProperty("webdriver.chrome.driver", "F:\\Arise\\Setup\\chromedriver_win32 (3)\\chromedriver.exe");
	   WebDriverManager.chromedriver().setup();;
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	//   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   return driver;
	   
	
	}

}
