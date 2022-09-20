package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//input[@class='vmiddle'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();   //for Handle the alert
		System.out.println(alert.getText());     //this is for get text of alert
		alert.accept();                         //for accept the alert
		//alert.dismiss();
		
		
		
	}

}
