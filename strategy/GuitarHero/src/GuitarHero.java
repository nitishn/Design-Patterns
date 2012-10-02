
public class GuitarHero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GameCharacter p1 = new GameCharacterSlash();
		GameCharacter p2 = new GameCharacterHendrix();
		p1.playGuitar();
		p1.soloGuitar();
		p2.playGuitar();
		p2.soloGuitar();

	}

}
