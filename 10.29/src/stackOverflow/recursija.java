package stackOverflow;

public class recursija {
	public static void main (String[] args) {
		System.out.println("recursionb start");
		simpleRecursion(5);
	}
	public static void recursionEcho(int number) {
		System.out.println("First recursionEcho section" + number);
	}
	public static void simpleRecursion(int number) {
		number++;
		System.out.println("First recursion section");
		if(number!=10) {
			recursionEcho(number);
		}
		System.out.println("second recursion section" + number);
	}
}
