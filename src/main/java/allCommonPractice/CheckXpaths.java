package allCommonPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckXpaths {

	@Test
	public void executeCode() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> listMenu = driver.findElements(By.xpath("//div[@id='narbar-menu']//child::ul"));
		System.out.println(listMenu.size());
		for(WebElement ee : listMenu) {
			
			System.out.println(ee.getText());
			
		}
		
		driver.findElement(By.xpath("//div[@id='narbar-menu']//child::a[text()='Desktops']")).click();
		
	}
	
	
}
