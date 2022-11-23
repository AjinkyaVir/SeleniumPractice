package actionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethodOnFacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
		String fb_url = "https://www.facebook.com/";
	
		WebDriver driver = new ChromeDriver();
		
		driver.get(fb_url);
		
		WebElement email = driver.findElement(By.id("email"));
		
		Actions allActions = new Actions(driver);
		
		Action performAllActions = (Action) allActions
									.moveToElement(email)
									.click()
									.keyDown(email,Keys.SHIFT)
									.sendKeys("hello")
									.keyUp(Keys.SHIFT)
									.doubleClick(email)
									.contextClick()
									.build();
		
		performAllActions.perform();
									
									

	}

}
