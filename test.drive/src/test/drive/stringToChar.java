package test.drive;

import java.util.Scanner;

public class stringToChar {
	public static void changeStringToCharArray(String string) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String txt = input.toString();
		input.close();
		for(int chr=0;chr<txt.length();chr++) {
			txt.charAt(0);
		}
	}
}
