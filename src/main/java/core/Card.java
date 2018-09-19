package core;

public class Card {
	protected String name;				// Name of the card
	protected int value;				// Scoring value of card
	protected boolean faceup = false;	// Is the card faceup? 0=no, 1=yes
	
	//Unused
	public Card() {
	}
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean getFaceup() {
		return this.faceup;
	}
	
	//Changes flips the boolean faceup value
	public boolean flip() {
		this.faceup= !this.faceup;
		return this.faceup;
	}
	
}

