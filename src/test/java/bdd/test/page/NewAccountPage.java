package bdd.test.page;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {

	@When("I create an account with '$customerId'")
	public void createAcc(String customerId) {
		// TODO Auto-generated method stub

	}

	@When("I input customer id as '$customerId' on add new account form")
	public void whenIInputCustomerIdAscustomerIdOnAddNewAccountForm(String customerId) {
		// PENDING
	}

	@When("I input account type as '$accType' on add new account form")
	public void whenIInputAccountTypeAsaccTypeOnAddNewAccountForm(String accType) {
		// PENDING
	}

	@When("I input initial deposit as '$initDeposit' on add new account form")
	public void whenIInputInitialDepositAsinitDepositOnAddNewAccountForm(int initDeposit) {
		// PENDING
	}

	@When("I click Submit button on add new account form")
	public void whenIClickSubmitButtonOnAddNewAccountForm() {
		
	}

}
