import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandlingPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("first_date_picker")).click();
		
		List<WebElement> date =  (List<WebElement>) driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele : date) {
			
			String dd = ele.getText();
			
			if(dd.equalsIgnoreCase("10")) {
				ele.click();
				break;
			}
			
		}
		
	}

}
