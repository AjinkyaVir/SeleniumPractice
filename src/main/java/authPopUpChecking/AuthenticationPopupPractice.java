package authPopUpChecking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String username = "admin";
		String URL ="https://"+username+":"+username+"@"+"the-internet.herokuapp.com/basic_auth";
		
		driver.get(URL);
		
		String str = driver.findElement(By.tagName("p")).getText();
		
		System.out.println(str);
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
	}

}
