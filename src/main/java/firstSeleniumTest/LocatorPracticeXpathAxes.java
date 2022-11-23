package firstSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPracticeXpathAxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//child
		String self_text = driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/self::a")).getText();
		System.out.println(self_text);
		
		//parent
		String parent_text = driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/parent::td")).getText();
		System.out.println(parent_text);
		
		
		
		//child
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/child::td"));
		//List<WebElement> childs = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		System.out.println(childs.size());
		
		for(int i=1; i<=childs.size();i++) {
			
			//System.out.println(childs.get(i).getText());
			//System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[2]")).getText());
			
		}
		
		//ancestor 
		String ancestor_text = driver.findElement(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr")).getText();
		System.out.println(ancestor_text);
		
		//following
		List<WebElement> following_text = driver.findElements(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/following::tr"));
		System.out.println(following_text.size());
		
		//preceding xPath
		List<WebElement> preceding_text = driver.findElements(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/preceding::tr"));
		System.out.println(preceding_text.size());
		
		//preceding-sibling
		List<WebElement> preceding_sibling_text = driver.findElements(By.xpath("//a[contains(text(),'MRP Agro')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println(preceding_sibling_text.size());
		
		
		
		
		
	
		
		
		
	}

}
