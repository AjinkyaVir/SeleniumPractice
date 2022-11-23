package handleFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		List<WebElement> iFramesNumbers = driver.findElements(By.tagName("iframe"));
		System.out.println(iFramesNumbers.size());
		
		WebElement iFrame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iFrame);
		
		WebElement iFrameHeading = driver.findElement(By.id("sampleHeading"));
		
		System.out.println(iFrameHeading.getText());
		
		driver.switchTo().defaultContent();
		
	}
	
}
