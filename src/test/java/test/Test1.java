package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 extends BaseTest {


	@Test
	public void test1() {

		driver.navigate().to("http://demo.guru99.com/Agile_Project/Agi_V1/");

		findElement(By.name("uid")).sendKeys("1303");
		findElement(By.name("password")).sendKeys("Guru99");
		findElement(By.name("btnLogin")).click();

		WebElement logoutTxt = findElement(By.xpath("//*[text()=\"Log out\"]"));
		assertNotNull("Logout link should be available.", logoutTxt);
		assertEquals("", "");

	}

	@Test
	public void test3_RadioBtnAndCheckbox() {

		driver.navigate().to("http://demo.guru99.com/test/radio.html");

		findElement(By.xpath("//input[@type=\"radio\" and @value=\"Option 1\" ]")).click();
		findElement(By.xpath("//input[@type=\"checkbox\" and @value=\"checkbox2\" ]")).click();
		wait(10);
	}

	

	

}
