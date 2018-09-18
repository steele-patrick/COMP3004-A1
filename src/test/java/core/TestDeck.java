package core;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class TestDeck extends TestCase{
	
	//Unit testing of Deck class
	//Note: Deck is a Pile
	public void testDeck_U(){
		//Create default Deck for testing
		Deck deck = new Deck();
		
		//Check properly initialized
		assertEquals(52, deck.getSize());
	}
	
}
