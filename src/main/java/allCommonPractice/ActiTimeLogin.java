package allCommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		
		
		
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		
		WebElement text = driver.findElement(By.xpath("//a[starts-with(text(),'actiTIME')]"));
		
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
