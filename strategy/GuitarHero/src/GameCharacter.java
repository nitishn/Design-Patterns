
public abstract class GameCharacter {

	GuitarBehavior guitarBehavior;
	SoloBehavior soloBehavior;
	
	public GameCharacter() {
		
	}

	public void playGuitar() {
		// TODO Auto-generated method stub
		guitarBehavior.play();
		
	}
	
	public void soloGuitar() {
		soloBehavior.solo();
		
	}


		
	
}
