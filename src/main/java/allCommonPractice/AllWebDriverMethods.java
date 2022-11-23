package allCommonPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllWebDriverMethods {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

	}

}
