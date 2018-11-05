package test.drive;

import java.util.Scanner;

public class GcmLcm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println("The GCD of two numbers is: " + gcd(x, y));
		System.out.println("The LCM of two numbers is: " + lcm(x, y));
		input.close();
	}

	static int gcd(int x, int y) {
		int r = 0, a, b;//priskiriami kintamieji
		a = (x > y) ? x : y;//tikrina kuris skaicius yra didesnis ir prilygina didesni kaip a
		b = (x < y) ? x : y;//tikrina kuris skaicius yra mazesnis ir prilygina didesni kaip b
		r = b;//pagal nutylejima priskiria maziausia reiksme, nes maziausias skaicius gali buti maziausias bendras dalinamasis
		while (a % b != 0) {//kol skaiciai neturi bendro daliklio  vykdoma operacija
			r = a % b;//r prilygina liekanai dalinant didesni kintamaji is mazesnio
			a = b;//a paverciam i b
			b = r;//b paverciam i liekana
		}
		return r;//grazina r
	}

	static int lcm(int x, int y) {
		int a;
		a = (x > y) ? x : y;//a prilygina didesniam kintamajam
		while (true) {
			if (a % x == 0 && a % y == 0)//
				return a;//
			++a;
		}
	}

}