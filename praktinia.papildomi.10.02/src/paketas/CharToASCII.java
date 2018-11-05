package paketas;

import java.util.Scanner;

public class CharToASCII {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Iveskite simboli");
		char s = input.next(".").charAt(0);
		input.close();
		int ascii = (int) s;
		System.out.println(ascii);
	}
}
