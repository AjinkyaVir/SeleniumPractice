package seleniumProjectPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllBasicFunctionsPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		driver.findElement(By.id("firstName")).sendKeys("Anuradha");
		driver.findElement(By.id("lastName")).sendKeys("Sejul");
		
		WebElement female_radio_button = driver.findElement(By.id("femalerb"));
		boolean status = female_radio_button.isDisplayed();
		System.out.println("Female radio button displayed : " + status);
		
		boolean is_enabled_status = female_radio_button.isEnabled();
		System.out.println("Female radio button enabled : " + is_enabled_status);
		
		boolean is_selected_status = female_radio_button.isSelected();
		System.out.println("Female radio button selected : " + is_selected_status);
		
		female_radio_button.click();
		boolean is_selected_status_new = female_radio_button.isSelected();
		System.out.println("Female radio button selected : " + is_selected_status_new);
		
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("hindichbx")).click();
		driver.findElement(By.id("spanishchbx")).click();
		driver.findElement(By.id("frenchchbx")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anuradha.sejul@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("anuradha@321");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement s = driver.findElement(By.xpath("//button[text()='Register']"));
		System.out.println("Registration button text : " + s.getText());
		s.click();
		
		driver.findElement(By.xpath("//button[contains(@id,'clear')]")).click();
		driver.findElement(By.xpath("//a[@id='navigateHome']")).click();
		
		//driver.close();
		
		
	}

}
