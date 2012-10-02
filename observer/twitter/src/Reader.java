import java.util.Observable;
import java.util.Observer;


public class Reader implements Observer {

	Observable observable;
	String name;
	
	public Reader( Observable ob, String name) {
		this.observable = ob;
		observable.addObserver(this);
		this.name = name;
	}
	
	public void readTweet( String message, String name ) {
		System.out.println(this.name + " read that " + name + " said: " + message);
	}
	
	public void changeTweeter( Observable ob ) {
		this.observable = ob;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
	
		if( arg0 instanceof Tweeter ) {
			Tweeter tweeter = (Tweeter)arg0;
			readTweet(tweeter.getMessage(), tweeter.getName() );
		}
	}


}
