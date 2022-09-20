package useofLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
        Thread.sleep(2000);
        
//        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//        Thread.sleep(2000);
//        
//        driver.findElement(By.xpath("//button[@name='checkout']")).click();
//        Thread.sleep(4000);
//        
//        driver.findElement(By.id("first-name")).sendKeys("Dipak");
//        Thread.sleep(2000);
//        
//        driver.findElement(By.id("last-name")).sendKeys("Waghmare");
//        Thread.sleep(2000);
//        
//        driver.findElement(By.id("postal-code")).sendKeys("411057");
//        Thread.sleep(2000);
//        
//        driver.findElement(By.id("continue")).click();
//        Thread.sleep(2000);
//        
//        driver.findElement(By.xpath("//button[@name='finish']")).click();
//        Thread.sleep(4000);
//        
//        driver.findElement(By.id("react-burger-menu-btn")).click();
//        Thread.sleep(2000);
//        
//        driver.findElement(By.xpath("(//a[@class='bm-item menu-item'])[3]")).click();
//        Thread.sleep(4000);
//        
//        driver.quit();
        
        
        

	}

}
