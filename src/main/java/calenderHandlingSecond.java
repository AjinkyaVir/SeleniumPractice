import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderHandlingSecond {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("second_date_picker")).click();
		
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		driver.findElement(By.xpath("//a[text()='20']")).click();
		
		

	}

}
