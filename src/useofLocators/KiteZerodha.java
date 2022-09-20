package useofLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteZerodha {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@maxlength='6']")).sendKeys("PT8733");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@maxlength='260']")).sendKeys("Wagh@1998");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("pin")).sendKeys("171998");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//span[@class='user-id']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//a[@target='_self']")).click();
        Thread.sleep(1000);
        
        driver.quit();
        
	}

}
