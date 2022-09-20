package useofLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtBankingDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbsitedemo.btbanking.com/onlineserv/CM/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='companyID']")).sendKeys("9999COMP");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='userID']")).sendKeys("9999DEMO");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='userPassword']")).sendKeys("111111");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(1000);
		
		
		
		

	}

}
