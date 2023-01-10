package allCommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitSeleniumExample {

	
	@Test
	public void expliciteWaitExample() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("txt2")));
		ele.sendKeys("Ajinkya");
	}
	
}
