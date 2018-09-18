package core;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class TestDealer {
	
	//Unit testing of Dealer class
	//Note: Dealer is a Player
	public void testDealer(){
		//create instances for testing
		Dealer dealer = new Dealer();
		
		//Check properly initiatlized
		assertEquals("ready", dealer.getState());
		assertEquals(null, dealer.getHands());
	}
	
}
