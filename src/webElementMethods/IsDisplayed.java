package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(1000);
		
		WebElement customButton = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
	    customButton.click();
		Thread.sleep(1000);
		
		customButton.isDisplayed();
		
		if(customButton.isDisplayed())
		{
			System.out.println("Custom button is Displayed");
		}
		else
		{
			System.out.println("Custom button is not Displayed");
		}
		
	}

}
