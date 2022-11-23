package dropDownPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement course = driver.findElement(By.id("course"));

		Select course_value = new Select(course);
		
		//course_value.selectByValue("python");
		
		//WebElement first_selected = course_value.getFirstSelectedOption();
		
		//System.out.println(first_selected.getText());
		
		List<WebElement> lc = course_value.getOptions();
		
		for(WebElement w : lc) {
			
			System.out.println(w.getText());
			
		}
		
		
	}

}
