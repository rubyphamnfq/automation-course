package auto.test;

import org.junit.Test;

public class DemoTest1 extends BaseTest {

	String customerId;

	@Test
	public void createCustomerTest() {
		newCustomerPage.createCustomer();
		customerId = newCustomerPage.getCustomerId();

		System.setProperty("customerId", customerId);
	}

	@Test
	public void createAccountTest() {
		newAccountPage.createAcc(customerId);

	}

}
