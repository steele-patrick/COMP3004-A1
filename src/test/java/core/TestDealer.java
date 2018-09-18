package core;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class TestDealer extends TestCase{
	
	//Unit testing of Dealer class
	//Note: Dealer is a Player
	public void testDealer_U(){
		//create instances for testing
		Dealer dealer = new Dealer();
		
		//Check properly initiatlized
		assertEquals("ready", dealer.getState());
	}
	
}
