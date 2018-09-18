package core;

public class TestDeck {
	
	//Unit testing of Deck class
	//Note: Deck is a Pile
	public void testDeck(){
		//Create default Deck for testing
		Deck deck = new Deck();
		
		//Check properly initialized
		assertEquals(52, card_2H.getNumCards());
	}
	
}
