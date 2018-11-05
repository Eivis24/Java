import java.util.Arrays;
import java.util.Scanner;

public class matrica {
	public static void main(String [] args) {
		System.out.println("Matricos dydis (x) ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		long startTime= System.currentTimeMillis();
		matrixArray(x);
		long endTime=System.currentTimeMillis();
		System.out.println((endTime - startTime + "ms"));
	}
	public static void matrixArray(int size) {
		int [][] numbers = new int[size][size];
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			for(int y=0; y<numbers[i].length; y++) {
				if(i!=y) {
					numbers[i][y]=0;
				}
				else {
					numbers[i][y]=1;
					++sum;
				}
			}
			System.out.println(Arrays.toString(numbers[i]));
		}
		System.out.println(sum);
	}
	}