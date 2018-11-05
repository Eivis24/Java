package paketas;

import java.util.Scanner;

public class ReverseString {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Iveskite zodi");
		String a= input.nextLine();
		input.close();
		reverseString(a);
	}
	public static void reverseString(String w) {
		String reverse = new StringBuffer(w).reverse().toString();
		System.out.println(reverse);
	}
}