package core;

import junit.framework.TestCase;

public class TestCard extends TestCase{

	public void testCard() {
		Card card1 = new Card(2, "2S");
		System.out.print(card1.getName());
	}
	
}
