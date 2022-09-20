package useofLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(1000);
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("9168020242");
		
		Thread.sleep(1000);
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("1234@#");
		
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("_aa8j")).click();
	}

}
