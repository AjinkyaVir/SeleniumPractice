package allCommonPractice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotOfPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Date date = new Date();
		
		String sd = date.toString();
		
		String date2 = sd.replaceAll(":", "_");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\lenovo\\Downloads\\" + " ScreenShot - " + date2 + "\\google.png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
