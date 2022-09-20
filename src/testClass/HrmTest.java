package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LogInPage;
import pom.HomePage;

public class HrmTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        LogInPage login=new LogInPage(driver);
        login.sendUserName();
        login.sendpassword();
        login.clickOnLoginButton();
        
      /* HomePage home=new HomePage(driver);
        home.verifyAdminTab();
        home.verifyleaveTab();
        home.verifyPIMTab();*/
	}

}
