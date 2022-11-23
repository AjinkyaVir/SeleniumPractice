package switchFramePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Integer frameCount = Integer.parseInt(jse.executeScript("return window.length").toString());
		System.out.println(frameCount);
		
		driver.switchTo().frame("frame1");
		
		WebElement wb = driver.findElement(By.id("sampleHeading"));
		
		String text = wb.getText();
		System.out.println(text);
		//driver.close();
		driver.switchTo().defaultContent();
		
	}

	
}
