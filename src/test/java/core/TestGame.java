package core;

import junit.framework.TestCase;

public class TestGame extends TestCase{
	
	public void testGame_U() {
	
		//Create instance of test objects
		Player player = new Player();
		Dealer dealer = new Dealer();
		Deck deck = new Deck();
		Game blackjack = new Game();
		Table table = new Table(deck, dealer);
		
		//Check proper initailization
		assertEquals("new", blackjack.getState());
		assertEquals(dealer, blackjack.getDealer());
		assertEquals(deck, blackjack.getDeck());
		assertEquals(player, blackjack.getPlayer());
		assertEquals(table, blackjack.getTable());
		
		//Check game state updates to ready state
		assertEquals("ready", blackjack.getState());
		
		//Start a game
		assertEquals(0, blackjack.start());
		
		//Check game state updates to playing
		assertEquals("playing", blackjack.getState());
		
		//Check players are dealt cards and scored 
		System.out.println(blackjack.view(player));
		System.out.println(blackjack.view(dealer));
		
		assertEquals(0, blackjack.score(player));
		assertEquals(0, blackjack.score(dealer));
		
		//Check player and dealer can hit
		assertEquals(0, blackjack.hit(player));
		assertEquals(0, blackjack.hit(dealer);
		
		//Check score updates
		assertEquals(0, blackjack.score(player));
		assertEquals(0, blackjack.score(player));
		
		
		
	}
		
}
