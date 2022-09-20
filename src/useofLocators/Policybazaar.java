package useofLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Policybazaar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='icon-bg homeIconsBg health-insurance'])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		
		WebElement yourage = driver.findElement(By.xpath("//select[@class='input_box select_input_box placeholder']"));
		yourage.click();
		Select s=new Select(yourage);
  	    s.selectByVisibleText(" 35 yr ");
  	    Thread.sleep(1000);
  	    
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		Thread.sleep(1000);
		
		

	}

}
