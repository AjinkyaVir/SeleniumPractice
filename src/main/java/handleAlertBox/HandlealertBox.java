package handleAlertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlealertBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		/*
		 * driver.findElement(By.id("alertButton")).click();
		 * 
		 * driver.switchTo().alert().accept();
		 */
		
		/*
		 * WebElement element = driver.findElement(By.id("promtButton"));
		 * 
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		 * 
		 * Alert promptalert = driver.switchTo().alert();
		 * 
		 * String alertText = promptalert.getText(); System.out.println(alertText);
		 * Thread.sleep(5000); promptalert.sendKeys("alert test");
		 * 
		 * promptalert.accept();
		 */
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		
		
	}
	
}
