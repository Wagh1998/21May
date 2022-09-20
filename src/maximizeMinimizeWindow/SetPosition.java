package maximizeMinimizeWindow;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
		
		Point p=new Point(600,250);
		//System.out.println(p);
	
		driver.manage().window().setPosition(p);
		
	
		

	}

}
