import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTripPractice {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		// WebDriver driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 */
		driver.get("https://www.cleartrip.com/flights");
		

		//To window Maximize
		driver.manage().window().maximize();
		
		//To refresh window
		driver.navigate().refresh();

		Thread.sleep(2000);
		
		//To scroll window
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,200)", "");
		  
		  //To perform action on selected webElement
		  Actions action = new Actions(driver);
		  
		  //To open form city drop down
		  driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).click();
		  
		  //To select city from drop down
			action.moveToElement(driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]//parent::div[1]//following::div[1]//p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']")))
			.click().perform();
			
			 //To open to city drop down
			driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).click();
			
			//To select city from drop down
			action.moveToElement(driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]//parent::div[1]//following::div[1]//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")))
			.click().perform();
			
			//To open depart on
		driver.findElement(By.xpath("(//div[@id='root']//descendant::div//button)[4]")).click();
		
		
		
		//To select date from calendar
		action.moveToElement(driver.findElement(By.xpath(
				"//div[@class='DayPicker-Body']//child::div[@class='DayPicker-Day']//descendant::div//child::div[1]")))
				.click().perform();
		
	
		//To search flight
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		
		List<WebElement> flight_count = driver.findElements(By.xpath("(//div[@data-testid='tupple'])"));
		
		System.out.println(flight_count.size());
		
		new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-testid='tupple'])[1]//button[text()='Book']"))).click();
		
		//(//div[@data-testid='tupple'])[11]//button[text()='Book']
		
		//To Book flight
		//driver.findElement(By.xpath("(//div[@class='flex'])[1]//button")).click();
		
		// Thread.sleep(5000);

		//driver.close();

	}

}
