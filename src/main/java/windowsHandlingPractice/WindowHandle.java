package windowsHandlingPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		Iterator itr = childWindow.iterator();
		
		while(itr.hasNext()) {
			
			String child = (String) itr.next();
			if(!parentWindow.equals(child)) {
				
				driver.switchTo().window(child);
				WebElement text = driver.findElement(By.id("sampleHeading"));
		
				System.out.println("Child window text : " + text.getText());
			}
		}

	}

}
