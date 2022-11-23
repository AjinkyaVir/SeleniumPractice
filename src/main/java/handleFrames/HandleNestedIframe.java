package handleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNestedIframe {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement iFrame = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(iFrame);
		
		WebElement iFrameContent = driver.findElement(By.tagName("body"));
		System.out.println(iFrameContent.getText());
		
		int childIframeCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(childIframeCount);
		
		driver.switchTo().frame(0);
		
		int iframeInChildIframeCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframeInChildIframeCount);
		
		driver.switchTo().defaultContent();
		
	}	
}
