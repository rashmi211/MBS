package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LounchBrowser;
import pom.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	
		@BeforeMethod
		public void openBrowser() {
			driver=LounchBrowser.openChrome();
		}
		
		@Test
		public void LoginwithValidcredential() {
			LoginPage loginpage=new LoginPage(driver);
			loginpage.entreUsername("rashmi");
			loginpage.entrePass("rashmi");
		    loginpage.clickonLogin();
			
		}
		@Test
		public void LoginwithinValidcredential() {
			LoginPage loginpage=new LoginPage(driver);
			loginpage.entreUsername("ra12shmi");
			loginpage.entrePass("r1ashmi");
		    loginpage.clickonLogin();
			
		}
		@Test
		public void createnewAccount() {
			LoginPage loginpage=new LoginPage(driver);
			loginpage.clickoncreateaccount();
			loginpage.entrefirstname("rashmi", driver);
			
		}
//		@AfterMethod
//		public void closebrowser() {
//			driver.close();
//		}
		
		

	
}
