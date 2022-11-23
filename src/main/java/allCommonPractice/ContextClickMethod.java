package allCommonPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickMethod {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement text = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(text)
		.contextClick()
		.build()
		.perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
	}

}
