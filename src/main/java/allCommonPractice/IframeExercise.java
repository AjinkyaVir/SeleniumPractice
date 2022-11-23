package allCommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeExercise {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
		
		/*
		 * driver.switchTo().frame("a077aa5e");
		 * 
		 * driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		 * 
		 * System.out.println("Successfully executed");
		 */
		
		/*
		 * int size = driver.findElements(By.tagName("iframe")).size();
		 * 
		 * for(int i=0 ;i<=size; i++) {
		 * 
		 * driver.switchTo().frame(i); int total =
		 * driver.findElements(By.xpath("//img[@src='Jmeter720.png']")).size();
		 * System.out.println(total); driver.switchTo().defaultContent(); }
		 */
		driver.switchTo().frame(4);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
	}

}
