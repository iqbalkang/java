package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class main {

    public static void write() {
        String text = "hello world!!!";
        try{
            FileOutputStream fos = new FileOutputStream("/Users/iqbal-kang/Desktop/text.txt");
            fos.write(text.getBytes());
            fos.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void read() {
        try{
            FileInputStream fis = new FileInputStream("/Users/iqbal-kang/Desktop/text.txt");
            byte[] byteArray = new byte[fis.available()];
            fis.read(byteArray);
            fis.close();

            String str = new String(byteArray);
            System.out.println(str);

        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        write();
        read();
    }
}
