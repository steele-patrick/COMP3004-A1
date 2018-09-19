package core;

import junit.framework.TestCase;

public class TestDeck extends TestCase{
	
	//Unit testing of Deck class
	//note: Deck is a Pile
	public void testDeck_U(){
		// Create default Deck for testing
		Deck deck = new Deck();
		
		//Check properly initialized
		assertEquals(13, deck.getSize());
		
		//Check top() method
		assertEquals(3, deck.top().getValue());
		
		//Check shuffle() method
		assertEquals(0, deck.shuffle());

		//assertEquals(3, deck.top().getValue());
		
	}
	
}
