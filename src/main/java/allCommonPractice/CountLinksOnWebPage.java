package allCommonPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksOnWebPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/flights");
		
		List<WebElement> wb =  driver.findElements(By.tagName("a"));
		System.out.println(wb.size());
		for(WebElement w: wb) {
			
			String str = w.getText();
			System.out.println(str);
			
		}
		
		driver.close();
		
	}

}
