package mouseAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

		 public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				List<WebElement>totalframes=driver.findElements(By.tagName("iframe"));
				driver.switchTo().frame(0);
				
				WebElement draggable = driver.findElement(By.id("draggable"));
				WebElement droppable = driver.findElement(By.id("droppable"));
				Thread.sleep(2000);
				Actions act=new Actions(driver);
				//act.dragAndDrop(draggable,droppable).perform();
				Thread.sleep(2000);
				
				act.clickAndHold(draggable).moveToElement(droppable).click().perform();

	}

}
