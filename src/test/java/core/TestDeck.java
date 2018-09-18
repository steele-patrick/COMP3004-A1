package core;

import junit.framework.TestCase;

public class TestDeck extends TestCase{
	
	//Unit testing of Deck class
	//note: Deck is a Pile
	public void testDeck_U(){
		// Create default Deck for testing
		Deck deck = new Deck();
		
		//Check properly initialized
		assertEquals(52, deck.getSize());
		
		//Check top() method
		deck.top();
		
		//Check shuffle() method
		assertEquals(0, deck.shuffle());
		
	}
	
}
