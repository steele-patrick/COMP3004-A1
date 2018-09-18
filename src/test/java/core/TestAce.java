package core;

import junit.framework.TestCase;

public class TestAce extends TestCase{
	
	//Unit testing of Ace class
	//note: Ace extends Card
	public void testAce_U(){
		//Create instance of Ace
		Ace ace = new Ace("AS");
		
		//Check properly initialized
		assertEquals(11, ace.getValue());		
	}

}
