package allCommonPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleDropDownExample {

	@Test
	public void singleDropDownExample() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement course = driver.findElement(By.id("course"));
		
		Select select = new Select(course);
		
		select.selectByIndex(1);
		
		WebElement ide = driver.findElement(By.id("ide"));
		
		Select selectIde = new Select(ide);
		
		selectIde.selectByIndex(0);
		selectIde.selectByIndex(3);
		
		List<WebElement> ides = selectIde.getOptions();
		
		for(WebElement e : ides) {
			
			System.out.println(e.getText());
			
		}
		
	}

}
