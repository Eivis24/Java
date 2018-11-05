package ifverse;
import java.util.Scanner;

public class Masyvai {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		int[] myArray = {15,42,63,24,5};
		int a=0;
		System.out.println("Pasirinkite skaiciu kurio ieskote");
		a= input.nextInt();
		input.close();
		linearSearch(myArray, a);
	}
	public static void linearSearch (int[] myArray, int a) {
		for(int i=0; i<myArray.length;i++)
		{
			if(myArray[i]==a) {
				System.out.println(myArray[i]+ " yra " + i + "-oje pozicijoje");
			}
			else {
				System.out.println("eik rukyk");
			}
		}
	}
}


// long startTime= System.currentTimeMillis;