package screenShots;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotByMethodCalling {
	   static int i=0;
	   public static void test(WebDriver driver) throws IOException
	   {     
		    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\Selenium\\ScreenShots\\"+i+".png");
			FileHandler.copy(source, dest);	
			i++;
	   }
       
	   public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		test(driver);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(3000);
		test(driver);
	    
	   
	    WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Dipak");
		test(driver);
		Thread.sleep(1000);	
	}

}
