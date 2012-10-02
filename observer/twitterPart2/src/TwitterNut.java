import java.util.Observable;
import java.util.Observer;


public class TwitterNut extends Observable implements Observer {

	private String message = "";
	private String name = "";
	Observable observable;
	
	public TwitterNut( String name ) {
		
		
		this.name = name;
	}
	
	public void followSomeone(  Observable ob ) {
		this.observable = ob;
		
		observable.addObserver( this );
	}
	
	public void statusChanged() {
		
		setChanged();
		notifyObservers();
	}
	
	public void setData( String message ) {
		
		this.setMessage(message);
		statusChanged();
	}
	
	public void readTweet( String message, String name ) {
		System.out.println(this.name + " read that " + name + " said: " + message);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
	
		if( arg0 instanceof TwitterNut ) {
			TwitterNut TwitterNut = (TwitterNut)arg0;
			readTweet(TwitterNut.getMessage(), TwitterNut.getName() );
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
