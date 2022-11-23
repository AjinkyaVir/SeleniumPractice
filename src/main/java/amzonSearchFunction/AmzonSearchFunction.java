package amzonSearchFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzonSearchFunction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement selectCat = driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
		Actions act = new Actions(driver);
				
				act.moveToElement(selectCat)
				.click()
				.build()
				.perform();
				
				WebElement categoryField = driver.findElement(By.id("searchDropdownBox"));
				
		Select categories = new Select(categoryField);
		
			categories.selectByVisibleText("Clothing & Accessories");
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirt",Keys.ENTER);
		
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("alert('Bingo!Done!!!')");
			 */
			
			
			WebElement scrollToNavigationNum = driver.findElement(By.xpath("//span[@class='s-pagination-strip']"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);", scrollToNavigationNum);
			
			driver.findElement(By.xpath("//span[@class='s-pagination-strip']//child::a[1]")).click();
			
		
	}

}
