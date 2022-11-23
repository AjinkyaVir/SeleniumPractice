package automateTwitterLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateTwitterLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().setPosition(new Point(50,50));
		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		 * email = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		 */
	
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,20);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//input[@autocomplete='username']"))) .sendKeys("abc@gmail.com");
		 */
		
		/*
		 * email.sendKeys("abc@gmail.com");
		 * 
		 * driver.findElement(By.xpath("//span[text()='Next']")).click();
		 * 
		 * 
		 * driver.findElement(By.name("password")).sendKeys("xyz@123");
		 * 
		 * driver.findElement(By.xpath("//span[text()='Log in']")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.close();
		 */
		

	}

}
