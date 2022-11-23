package handlingOfDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingOfDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(5000,0)", "");
		
		Select colors = new Select(driver.findElement(By.id("oldSelectMenu")));
		//colors.selectByIndex(3);
		
		colors.selectByVisibleText("Purple");
		System.out.println("Selected Option : " + colors.getFirstSelectedOption().getText());
		
		colors.selectByValue("7");
		System.out.println("Selected option : " + colors.getFirstSelectedOption().getText());
		
		/*
		 * List<WebElement> color_options = colors.getOptions(); for(WebElement colorr :
		 * color_options) { System.out.println(colorr.getText()); }
		 */
	
	
	}
	
}
