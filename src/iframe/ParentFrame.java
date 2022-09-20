package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParentFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		driver.switchTo().frame(iframe);
	
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
	
		Select animals=new Select(dropDown);
		animals.selectByVisibleText("Baby Cat");
	    //driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe1);
		
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(iframe2);
		driver.findElement(By.xpath("//input[@id='a']")).click();

	}

}
