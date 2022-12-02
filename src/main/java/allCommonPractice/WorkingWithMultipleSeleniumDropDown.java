package allCommonPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithMultipleSeleniumDropDown {

	@Test
	public void workingWithMultipleSeleniumDropDown() throws InterruptedException{
	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		WebElement multiDropDown = driver.findElement(By.xpath("//select[@id='ide']"));
		
		Select selectIde = new Select(multiDropDown);
		selectIde.selectByIndex(0);
		selectIde.selectByIndex(2);
		
		Thread.sleep(3000);
		
		//driver.close();
		
	
	}
	
	
}
