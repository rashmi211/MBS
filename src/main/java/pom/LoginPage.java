package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy (xpath="//input[@id='email']")private WebElement username;
	@FindBy (xpath="//input[@id='pass']")private WebElement password;
	@FindBy (xpath="//button[@name='login']")private WebElement login;
	@FindBy (xpath="//a[text()='Forgotten password?']")private WebElement forgetpassword ;
	@FindBy (xpath="(//a[@role='button'])[2]")private WebElement createaccount ;
	@FindBy(xpath="//input[@name=\"firstname\"]")private WebElement firstname;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
     public void entreUsername(String user) {
    	 username.sendKeys(user);
     }
     public void entrePass(String pass) {
    	 password.sendKeys(pass);
     }
     public void clickonLogin() {
    	login.click();
     }
     public void clickonForgetPassword() {
    	 forgetpassword.click();
     }
     
     public void clickoncreateaccount() {
    	 createaccount.click();
     }
     public void entrefirstname(String fname,WebDriver driver) {
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
    	 wait.until(ExpectedConditions.visibilityOf(firstname));
    	 firstname.sendKeys(fname);
    	 
     }
		

}
