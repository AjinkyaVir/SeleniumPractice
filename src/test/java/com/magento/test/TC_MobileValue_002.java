package com.magento.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MobileValue_002 {

	@Test
	public void mobileValue() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		
		List<WebElement> mobiles = driver.findElements(By.xpath("//li[@class='item last']//child::h2[@class='product-name']/a"));
		
		for(WebElement s: mobiles) {
			System.out.println(s.getText());
		}
		
		String mobile_name = driver.findElement(By.xpath("//a[@title='Sony Xperia']")).getText();
		System.out.println(mobile_name);
		
		
		  
		  String list_page_cost = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		  System.out.println(list_page_cost);
		  driver.findElement(By.xpath("//a[@title='Sony Xperia']")).click();
		  
		  String detail_page_cost = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		  System.out.println(detail_page_cost);
		  
			/*
			 * if(list_page_cost.equals(detail_page_cost)) {
			 * 
			 * System.out.println("Product value is same.");
			 * 
			 * }
			 */
		 Assert.assertEquals(list_page_cost,detail_page_cost ,"Cost of mobile is not same on PLP and DPP");
		
		
		
	}
	
}
