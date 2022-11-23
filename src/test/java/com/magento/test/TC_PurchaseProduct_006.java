package com.magento.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_PurchaseProduct_006 {
	
	public static WebDriver driver;
	public static JavascriptExecutor jse;
	
	@BeforeTest
	public void lauchApp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.techpanda.org/index.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void purchaseProduct() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.linkText("Log In")).click();
		
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushan.bb@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("bhushanbb");
		
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		//Thread.sleep(3000);
		
		
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  WebElement myWishList =
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//a[contains(@href,'http://live.techpanda.org/index.php/wishlist/')])[2]")));
		  myWishList.click();
		
		//driver.findElement(By.cssSelector("a[href*='wishlist']")).click();
		//driver.findElement(By.xpath("(//a[text()='My Wishlist'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		//driver.findElement(By.xpath("//button[@title='Proceed to Checkout']")).click();
		
		WebElement dropState = driver.findElement(By.id("region_id"));
		Select select = new Select(dropState);
		
		select.selectByValue("43");
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("35242");
		
		driver.findElement(By.xpath("//button[@title='Estimate']")).click();
		
		WebElement fixedRateCheckBox = driver.findElement(By.xpath("//input[@class='radio']"));
		boolean isDisplayed = fixedRateCheckBox.isDisplayed();
		System.out.println(isDisplayed);
		boolean isSelected = fixedRateCheckBox.isSelected();
		System.out.println(isSelected);
		
		String flatRate = "Fixed - $5.00";
		String vFlatRate = driver.findElement(By.xpath("//label[@for='s_method_flatrate_flatrate']")).getText();
		System.out.println(vFlatRate);
		Assert.assertEquals(flatRate, vFlatRate);
		
		driver.findElement(By.xpath("//button[@name='do']")).click();
		
		driver.findElement(By.xpath("(//button[@title='Proceed to Checkout'])[2]")).click();
		//driver.findElement(By.xpath("//span[text()='Place OrdeShip to this address']")).click();
		
		//driver.findElement(By.id("billing:company")).sendKeys("Arayvarta Gaming Company");
		/*
		 * jse = (JavascriptExecutor) driver;
		 * jse.executeScript("window.scrollBy(0,300)", "");
		 */
		
		Thread.sleep(3000);
		driver.findElement(By.id("billing:use_for_shipping_yes")).click();
		driver.findElement(By.xpath("(//span[text()='Continue'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Continue'])[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		
		String orderPlaced = "CHECKOUT";
		
		
		String vOrderPlaced = driver.findElement(By.xpath("//div[@class='page-title']//child::h1")).getText().toUpperCase();
		
		Assert.assertEquals(orderPlaced, vOrderPlaced);
		
		System.out.println("Hurray! Successful!");
		
		
		
	}
	

}
