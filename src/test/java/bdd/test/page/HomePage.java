package bdd.test.page;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


	@When("I click menu '$name'")
	public void clickMenu(String name) {
		getDriver().findElement(By.xpath(String.format("//ul[@class=\"menusubnav\"]/li/a[text()=\"%s\"]", name) ));
	}
}
