package ifverse;
import java.util.Scanner;
import java.math.BigInteger;

public class Fibo {
	public static void main(String [] args) {		
		//long startTime= System.currentTimeMillis(); //kaip naudotis?
		Scanner input=new Scanner(System.in);
		System.out.println("iveskite skaiciu kieki");
		int n=input.nextInt();
		input.close();
		BigInteger first = new BigInteger("0");
		BigInteger second = new BigInteger("0");
		BigInteger third = new BigInteger("0");
		byte count=0;
		for(int i=1;i<n;i++) {
			if(count<1) {
				second=second.add(BigInteger.valueOf(1));
				System.out.println(second);
				first=second.add(third);
				System.out.println(first);
				count=3;
			}
			else {
					third=second.add(first);
					first=second;			
					second=third;
					System.out.println(third);
				}
			}
		}
	}
//22395