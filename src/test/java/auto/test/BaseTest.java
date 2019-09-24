package auto.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import auto.page.BasePage;
import auto.page.DragDropPage;
import auto.page.HomePage;
import auto.page.NewAccountPage;
import auto.page.NewCustomerPage;
import auto.page.NewCustomizedStatementPage;

public class BaseTest {
	private WebDriver driver;

	protected BasePage basePage;
	protected HomePage homePage;
	protected NewAccountPage newAccountPage;
	protected NewCustomerPage newCustomerPage;
	protected NewCustomizedStatementPage newCustomizedStatementPage;
	protected DragDropPage dragDropPage;
	
	
	@BeforeClass
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "/Users/phamthinhan/Documents/drivers/chromedriver");
	}

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		basePage = new BasePage(driver);
		homePage = new HomePage(driver);
		newAccountPage = new NewAccountPage(driver);
		newCustomerPage = new NewCustomerPage(driver);
		newCustomizedStatementPage = new NewCustomizedStatementPage(driver);
		dragDropPage = new DragDropPage(driver);
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
