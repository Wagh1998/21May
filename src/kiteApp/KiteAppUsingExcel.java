package kiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\hp\\Desktop\\selenium\\TestExcel26MarchB.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	    String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
	    String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
	    String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		WebElement userID=driver.findElement(By.id("userid"));
		WebElement password= driver.findElement(By.id("password"));
		WebElement loginButton =driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		
	    userID.sendKeys(UN);
	    password.sendKeys(PWD);
	    loginButton.click();
	    
	    Thread.sleep(2000);
	    WebElement pin=driver.findElement(By.id("pin"));
	    WebElement continueButton=driver.findElement(By.xpath("//button[@type='submit']"));
	    
	    pin.sendKeys(PIN);
	    continueButton.click();
	    
	    Thread.sleep(2000);
	    WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
	    String actualUserID =username.getText();
	    String exepectedUserId="PT8733";
	    
		if(actualUserID.equals(exepectedUserId))
		{
			System.out.println("User Id Matching TC is Passed");
		}
		else
		{
			System.out.println("User Id Notmatching TC is Failed");
		}
		username.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target=\"_self\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
