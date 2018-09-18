package core;

import java.util.*;

public abstract class Pile {
	
	protected LinkedList<Card> cards = new LinkedList<Card>(); 	// Storage for cards
	protected int size = 0;									// Number of cards
	
	public int getSize() {
		return this.size;
	}
	
}
