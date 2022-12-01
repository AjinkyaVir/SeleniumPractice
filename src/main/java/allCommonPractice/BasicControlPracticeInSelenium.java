package allCommonPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicControlPracticeInSelenium {

	
	@Test
	public void launchApp() throws InterruptedException{
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)","");
		
		driver.findElement(By.id("firstName")).sendKeys("Rahul");
		driver.findElement(By.id("lastName")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		
		//driver.findElement(By.className("bcCheckBox")).click();
		List<WebElement> chkLangauage = driver.findElements(By.className("bcCheckBox"));
		
		/*
		 * for(WebElement chkClick : chkLangauage) { chkClick.click(); }
		 */
		
		// select checkbox randomly
		for(int i=0; i<chkLangauage.size();i=i+2) {
			chkLangauage.get(i+1).click();
		}
		
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mohan123");
		driver.findElement(By.id("registerbtn")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	
	
	}
	
}
