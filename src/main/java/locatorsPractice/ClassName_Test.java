package locatorsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * 
 * @author XYZ
 * 
 * https://www.drindiahealth.com/admin
 * Username: admin
 * Password: admin
 *
 */

public class ClassName_Test {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://omayo.blogspot.com/");
		
		//driver.close();
		
		driver.findElement(By.id("blogsmenu")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("selenium143"))).click();
		
		//driver.findElement(By.id("selenium143")).click();
				
		
		/*
		 * List<WebElement> inputTags = driver.findElements(By.tagName("input"));
		 * System.out.println(inputTags.size()); for(WebElement e : inputTags) {
		 * System.out.println(e.getTagName()); }
		 */
	}

}
