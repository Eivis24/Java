package astunta;

import java.util.Arrays;

public class Frth {
	public static void main (String [] args) {
		String [] vardai= {"antanas", "rokas", "mantas", "aurelijus", "laura", "egle", "martyna", "juste", "liepa", "luka" };	
		System.out.println(Arrays.toString(vardai));
		Arrays.sort(vardai);
		System.out.println(Arrays.toString(vardai));
	}
}
