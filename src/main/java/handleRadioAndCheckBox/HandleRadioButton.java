package handleRadioAndCheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleRadioButton {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> male_radio_button = driver.findElements(By.xpath("//input[@name='sex']"));
		
		/*
		 * boolean isDisplay = male_radio_button.isDisplayed();
		 * System.out.println("Male radio button button display = " + isDisplay);
		 * 
		 * boolean isEnable = male_radio_button.isEnabled();
		 * System.out.println("Male radio button is enabled : " + isEnable);
		 * 
		 * boolean isSelected = male_radio_button.isSelected();
		 * System.out.println("Male radion button is selected : " + isSelected);
		 * 
		 * male_radio_button.click();
		 * 
		 * boolean isSelected1 = male_radio_button.isSelected();
		 * System.out.println("Male radion button is selected : " + isSelected1);
		 */
		
		
		
		
		  int sex =  male_radio_button.size();
		  System.out.println(sex);
			
		
		  for(int i=0;i<sex;i++) {
		  driver.findElements(By.xpath("//input[@name='sex']")).get(1).click(); }
		 
		
	}
	
}
