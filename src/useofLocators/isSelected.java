package useofLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
			Thread.sleep(1000);
			
			WebElement customButton = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
		    //WebElement customButton = driver.findElement(By.xpath("//label[(text()='Male')]/following-sibling::input"));
		    //WebElement customButton = driver.findElement(By.xpath("//label[(text()='Female')]/following-sibling::input"));
			
			//By using Preceding Sibling
			//WebElement customButton = driver.findElement(By.tagName("//input[@value='1']/preceding-sibling::label"));
			//customButton.click();
			Thread.sleep(1000);
		
			boolean result = customButton.isSelected();
			System.out.println(result);
			
			if(result==true)
			{
				System.out.println("Custom button is Selected ");
			}
			else
			{
			System.out.println("Custom button is not Selected");
			}
			
			driver.close();
			
			
			
			

	}

}
