package paketas;

import java.util.Scanner;

public class MaxOfArray {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Iveskite skaicius");
		double [] s = new double [size];
		input.close();
		maxOf(s);
	}
	public static void maxOf(double [] arr) {
		double topNum=0;
		if(arr.length<1) {
			System.out.println("Neivedet jokio skaiciaus");
		}
		else if(arr[0]<0){
			System.out.println("Ivestas skaicius mazesnis uz nuli, iveskite daugiau nariu");
		}
		else{
			for(int i=0; i<arr.length;++i) {
				if(arr[i]>topNum) {
					topNum=arr[i];
				}
			}
		}
	}
}
