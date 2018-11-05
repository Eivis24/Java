package greaterDiagram;

public class Greeter {
	private String message;
	public Greeter ( String message ) {
		this.message = message;
	}
	public String greet (String name, String surName) {
		return(message + " " + name + " " + surName);
	}	
}