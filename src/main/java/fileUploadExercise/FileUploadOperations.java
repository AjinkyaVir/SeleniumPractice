package fileUploadExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadOperations {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		chooseFile.sendKeys("C:\\Users\\lenovo\\Downloads\\abcd.txt");
		System.out.println("File upload has been successful");
		
	}
	
}
