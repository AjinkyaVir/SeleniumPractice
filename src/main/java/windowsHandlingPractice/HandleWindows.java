package windowsHandlingPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='newWindowBtn']")));
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		int count = child.size();
		
		for(String w : child) {
			
			if(!parent.equalsIgnoreCase(w)) {
				
				driver.switchTo().window(w);
				System.out.println("Child window title : " + driver.getTitle());
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
				
			}
			
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("Parent Window");
		System.out.println(driver.getTitle());
		driver.close();


	}

}
