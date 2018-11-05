package paketas;

import java.util.Arrays;

public class ArraysDifferance {
	
	public static void main(String [] args) {
		//long startTime= System.currentTimeMillis();
		System.out.println();
		randomArray(10);
		//long endTime=System.currentTimeMillis();
		//System.out.println((endTime - startTime + "ms"));
	}
	
	public static void randomArray(int size) {
		int [] numbers = new int[size];
		for(int i=0; i<numbers.length; i++) {
			numbers[i]= (int)(Math.random()*10);
		}
		System.out.print(numbers);
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("\n");
		for(int elements : numbers) {
			System.out.println(elements);
		}
		System.out.println("\n");
		System.out.println(Arrays.toString(numbers));
		
//		int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
//		System.out.println(numbersCopy);
//		System.out.println(Arrays.toString(numbersCopy));
		//searchMaxNumber(numbers);
		//searchMinNumber(numbers);
	}
	public static void searchMaxNumber(int [] numbers) {
		int maxValue = 0;
		for (int i=0;i<numbers.length;i++) {
			if(maxValue<numbers[i]) {
				maxValue=numbers[i];
			}
		}
		System.out.println(maxValue);
	}
	public static void searchMinNumber(int [] numbers) {
		int minValue = 0;
		for (int i=0;i<numbers.length;i++) {
			if(minValue>numbers[i]) {
				minValue=numbers[i];
			}
		}
		System.out.println(minValue);
	}
}