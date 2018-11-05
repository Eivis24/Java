package ifverse;
import java.util.Scanner;

public class SndTsk {
	public SndTsk(){
	}
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Iveskite tris kintamuosius (a b c)");
		float a=0, b=0, c=0;
		a= input.nextFloat();
		b= input.nextFloat();
		c= input.nextFloat();
		input.close();
		if (a!= (double)a || b!= (double)b || c!= (double)c) {
			//pavyko padaryti jog int variantu nedirbtu su kablelinem reiksmem
			System.out.println("Nieko nebus, nedirbu su raidem");
		}
		else {
			/*
			 * reikia kad funkcija paskaiciuotu diskriminanta
			 * D=b^2 - 4ac
			 * ir x1,x2 kai D>0
			 * x1= (-b + sqrt(D)/2a)
			 * x2= (-b - sqrt(D)/2a)
			 */
			if(a==0 && b==0 && c==0) {
				System.out.println("Nieko nebus, neivedet kintamuju");
			}
			else {
				double D=0.0, x1=0.0, x2= 0.0; //kodel IDE keikiasi kai naudoju float vietoj double?
				D=(Math.pow(b, 2) -4*a*c);//gal del pow funkcijos?
				x1=((-b + Math.sqrt(D))/2);//arba del sqrt?
				x2=((-b - Math.sqrt(D))/2);
				System.out.printf("Diskriminanto verte yra = " + "%.2f",D);
				if (D<0) {
					System.out.printf(" As nezinau kaip traukti sakni is neigiamos reiksmes ");
				}
				else {
					System.out.println("");
					System.out.printf("X1 verte yra = " + "%.2f",x1);
					System.out.println("");
					System.out.printf("X2 verte yra = " + "%.2f",x2);
					System.out.println("");
				}
			}
		}
	}
}