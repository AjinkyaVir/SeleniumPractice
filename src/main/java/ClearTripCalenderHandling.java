import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClearTripCalenderHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='root']//child::div//child::div//child::label[2]//child::span")).click();

		driver.findElement(By.xpath("//div[@class='row']//child::div[3]//child::input")).sendKeys("Bangalore");
		
		Actions selectCity = new Actions(driver);
		
		WebElement eleCity = driver.findElement(By.xpath("//p[contains(text(),'Bangalore, IN - Kempegowda International Airport (')]"));
		
		Action selectFromCity = (Action) selectCity.moveToElement(eleCity)
				.click().build();
		
		selectFromCity.perform();
		
		driver.findElement(By.xpath("//div[@class='row']//child::div[3]//child::div[5]//child::input")).sendKeys("Mumbai");
		Actions select2City = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement toCity = driver.findElement(By.xpath("//p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']"));
		
		Action selectToCity = (Action) select2City.moveToElement(toCity)
				.click().build();
		
		selectToCity.perform();
	
		driver.findElement(By.xpath("//button[contains(@class,'flex')]/parent::div[contains(@class,'homeCalender')]/descendant::div")).click();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
