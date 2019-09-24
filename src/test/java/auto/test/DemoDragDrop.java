package auto.test;

import org.junit.Test;

public class DemoDragDrop extends BaseTest {
	
	@Test
	public void dragDropTest() {
		// go to http://demo.guru99.com/test/drag_drop.html
		basePage.navigate("http://demo.guru99.com/test/drag_drop.html");
		
		// drag and drop BANK to Debit, SALES to Credit and Amount is 5000
		
		dragDropPage.dragToBox("BANK", "DEBIT", "Account");
		dragDropPage.dragToBox("5000", "DEBIT", "Amount");
		dragDropPage.dragToBox("SALES", "CREDIT", "Amount");
		dragDropPage.dragToBox("5000", "CREDIT", "Account");
		
		System.out.println("done");
	}

}
