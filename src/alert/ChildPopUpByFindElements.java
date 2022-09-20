package alert;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUpByFindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		List<WebElement> button = driver.findElements(By.xpath("//a[contains(text(),'Try it Yourself')]"));
		
		button.get(0).click();
		Thread.sleep(1000);
		button.get(1).click();
		Thread.sleep(1000);
		button.get(2).click();
		Thread.sleep(1000);
		button.get(3).click();
		Thread.sleep(1000);
		
		String main = driver.getWindowHandle();
		System.out.println("main :"+main);
		
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(addrs.get(0));
		
		System.out.println(addrs.get(1));
		System.out.println(addrs.get(2));
		System.out.println(addrs.get(3));
		System.out.println(addrs.get(4));
		
		for(int i=1;i<addrs.size();i++)
		{
		driver.switchTo().window(addrs.get(i));
		String URL = driver.getCurrentUrl();
		System.out.println("index"+i+":"+URL);
		Thread.sleep(1000);
		}
		System.out.println("This is change for git");
	}

}
