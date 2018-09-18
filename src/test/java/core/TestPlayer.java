package core;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class TestPlayer extends TestCase{
	
	//Unit testing Player class
	public void testPlayer_U() {
		//Create instances for testing
		Player player = new Player();
		
		//Check properly initialized
		assertEquals("new", player.getState());
	}
	
}
