package paketas;

public class RandomNumberGen {
	public static void main (String [] args){
		System.out.print(genANumber());
	}
	public static int genANumber(){
		int number= (int)(Math.random()*100);
		return(number);
	}
}
