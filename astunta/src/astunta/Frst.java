package astunta;

import java.util.Arrays;

public class Frst {
	public static void main(String [] args) {
		randomArray(10);
	}
	public static void randomArray(int size) {
		int [] numbers = new int[size];
		for(int i=0; i<numbers.length; i++) {
			numbers[i]= (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}