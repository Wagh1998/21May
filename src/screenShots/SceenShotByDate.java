package screenShots;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SceenShotByDate {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	    Date d=new Date(0000,00,00);
		String FileName=d.toString().replace(":","_").replace(" ","_")+".png";
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        FileHandler.copy(screenshot,new File("D:\\Selenium\\ScreenShots\\"+FileName));
        

		
	}
}
