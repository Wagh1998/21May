package get_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Nevigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		
		driver.navigate().back(); //to perform backward operation
		Thread.sleep(2000);
		
		driver.navigate().forward(); //to perform forward operation
		Thread.sleep(2000);
		
		driver.navigate().refresh();  //to perform page reload operation
		Thread.sleep(2000);
		
		String URL = driver.getCurrentUrl();  //to get current Url
		System.out.println(URL);
		
		String title = driver.getTitle();  //to get page title
		System.out.println(title);
		
		
	}

}
