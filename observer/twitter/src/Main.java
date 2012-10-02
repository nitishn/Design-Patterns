
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Tweeter nitish = new Tweeter("Nitish Narala");
		Tweeter bob = new Tweeter("Bob");
		
		Reader andrew = new Reader(nitish, "Andrew" );
		Reader dickson = new Reader(nitish, "Dickson" );
		
		nitish.setData("I'm tweeting!");
		
		andrew.changeTweeter(bob);
		bob.setData("i'm bob");


	}

}
