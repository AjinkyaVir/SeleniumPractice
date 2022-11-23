package firstSeleniumTest;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPracticeTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// xPtah with or
	//	driver.findElement(By.xpath("//input[@id='search_query_top' or  @name='search_query']")).sendKeys("T-shirt");
		
		//xPtah with and
	//	driver.findElement(By.xpath("//button[@class='btn btn-default button-search' and @name='submit_search']")).click();

		//xPath with contains()
	//	driver.findElement(By.xpath("//input[contains(@id,'search_query')]")).sendKeys("T-shirt");
		
		//xPath with start-with()
	//	driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
		
		//xPath with text()
	//	driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		
		//xPath with chained xPath
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirt");
		driver.findElement(By.xpath("//form[@id='searchbox']//button")).click();
		
		
	}

	

	
	
	
}
