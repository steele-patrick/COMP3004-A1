package core;

public class Player {
	private String state = "new";
	private Hand hand = new Hand();
	
	public String getState() {
		return this.state;
	}
}
