package namuiDarbai;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class kmi {
	public static void main(String [] args) throws IOException {
		
		calculatePersonsBMI();
	}
	public static void calculatePersonsBMI() throws IOException{
		int mass;
		double height; //in meters
		double bmi;
		String number;
//		kolkas console input
		BufferedReader buffReader = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Input client number");
		number = buffReader.readLine();
		System.out.println("Input client mass");
		mass = Integer.parseInt(buffReader.readLine());
		System.out.println("Input client height");
		height = Double.parseDouble(buffReader.readLine());
		bmi=mass/Math.pow(height,  2);
		try(FileOutputStream fileOutputStream = new FileOutputStream(number +".txt", true) ){
			DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
			Date date = new Date();
			dataOutputStream.writeBytes("date " + date + "\n");
			dataOutputStream.writeBytes("Height " + height+ "\n");
			dataOutputStream.writeBytes("Mass " + mass+ "\n");
			dataOutputStream.writeBytes("BMI " + bmi+ "\n");
		} catch(FileNotFoundException e) {
//			jul
			Logger.getLogger(kmi.class.getName()).log(Level.SEVERE, null, e);
		} catch(IOException e) {
			System.out.println("error " +e);
		}finally {
			System.out.println("Viskas pasibaige...");
		}
	}
}
