package srautai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class numberOne {
	public static void main (String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("file.txt");
		FileOutputStream fos = new FileOutputStream("file_new.txt");
		try {
			int stack;
			while((stack= fis.read())!= -1) {
			fos .write(stack);	
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		finally {
			if(fis!= null) {
				fis.close();
			}
			if(fos!= null) {
				fos.close();
			}
		}
	}
}