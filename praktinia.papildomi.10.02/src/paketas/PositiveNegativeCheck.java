package paketas;

import java.util.Scanner;

public class PositiveNegativeCheck {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Iveskite skaiciu");
		double s = input.nextDouble();
		input.close();
		checkEr(s);
	}
	public static void checkEr(double num) {
		if(num<0) {
			System.out.println("Skaicius neigiamas");
		}
		else if(num==0){
			System.out.println("Aš tik parašyta programa, ne dirbtinis intelektas - atsakyti negaliu");
		}
		else {
			System.out.println("Skaicius teigiamas");
		}
	}
}
