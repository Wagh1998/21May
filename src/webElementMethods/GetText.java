package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php/");
		WebElement button = driver.findElement(By.xpath("//*[contains(text(),'Log In')]"));
        Thread.sleep(1000);
        
        String text = button.getText();
        System.out.println(text);
        
        String ExepectedText="Log In";
        
        if(text.equals(ExepectedText))
        {
        	System.out.println("Test case is pass");
        }
        else
        {
        	System.out.println("Test case is fail");
        }
	}

}
