package allCommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatePageIsDisplayedOrNot {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		String expectedTitle = "actiTIME - Login";
		String actualTilte = driver.getTitle();
		System.out.println(actualTilte);
		if(actualTilte.contains(expectedTitle)) {
			
			System.out.println("Page is displayed");
			
		}else {
			
			System.out.println("Page is not displayed");
			
		}
		
		

	}

}

