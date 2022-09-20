package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9168020242");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1245253");
		Thread.sleep(1000);
		
		WebElement Button = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy')]"));
		
		boolean status = Button.isEnabled();
		
		if(status==true)
		{
			Button.click();
			System.out.println("Button is Enable");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		Thread.sleep(1000);
		
	}

}
