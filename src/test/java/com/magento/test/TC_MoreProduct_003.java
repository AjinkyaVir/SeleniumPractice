package com.magento.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MoreProduct_003 {

	@Test
	public void productCount() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/index.php/");

		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");

		driver.findElement(By.xpath("//a[@title='Sony Xperia']//following::div[@class='actions']//button")).click();
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
		driver.findElement(By.xpath("//button[@title='Update']")).click();

		String expected_text = "Some of the products cannot be ordered in requested quantity.";

		String actual_text = driver.findElement(By.xpath("//ul[@class='messages']")).getText();
		try {
			Assert.assertEquals(expected_text, actual_text);
			System.out.println(actual_text);
		} catch (Exception e) {
			return;
		}

		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();

		String text = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		System.out.println(text);
		String expectedText = "SHOPPING CART IS EMPTY";
		try {
			Assert.assertEquals(expectedText, text);
			System.out.println(actual_text);
		} catch (Exception e) {
			return;
		}

	}

}
