package handleActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleActionClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		WebElement fName = driver.findElement(By.name("fullname"));
		
		Actions builder = new Actions(driver);
		
	
		
		Action setOfActivites = builder.moveToElement(fName)
								.click()
								.keyDown(fName, Keys.SHIFT)
								.sendKeys(fName,"selenium")
								.keyDown(fName, Keys.SHIFT)
								.build();
		setOfActivites.perform();
		
	}
	
}
