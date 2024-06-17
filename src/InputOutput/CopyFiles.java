package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("/Users/iqbal-kang/Desktop/text.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);

            String str = new String(b);
            str = str.toUpperCase();

            FileOutputStream fos = new FileOutputStream("/Users/iqbal-kang/Desktop/test2.txt");
            fos.write(str.getBytes());

            fis.close();
            fos.close();


        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }
    }

}
