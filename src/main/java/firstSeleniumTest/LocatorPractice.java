package firstSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Rahul");
		
		driver.findElement(By.name("gender"));

		driver.findElement(By.className("practice-form-wrapper"));
		
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Ho"));
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("Anuradha");
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("abc@gmail.com");
		
	}

}
