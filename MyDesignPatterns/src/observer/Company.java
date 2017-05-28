package observer;

import java.util.Observable;


public class Company extends Observable{
	
	private String name;
	
	Company(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers();
	}

	
}
