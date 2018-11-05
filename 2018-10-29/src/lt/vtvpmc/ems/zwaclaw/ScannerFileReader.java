package lt.vtvpmc.ems.zwaclaw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ScannerFileReader {
    public static void main(String[] args) throws Exception {
        readFileOne();
    }

    public static void readFileOne() throws Exception{
        String separator = File.separator;
        String path = separator + "home" + separator + "eivis" + separator + "Desktop" + separator + "java.txt";
        File file = new File(path);
        Scanner reader = new Scanner(file);
        BufferedWriter bw = new BufferedWriter(new FileWriter("kazkas3.txt"));
        while (reader.hasNext()){
            System.out.println(reader.nextLine());
            String line = reader.nextLine();
            bw.write(line);

            for (int i = 0; i < line.length(); i++){
                bw.write(line.charAt(i));
            }
            bw.close();
        }
        reader.close();
        System.out.println("Done");
    }
}
