package iframe;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerToImmediate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		List<WebElement> button = driver.findElements(By.xpath("//a[contains(text(),'Try it Yourself')]"));
	    button.get(0).click();
	    
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(addrs.get(1));
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		Thread.sleep(1000);
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame("iframeResult");
		
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//driver.switchTo().frame(iframe);
		
		WebElement trybutton = driver.findElement(By.xpath("//button[text()='Try it']"));
	    trybutton.click();
	    Thread.sleep(5000);
	    Alert acp=driver.switchTo().alert();
	    acp.accept();
	    Thread.sleep(1000);
	    
	    driver.switchTo().defaultContent();
	    
	    
	    
	    //driver.switchTo().parentFrame();
	   
	   //Thread.sleep(5000);
	   
	   //WebElement img = driver.findElement(By.xpath("//img[@alt='Advertisement']"));
	   //img.click();
		

	}

}
