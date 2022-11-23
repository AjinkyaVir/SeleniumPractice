package com.magento.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CompareProduct_004 {

	@Test
	public void compareProduct() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://live.techpanda.org/index.php/");
		
		driver.findElement(By.cssSelector("a.level0 ")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		String mainWinMobile1 = driver.findElement(By.xpath("//a[@title='Sony Xperia']")).getText().toUpperCase();
		System.out.println(mainWinMobile1);
		
		String mainWinMobile2 = driver.findElement(By.xpath("//a[text()='IPhone']")).getText().toUpperCase();
		System.out.println(mainWinMobile2);
		
		WebElement sony_Xperia = driver.findElement(By.xpath("//div[@class='product-info']//following::a[@title='Sony Xperia']//following::div//child::a[@class='link-compare']"));
	
		sony_Xperia.click();
		
		//Thread.sleep(3000);
		
	
		
		  WebElement IPhone = driver.findElement(By.xpath(
		  "//div[@class='product-info']//following::a[@title='IPhone']//following::div//child::a[@class='link-compare']"
		  ));
		  
		  IPhone.click();
		  
		  driver.findElement(By.xpath("//button[@title='Compare']")).click();
		  
		  for(String handle : driver.getWindowHandles()) {
		  driver.switchTo().window(handle); }
		  
		  String pageHead =
		  driver.findElement(By.xpath("//h1[text()='Compare Products']")).getText();
		  pageHead.toUpperCase(); String expectedHead = "COMPARE PRODUCTS";
		  Assert.assertEquals(expectedHead, pageHead,"Not match");
		  
		  String popUpWinMobile1 =
		  driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText().
		  toUpperCase(); System.out.println(popUpWinMobile1); String popUpWinMobile2 =
		  driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText().toUpperCase
		  ();
		  
		  Assert.assertEquals(mainWinMobile1, popUpWinMobile1,"Not match");
		  Assert.assertEquals(mainWinMobile2, popUpWinMobile2,"Not match");
		  
		  driver.close();
		  System.out.println("Popup closed ===> ");
			
			  for(String handle:driver.getWindowHandles()) {
			  driver.switchTo().window(handle); }
			 
		  
		  String winTitle = driver.getTitle();
		  System.out.println(winTitle);
		  
		  Thread.sleep(2000);
			driver.quit();

		 
		
	}
	
}
