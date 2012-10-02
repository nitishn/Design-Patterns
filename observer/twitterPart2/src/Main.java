
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Assignment 1 code below
		 *
		/*
		 
		// There are two tweeters, nitish and bob 
		Tweeter nitish = new Tweeter("Nitish Narala");
		Tweeter bob = new Tweeter("Bob");
		
		// There are two readers, andrew and dickson
		// who are following nitish initially 
		Reader andrew = new Reader(nitish, "Andrew" );
		Reader dickson = new Reader(nitish, "Dickson" );
		
		// nitish tweets which triggers andrew and dickson to 
		// read what he has to say  
		nitish.setData("I'm tweeting!");
		
		// andrew can change which person he's following if he wants to!
		andrew.changeTweeter(bob);
		
		// when bob tweets, andrew now reads what bob has to 
		// say
		bob.setData("i'm bob");
		*/
		
		/*
		 * Assignment 2 code below
		 */
		// Andrew and Nitish are instantiated as twitterers
		TwitterNut nitish = new TwitterNut("Nitish");
		TwitterNut andrew = new TwitterNut("Andrew");
		
		// Nitish will start following andrew now
		nitish.followSomeone( andrew );
		
		// Andrew starts tweeting which triggers nitish to read what he 
		// has to say
		andrew.setData("I'm almost done!");
		andrew.setData("Doing UML !!");
		andrew.setData("Done!!");
		
		// Andrew now starts to follow nitish
		andrew.followSomeone( nitish );
		
		// Nitish tweets something which triggers andrew to read what he
		// has to say
		nitish.setData("segfault...");

	}

}
