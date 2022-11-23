package actionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/auto-complete/");
		
		WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]"));
		
		Actions action = new Actions(driver);
		
	/*	action.keyDown(element,Keys.SHIFT);
		
		action.sendKeys("CaptialLetter");
		
		action.keyDown(Keys.SHIFT);
		
		action.build();*/
		
		Action enterText = (Action) action.keyDown(element,Keys.SHIFT)
				.sendKeys("CaptialLetter")
				.keyDown(Keys.SHIFT)
				.build();
		
		enterText.perform();
	}

}
