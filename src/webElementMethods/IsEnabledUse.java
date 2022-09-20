package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		Thread.sleep(1000);	
		
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(getOtpButton.isEnabled());
		
		WebElement Number = driver.findElement(By.id("mobileNumber"));
		Number.sendKeys("9168020242");
		Thread.sleep(1000);
		
		System.out.println(getOtpButton.isEnabled());
		
		

	}

}
