package readMultipleDataFromExcelFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	
	@Test(dataProvider = "getData", dataProviderClass = ExcelFileReader.class)
	public void registration(String name, String email, String password, String phone) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.lambdatest.com/register");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
		

	}
	
}
