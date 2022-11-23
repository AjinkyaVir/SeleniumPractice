package handlingDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragAndDrop {

	@Test
	public void handlingDragAndDrop() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-me.html");
		
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		WebElement from = driver.findElement(By.id("draggable"));
		
		
		Actions act = new Actions(driver);
					act.dragAndDropBy(from, 250, 150).perform();
					
					
					System.out.println("Successfully drag and drop");
		
		
	}
	
}
