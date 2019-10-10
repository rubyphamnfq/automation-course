package auto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickMenu(String name) {
		driver.findElement(By.xpath(String.format("//ul[@class=\"menusubnav\"]/li/a[text()=\"%s\"]", name) ));
	}
}
