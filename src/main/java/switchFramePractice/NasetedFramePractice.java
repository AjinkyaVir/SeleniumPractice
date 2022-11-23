package switchFramePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NasetedFramePractice {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		int countIframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println(countIframes);
		
		driver.switchTo().frame("frame1");
		
		WebElement parentBody = driver.findElement(By.tagName("body"));
		
		String parentText = parentBody.getText();
		System.out.println("Parent Frame Text : " + parentText);
		
		int countChildFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(countChildFrames);
		
		
		driver.switchTo().frame(0);
		
		WebElement childText = driver.findElement(By.tagName("body"));
		
		String childFrameText = childText.getText();
		
		System.out.println("Child Frame Text : " + childFrameText);
		
		driver.switchTo().defaultContent();
		
		WebElement parentHeading = driver.findElement(By.className("main-header"));
		System.out.println("Parent window heading => "+ parentHeading.getText());
		
		driver.close();
		
	}

}
