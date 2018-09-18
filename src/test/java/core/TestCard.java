package core;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class TestCard extends TestCase{

	//Unit testing of Card class
	public void testCard_U() {
		//Create instances for testing
		Card card_2H = new Card("2H",2);
		//Check properly initialized
		assertEquals(2, card_2H.getValue());
		assertEquals("2H", card_2H.getName());
		assertEquals(false, card_2H.getFaceup());
		
		//Check flip() method
		assertEquals(true, card_2H.flip());
		assertEquals(false, card_2H.flip());
	}
	
}
