package allCommonPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSimpleAlertBox {

	@Test
	public void handleSimpleAlertBox(){
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");	
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)","");
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		Alert alertBox = driver.switchTo().alert();
		String alertText = alertBox.getText();
		System.out.println("Alert text => " + alertText);
		alertBox.accept();
	
	
	}
	
}
