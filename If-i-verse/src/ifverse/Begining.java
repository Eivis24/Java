package ifverse;
import java.util.Scanner;

	public class Begining {
		public Begining() {	
		}
		public static void main(String[] args) {
			
			Scanner input=new Scanner(System.in);
			System.out.println("Iveskite tris krastines(a b c)");
			float a=0, b=0, c=0;
			a= input.nextFloat();
			b= input.nextFloat();
			c= input.nextFloat();
			input.close();
			if(a==0 || b==0 || c==0) {
				System.out.println("trikampis yra negzistuojantis");
			}
			else {
				if((a*a)+(b*b)==(c*c) || (b*b)+(c*c)==(a*a) || (a*a)+(c*c)==(b*b)){
					System.out.println("trikampis yra statusis");
				}
				else {
					System.out.println("trikampis nera statusis");
				}
			}
		}
}