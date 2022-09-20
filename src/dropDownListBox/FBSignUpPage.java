package dropDownListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUpPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(1000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Dipak");
		Thread.sleep(1000);
		
		
	    WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
	    lastName.sendKeys("Waghmare");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		email.sendKeys("deepswaghmare1451@gmail.com");
		Thread.sleep(1000);
		
	    WebElement Reemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	    Reemail.sendKeys("deepswaghmare1451@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Abc@1234");
		Thread.sleep(1000);
		
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(Day);
		s.selectByIndex(16);
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("3");
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1998");
		Thread.sleep(1000);
		
		WebElement select = driver.findElement(By.xpath("//label[(text()='Male')]/following-sibling::input"));
		select.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		Thread.sleep(1000);
		//driver.close();
		
	}

}
