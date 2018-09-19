package core;

public class Game {
	private String state = "new";
	
	//DUMMY FUNCTION
	public String setState(String newState) {
		this.state = newState;
		return this.state;
	}
	
	public String getState() {
		return this.state;
	}
}
