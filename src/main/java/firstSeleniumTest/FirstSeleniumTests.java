package firstSeleniumTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class FirstSeleniumTests {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement username = driver.findElement(By.cssSelector("input#email"));
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		WebElement signInMe = driver.findElement(By.name("login"));
		username.sendKeys("abc@gmail.com");
		password.sendKeys("admin123@");
		signInMe.click();
		
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//Thread.sleep(5000);

		 WebElement forgetEmail = driver.findElement(By.id("identify_email"));
		 WebElement didSubmit = driver.findElement(By.name("did_submit"));
		 forgetEmail.sendKeys("abc@gmail.com"); didSubmit.click();
		 
			/*
			 * String parent = driver.getWindowHandle();
			 * 
			 * Set<String> s = driver.getWindowHandles();
			 * 
			 * Iterator<String> itr = s.iterator();
			 * 
			 * while(itr.hasNext()) {
			 * 
			 * String child_window=itr.next();
			 * //System.out.println(driver.switchTo().window(child_window).getTitle());
			 * System.out.println(driver.switchTo().window(child_window));
			 * 
			 * WebElement forgetEmail = driver.findElement(By.id("identify_email"));
			 * WebElement didSubmit = driver.findElement(By.name("did_submit"));
			 * forgetEmail.sendKeys("abc@gmail.com"); didSubmit.click(); //driver.close();
			 * 
			 * }
			 */
		 
	}
	
	
}
