package core;

public class TestHand {

	//Unit testing of Hand class
	//Note: Hand is a Pile
	public void testHand(){
		//Create instances for testing
		Hand hand = new Hand();
		Card card = new Card("10D;")
		
		//Check properly initialized
		assertEquals(0, hand.getSize());
		assertEquals(0, hand.getScore());
		assertEquals(0, hand.getState());
		
		//Check add() method
		hand.add(card);
		
		assertEquals(10, hand.getSize());
		assertEquals(10, hand.getScore());
		
		//Check split() method
		assertEquals(null, hand.split());
	}
		
}
