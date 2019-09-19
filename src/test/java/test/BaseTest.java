package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected WebDriver driver;

	@BeforeClass
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "/Users/phamthinhan/Documents/drivers/chromedriver");
	}

	@Before
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected WebElement findElement(By by) {
		try {
			return driver.findElement(by);

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	@AfterClass
	public static void afterAll() {
		//
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}

	}	

}
