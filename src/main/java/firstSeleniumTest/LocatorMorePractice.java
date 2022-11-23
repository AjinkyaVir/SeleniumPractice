package firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMorePractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		//Find Facebook sign-up button from the registration form present in Facebook application.(Child)
	//	driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]")).click();
		
	
		//Locate firstname field from SignUp button in facebook (parent)
		//button[text()='Sign Up']/parent::div/parent::*/child::div[1]/div/div[1]
	//	driver.findElement(By.xpath("//button[text()='Sign Up']/parent::*/parent::*/child::div[1]/div/div[1]"));
		
		//Identify the password field from Mobile number field in facebook (following)
		//input[@name='reg_email__']/following::input
	//	driver.findElement(By.xpath("//input[@name='reg_email__']/following::input"));
		
		//Locate the mobile number field from new password field in facebook (preceding)
		//input[@name='reg_passwd__']/preceding::input[1]
		driver.findElement(By.xpath("//input[@name='reg_passwd__']/preceding::input[1]")).sendKeys("axy123^&*");

		
	}

}
