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
		for (int i = 0; i < cards.size(); i++) {
		    this.score += (cards.get(i).getValue());
		}
		//update state
		if (this.score > 21) { this.state = "bust"; }
		else { this.state = "valid"; }
	}
	
	public int add(Card newCard) {
		// Null check input 
		if (newCard == null){ return -1; }
		if (this.state == "bust") { return -2; }
		
		// Add new card 
		cards.add(newCard);
		
		// Update fields
		this.size++;
		this.update();
		
		return 0;
	}
	
	
	public Hand split() {
		return null;
	}
}
