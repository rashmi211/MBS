package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) {
	     //  System.setProperty("webdriver.chrome.driver","F:\\Arise\\Setup\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
			 driver.get("https://demo.guru99.com/test/web-table-element.php"); 
			 driver.manage().window().maximize();
		/*	 List<WebElement>header=driver.findElements(By.xpath("//table//thead//tr//th"));
			 	for(int i=0; i<header.size(); i++) {
				 WebElement w=header.get(i);
				System.out.println(w.getText());
				*/
			 
			 List<WebElement>header=driver.findElements(By.xpath("(//table//tbody)[2]//tr"));
			 double max=0;
			 for(int i=1; i<=header.size(); i++) {
				String cv=driver.findElement(By.xpath("(//table//tbody)[2]//tr["+i+"]//td[4]")).getText();
	           double  m=Double.parseDouble(cv);
	           System.out.println(m);
	           if(m>max) {
	        	   max=m;
	           }
			 }
			 System.out.println("Maximum current price will be "+max);
			 
			 
			 
		//Minimum current price
			 String b=driver.findElement(By.xpath("(//table//tbody)[2]//tr[1]//td[4]")).getText();
	           double  m=Double.parseDouble(b);
	           double min=m;
	           
			 for(int i=2; i<=header.size(); i++) {
					String cv=driver.findElement(By.xpath("(//table//tbody)[2]//tr["+i+"]//td[4]")).getText();
		           double  m1=Double.parseDouble(cv);
		           System.out.println(m1);
		           
		           if(m1<min) {
		        	   min=m1;
		           }
				 }
			 System.out.println("mimimun current price will be "+min);
	 }
			
	

}
