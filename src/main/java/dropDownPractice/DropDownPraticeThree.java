package dropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPraticeThree {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.id("course"));
		
		Select course_select = new Select(courses);
		
		course_select.selectByIndex(3);
		
		WebElement ide = driver.findElement(By.xpath("//select[@id='ide']"));
		Select ide_select = new Select(ide);
		
		ide_select.selectByIndex(0);
		ide_select.selectByValue("vs");
		ide_select.selectByVisibleText("NetBeans");
		
		ide_select.deselectByValue("vs");
		ide_select.deselectByIndex(3);

		ide_select.selectByIndex(1);
	}

}
