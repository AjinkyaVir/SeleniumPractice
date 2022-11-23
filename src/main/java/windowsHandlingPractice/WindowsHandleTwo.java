package windowsHandlingPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator itr = allWindows.iterator();
		
		while(itr.hasNext()) {
			
			String child = (String) itr.next();
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Child Window Text : " + text.getText());
				
				
			}
			
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent window : " + driver.getTitle());
		
		
	}

}
