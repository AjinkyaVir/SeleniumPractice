package checkBoxExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxExample {

	@Test
	public void checkBoxExample() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		List<WebElement>  chkLanguage = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int chkSize = chkLanguage.size();
		System.out.println(chkSize);
		
		for(int i = 3; i<=chkSize-1; i++) {
			
			if(chkLanguage.get(i).isEnabled()) {
				chkLanguage.get(i).click();
			}
			
		}
		
		
	}
	
	
}
