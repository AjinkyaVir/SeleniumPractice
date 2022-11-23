package handlingMultipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		String parentWin = driver.getWindowHandle();
		
		Set<String> allWin = driver.getWindowHandles();
		
		Iterator<String> itr = allWin.iterator();
		
		while(itr.hasNext()) {
			
			String childWin = itr.next();
			if(!parentWin.equals(childWin)) {
				driver.switchTo().window(childWin);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		driver.switchTo().window(parentWin);
		System.out.println("Parent window Title : " + driver.getTitle());
	}
	
}
