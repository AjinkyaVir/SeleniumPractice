package firstSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPracticeDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nseindia.com/market-data/top-gainers-loosers");
		driver.manage().window().maximize();
		
	
		List<WebElement> nifty = driver.findElements(By.xpath("//table[@id='topgainer-Table']/tbody/tr/td[2]"));
		System.out.println("Number of Top gainers:: "+ nifty.size());
		for(int i=1; i<=nifty.size();i++) {
			
			System.out.println(driver.findElement(By.xpath("//table[@id='topgainer-Table']/tbody/tr["+i+"]/td[2]")).getText());
			
		}
	}

}
