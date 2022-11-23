package fileUploadPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		//WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		//uploadFile.sendKeys("E:\\All\\test.txt");
		

	     File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(f, new File("E:\\All\\test.png"));
	     
	     System.out.println("Screenshot taken");


	}

}
