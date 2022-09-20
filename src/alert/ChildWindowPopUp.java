package alert;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement Alert = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[1]"));
		WebElement Confirm = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[2]"));
		WebElement Prompt = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[3]"));
		WebElement LineBreaks = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[4]"));
		
		Alert.click();
		Thread.sleep(1000);
		Confirm.click();
		Thread.sleep(1000);
		Prompt.click();
		Thread.sleep(1000);
		LineBreaks.click();
		Thread.sleep(1000);
		
		String main = driver.getWindowHandle();
		System.out.println("main :"+main);
		
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(addrs.get(0));
		
		System.out.println(addrs.get(1));
		System.out.println(addrs.get(2));
		System.out.println(addrs.get(3));
		System.out.println(addrs.get(4));
		
		/*driver.switchTo().window(addrs.get(1));   
		String URL1 = driver.getCurrentUrl();
		System.out.println("index 1:"+URL1);        //last window get address first  after switchTo method giving index to arrayList

		driver.switchTo().window(addrs.get(2));
		String URL2 = driver.getCurrentUrl();
		System.out.println("index 2:"+URL2);
		
		driver.switchTo().window(addrs.get(3));
		String URL3 = driver.getCurrentUrl();
		System.out.println("index 3:"+URL3);

		driver.switchTo().window(addrs.get(4));       
		String URL4 = driver.getCurrentUrl();
		System.out.println("index 4:"+URL4);*/      //first window get address last after switchTo method giving index to arraylist as 4
		
		for(int i=1;i<addrs.size();i++)
		{
		driver.switchTo().window(addrs.get(i));
		String URL = driver.getCurrentUrl();
		System.out.println("index"+i+":"+URL);
		Thread.sleep(1000);
		}
		
	}

}
