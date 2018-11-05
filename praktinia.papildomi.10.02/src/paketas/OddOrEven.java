package paketas;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Iveskite skaicius");
		double s = input.nextDouble();
		input.close();
		checkEr(s);
	}
	public static void checkEr(double num) {
		if(num%2==0) {
			System.out.println("Skaicius lyginis");
		}
		else {
			System.out.println("Skaicius nelyginis");
		}
	}
}