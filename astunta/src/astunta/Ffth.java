package astunta;

import java.util.Arrays;

public class Ffth {
	public static void main(String [] args) {
		randomArray(50000);
	}
	public static void randomArray(int size) {
		int [] number = new int[size];
		for(int i=0; i<number.length; i++) {
			number[i]= (int)(Math.random()*100);
		}
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}
}
