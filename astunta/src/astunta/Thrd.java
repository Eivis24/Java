package astunta;

import java.util.Arrays;

public class Thrd {
	public static void main(String [] args) {
		randomArray(20);
	}
	public static void randomArray(int size) {
		int [] number = new int[size];
		int [] number2 = new int[size];
		for(int i=0; i<number.length; i++) {
			number[i]= (int)(Math.random()*100);
			number2[i]= (int)(Math.random()*100);
		}
		Arrays.sort(number);
		Arrays.sort(number2);
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(number2));
		maxNumbers(number, number2);
	}
	public static void maxNumbers(int [] arr, int [] arr2) {
		int maxValue = 0;
		int maxValue2 = 0;
		for (int i=0; i<arr.length;++i) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
			if(arr2[i]>maxValue2) {
				maxValue2=arr2[i];
			}
		}
		System.out.println((maxValue+maxValue2)/2);
	}
}