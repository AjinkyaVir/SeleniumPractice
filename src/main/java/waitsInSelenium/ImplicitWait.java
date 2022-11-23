package waitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String aString = "Demo Guru99 Page";
		String aeString = " ";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		aeString = driver.getTitle();
		
		if(aString.equals(aeString)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test failed");
		}

		driver.close();
		
	}

}
