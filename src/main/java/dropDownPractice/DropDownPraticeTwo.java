package dropDownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPraticeTwo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.id("course"));
		
		Select course_select = new Select(courses);
		
		course_select.selectByIndex(1);
		
		WebElement ide = driver.findElement(By.xpath("//select[@id='ide']"));
		Select ide_select = new Select(ide);
		
		//List<WebElement> dropdown = ide_select.getOptions();
		
		ide_select.selectByIndex(0);
		ide_select.selectByIndex(1);
		ide_select.selectByIndex(3);
		
		ide_select.deselectByIndex(3);
		
		
	}

}
