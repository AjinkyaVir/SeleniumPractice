package impliciteWaitPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentwaitPractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		Wait wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement element = (WebElement) wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				WebElement e = t.findElement(By.xpath("//p[@id='demo']"));

				if (e.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) {

					System.out.println("Value is >>> " + e.getAttribute("innerHTML"));

					return e;

				}

				// If condition is not true then it will return null and it will keep checking
				// until condition is not true

				else {
					System.out.println("Value is >>> " + e.getAttribute("innerHTML"));

					return null;

				}
			}

		});

		 System.out.println("Final visible status is >>>>> " + element.isDisplayed());
		
	}

}
