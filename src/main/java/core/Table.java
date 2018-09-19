package core;

import java.util.LinkedList;

public class Table {
	private Dealer dealer;
	private Deck deck;
	private int size = 0;
	public static final int MAX_SIZE = 1;
	private String state = "invalid";
	private Game game;
	protected LinkedList<Player> players = new LinkedList<Player>(); 
	
	public Table(Deck deck, Dealer dealer) {
		this.dealer = dealer;
		this.deck = deck;
		this.state = "new";
	}
	
	public Dealer getDealer() {
		return this.dealer;
	}
	
	public Deck getDeck() {
		return this.deck;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public String getState() {
		return this.state;
	}
	
	private String updateState() {
		//
		if (game != null) {
			if(this.game.getState() == "playing") {
				this.state = "playing";
			}
		} else if (this.size > 0 &&  dealer != null) {
			this.state = "ready"; 
		} else { 
			this.state = "invalid"; 
		}
		return this.state;
	}	
	
	//Seat a new player if space is available and a game is
	//not being played
	public int sit(Player newPlayer) {
		int rc = -1;
		
		if(this.size < MAX_SIZE && this.state != "playing") { 
			players.add(newPlayer);
			this.size++;
			rc = this.size;
		}
		
		this.updateState();
		return rc;
	}
	
	//Start a new game
	public int start(Game newGame) {
		//null check newgame
		if(newGame == null) { return -1; }
		
		//table is already playing a game
		if(this.state == "playing") { return -2; }

		//newgame is already playing
		if(newGame.getState() == "playing") { return -3; }
		
		//Assign new game as tables game
		this.game = newGame;
		
		//update states
		game.setState("playing");
		this.updateState();
		
		//return number of players in playing new game
		return this.size + 1;
	}
	
}

