package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ss {
	static WebDriver driver;
    static int i=0;
    
    public static void captureScreenshot() throws IOException 
    {
    	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		File dest=new File("D:\\Selenium\\ScreenShots\\"+i+".jpg");
    	FileHandler.copy(src, dest);
    	i++;
    }
    
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		captureScreenshot(); 
	}

}
