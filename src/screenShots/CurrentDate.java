package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CurrentDate {
 
	static int i=10;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gorest.co.in/my-account/access-tokens");
		driver.manage().window().maximize();
		
		DateTimeFormatter Time=DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDateTime currenttime=LocalDateTime.now();
		String datetime = (Time.format(currenttime));
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		File dest=new File("D:\\Selenium\\ScreenShots\\"+i+" "+datetime+".jpg");
		FileHandler.copy(src, dest);
		
	}

}
