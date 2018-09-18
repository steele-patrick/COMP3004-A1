package core;

public class Hand extends Pile{
	private int score = 0;
	private String state = "new";	

	public int getScore() {
		return this.score;
	}

	public String getState() {
		return this.state;
	}

	private void update() {
		//update score
		//update state
	}
	
	public int add(Card newCard) {
		// Null check input 
		if (newCard == null){ return -1; }
		if (this.state == "bust") { return -2; }
		
		// Add new card 
		cards.add(newCard);
		
		// Update fields
		this.numCards++;
		this.update();
		
		return 0;
	}
	
	
	public Hand split() {
		return null;
	}
}
