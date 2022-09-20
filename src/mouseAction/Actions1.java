package mouseAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions1 {

	   
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//we have to create the object of the Actions class
		//we have to pass the driver refrence in the constructor
		
		WebElement button = driver.findElement(By.id("spnMyAcc"));
		Actions act=new Actions(driver);
		act.moveToElement(button).click().build().perform();
		Thread.sleep(2000);
		
		
	}
	
}

	
	

	



