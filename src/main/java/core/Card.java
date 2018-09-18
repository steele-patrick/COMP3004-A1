package core;



public class Card {
	private int value;
	private String name;
	
	public Card(int val, String nam) {
		this.value 	= val;
		this.name 	= nam;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}

}
