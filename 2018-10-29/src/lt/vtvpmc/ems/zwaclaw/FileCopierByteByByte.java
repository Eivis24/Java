package lt.vtvpmc.ems.zwaclaw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopierByteByByte {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("java.txt");
        FileOutputStream fos = new FileOutputStream("java_new1.txt");
        try {
          int stack;
          while ((stack = fis.read()) != -1){
              fos.write(stack);
          }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (fis != null){ //<--null
                fis.close();
                System.out.println("Closed");
                fis.close();
                System.out.println("Closed");
            }
            if (fos != null){
                fos.close();
                System.out.println("Closed");
            }
        }
    }
}
