package buildUp;

public class Main {
	public static void main (String[] args) {
		UnEvenNUmberIterator numberIterator = new UnEvenNUmberIterator();
		
		while (numberIterator.hasNext()) {
			System.out.println(numberIterator.next());
		}
	}
}