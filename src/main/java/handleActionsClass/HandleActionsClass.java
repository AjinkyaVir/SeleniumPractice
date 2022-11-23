package handleActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleActionsClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		
		((JavascriptExecutor)driver).executeScript("scrollBy(0,300)");
		
		WebElement live = driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='Live']")); 
		Actions action = new Actions(driver);
				 action.moveToElement(live).click()
				 .build()
				 .perform();
			
		
		
	}

}
