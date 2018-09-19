package core;

import junit.framework.TestCase;

public class TestTable extends TestCase{
	//Unit testing of Table class
	public void testTable_U(){
		public void testTable_U() {
			//Create instances 
			Deck deck = new Deck();
			Dealer dealer = new Dealer();
			Player player = new Player();
			Table table = new Table(deck, dealer);
			Game blackjack = new Game();
			
			//Check properly initialized
			assertEquals(deck, Table.getDeck());
			assertEquals(dealer, Table.getDealer());
			assertEquals(0, table.getSize());
			assertEquals("new", table.getState());
			
			//Check sit() method
			assertEquals(1, table.sit(player));
			assertEquals(1, table.getSize());
			
			//Check table state is now ready
			assertEquals("ready", table.getState());
			
			//Start a game
			assertEquals(2, table.start(blackjack));
			assertEquals("playing", table.getState());			
		}
	}
		
}
