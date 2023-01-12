package alertExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	Alert alert;
	@Test
	public void alertExample() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.dismiss();
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		driver.switchTo().alert().sendKeys("Ajinkya");
		alert.accept();
		
		
		
	}
	
}
