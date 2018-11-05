package paketas;

public class IvedimasIsCMD {
	public static void main(String [] args) {
		for(int i=0; i<args.length;i++) {
			System.out.println("Hello " + args[i]);	
		}
		if(args.length<1) {
			System.out.println("Hello Unknown entity");
		}
	}
}