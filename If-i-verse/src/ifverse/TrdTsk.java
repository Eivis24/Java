package ifverse;

import java.util.Scanner;
import java.util.Random;

public class TrdTsk {
	public static void main(String [] args) {
		
		Scanner input=new Scanner(System.in);
		Random rand = new Random();
		int randomNum = rand.nextInt((100 - 1) + 1) + 1;//((max-min)+1)-min
		System.out.println("iveskite skaiciu nuo 1 iki 100");
		byte a =0;
		System.out.println(randomNum);
		a= input.nextByte();
		input.close();
		if(randomNum==a) {
			System.out.println("Stop using cheats MoFu");
		}
		else {
			System.out.println("Git Gud Noob");
		}
	}
}
