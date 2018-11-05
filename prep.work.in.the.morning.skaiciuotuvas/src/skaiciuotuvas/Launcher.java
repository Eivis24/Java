package skaiciuotuvas;

import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		String operand1="";
		double a = 0;
		double b = 0;
		System.out.println("Iveskite du skaicius ir veiksmo simboli(+,-,*,/,saknis,kelimas");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		operand1 = input.next();
		input.close();
		switch (operand1) {
	        case "+":  
	        	System.out.println(Adition.add(a, b));
	            break;
	        case "-":  
	        	System.out.println(Subtraction.sub(a, b));
	            break;
	        case "/":  
	        	System.out.println(Division.div(a, b));
	            break;
	        case "*":  
	        	System.out.println(Multiplication.multi(a, b));
	            break;
	        case "kelimas":  
	        	System.out.println(PowerOf.pwr(a, b));
	            break;
	        case "saknis":  
	        	System.out.println(RootOf.root(a, b) + " " + -RootOf.root(a, b));
	            break;
	        default: 
	        	System.out.println("Nieko neivesta");
	           	break;
		}
	}
}