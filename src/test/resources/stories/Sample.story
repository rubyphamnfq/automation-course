Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
				 
Scenario:  Add new Customer
Given I navigate 'http://demo.guru99.com/V2/webpages/addcustomerpage.php'
When I input customer name as '<customerName>' on add new customer form
When I check gender as '<gender>' on add new customer form
When I input day of birth as '<dob>' on add new customer form
When I input address as '<address>' on add new customer form
When I input city as '<city>' on add new customer form
When I input state as '<state>' on add new customer form
When I input pin as '<pin>' on add new customer form
When I input mobile no. as '<mobileNo>' on add new customer form
When I input email as '<email>' on add new customer form
When I click Submit button on add new customer form

Examples:
|customerName	|gender	|dob		|address	|city	|state	|pin	|mobileNo	|email			|
|Ruby Pham		|female	|10/12/2019	|Q9			|HCM	|NA		|123456	|0123456789	|r1@gmail.com	|

			 
Scenario:  Add new Account
Meta:
@skip

Given I navigate 'http://demo.guru99.com/V2/webpages/addAccount.php'
When I input customer id as '<customerId>' on add new account form
When I input account type as '<accType>' on add new account form
When I input initial deposit as '<initDeposit>' on add new account form
When I click Submit button on add new account form

Examples:
|customerId	|accType	|initDeposit	|
|1234456	|Savings	|5000			|
|abcd		|Current	|102			|
