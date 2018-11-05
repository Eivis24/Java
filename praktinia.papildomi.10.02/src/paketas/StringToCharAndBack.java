package paketas;
import java.util.Arrays;
import java.util.Scanner;

public class StringToCharAndBack {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Iveskite zodi");
		String a= input.nextLine();
		input.close(); //sita eilute ivykdoma kai jau yra gautas a input
		stringToChar(a);
	}
	public static void stringToChar(String zodis){
		char[] a_arr = zodis.toCharArray();
		System.out.println(Arrays.toString(a_arr));
		charToString(a_arr);
	}
	public static void charToString(char [] w_array){
		String str = String.valueOf(w_array);
		System.out.printf(str);
	}
}