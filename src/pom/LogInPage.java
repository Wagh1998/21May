package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	    
	   //declaration
		@FindBy (xpath="//input[@placeholder='Username']")
		private WebElement userName;
		
		@FindBy (xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
		private WebElement password;
		
		@FindBy (xpath="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
		private WebElement LoginButton;
		
		//constructor
		public LogInPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//method
		public void sendUserName()
		{
			userName.sendKeys("Admin");
		}
		public void sendpassword()
		{
			password.sendKeys("admin123");
		}
		public void clickOnLoginButton()
		{
			LoginButton.click();
		}
		
}
