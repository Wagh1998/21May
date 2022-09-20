package useofLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		WebElement User = driver.findElement(By.id("email"));
		User.sendKeys("9168020242");
	
		Thread.sleep(1000);
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("Dipak143@v");
		
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		Thread.sleep(1000);
		WebElement Signup = driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
		Signup.click();

	}

}
