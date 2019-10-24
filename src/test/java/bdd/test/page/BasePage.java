package bdd.test.page;

import static org.junit.Assert.assertNotNull;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;

public class BasePage  extends  PageObject{


	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected WebElement findElement(By by) {
		try {
			return getDriver().findElement(by);

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public void click(By by) {
		WebElement webElement = findElement(by);
		checkNotNull(by.toString(), webElement);
	}

	protected void checkNotNull(String name, WebElement webElement) {
		assertNotNull("Element " + name + " should be in the view.", webElement);
	}

	@Given("I navigate '$url'")
	public void navigate(String url) {
		getDriver().get(url);

	}

	protected void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		checkNotNull("Source", sourceElement);
		checkNotNull("Target", targetElement);
		Actions action = new Actions(getDriver());
		action.dragAndDrop(sourceElement, targetElement).build().perform();
	}
}
