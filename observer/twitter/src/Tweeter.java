import java.util.Observable;


public class Tweeter extends Observable {

	private String message = "";
	private String name = "";
	
	public Tweeter( String name ) {
		
		this.setName(name);
	}
	
	public void statusChanged() {
		
		setChanged();
		notifyObservers();
	}
	
	public void setData( String message ) {
		
		this.message = message;
		statusChanged();
	}	
	
	public String getMessage() {
		
		return message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
