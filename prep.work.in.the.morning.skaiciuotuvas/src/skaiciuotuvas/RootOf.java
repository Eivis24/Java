package skaiciuotuvas;

public class RootOf {
	public static double root(double num, double root) {
	    if (num < 0) {
	        return -Math.pow(Math.abs(num), (1 / root));//how to return a string here?
	    }									//try using "try" method for this, more options to come
	    									//try checking with bolean if true do this class, else return message class
	    return Math.pow(num, 1.0 / root);
	}
}