package allCommonPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-shirt",Keys.ENTER);
		
		List<WebElement> searchProduct = driver.findElements(By.xpath("//div[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]//child::h5//span"));
		int size = searchProduct.size();
		System.out.println(size);
		for(WebElement tshirt : searchProduct) {
			
			System.out.println(tshirt.getText().toString());
			
		}
		
		
		

	}

}
