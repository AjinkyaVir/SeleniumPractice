package windowsHandlingPractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowTab {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.id("newTabBtn")).click();
		String p = driver.getWindowHandle();
		Set<String> parent = driver.getWindowHandles();
		
		System.out.println(parent);
		
		ArrayList<String> al = new ArrayList(parent);
		driver.switchTo().window(al.get(1));
		System.out.println("Name of window : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(p);
		
		
	}

}
