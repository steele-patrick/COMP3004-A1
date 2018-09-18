package core;

import junit.framework.TestCase;

public class TestHand extends TestCase{

	//Unit testing of Hand class
	//note: Hand is a Pile
	public void testHand_U(){
		//Create instances for testing
		Hand hand = new Hand();
		Card card = new Card("10D", 10);
		
		//Check properly initialized
		assertEquals(0, hand.getSize());
		assertEquals(0, hand.getScore());
		assertEquals("new", hand.getState());
		
		//Check add() method
		hand.add(card);
		
		assertEquals(1, hand.getSize());
		assertEquals(10, hand.getScore());
		
		//Check split() method
		assertEquals(null, hand.split());
	}
		
}
