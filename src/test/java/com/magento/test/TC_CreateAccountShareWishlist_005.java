package com.magento.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CreateAccountShareWishlist_005 {
	
	static WebDriver driver;
	public static String firstName = "Allu";
	public static String lastName = "Arjun";
	public static String middleName = "BabuRao";
	
	
	@BeforeTest
	public void launchUrl() {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/index.php");
	}

	@Test
	public void createAccount() {
		
		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		driver.findElement(By.id("middlename")).sendKeys(middleName);
		driver.findElement(By.id("lastname")).sendKeys(lastName);
		driver.findElement(By.id("email_address")).sendKeys("bhushan.bb@gmail.com");
		driver.findElement(By.id("password")).sendKeys("bhushanbb");
		driver.findElement(By.id("confirmation")).sendKeys("bhushanbb");
		
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		
		String welcome = ("Welcome, " + firstName + " " + middleName + " " + lastName +"!").toUpperCase();
		String vWelcome = driver.findElement(By.xpath("//p[@class='welcome-msg']")).getText().toUpperCase();
		System.out.println(vWelcome);
		
		try {
			Assert.assertEquals(welcome, vWelcome);
			System.out.println("Registration successfull");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void shareWishList() {
		
		driver.findElement(By.linkText("TV")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.linkText("Add to Wishlist")).click();
		driver.findElement(By.name("save_and_share")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.id("email_address")).sendKeys("absc@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Happy Buying ! Cheers !!");
		
		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
		
		String expectedConfirmShare = "Your Wishlist has been shared.";
		String actualConfirmShare = driver.findElement(By.xpath("//li[@class='success-msg']")).getText();
		
		try {
			Assert.assertEquals(expectedConfirmShare, actualConfirmShare);
			System.out.println("Wishlist shared successfully!");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	/*
	 * @AfterTest public void tearDown() throws InterruptedException {
	 * 
	 * Thread.sleep(3000); driver.quit();
	 * 
	 * }
	 */
}
