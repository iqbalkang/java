package InputOutput;

import java.io.*;
import java.util.Arrays;

public class SequenceInput {

    public static void write(String str) {
        try{
            FileOutputStream fos = new FileOutputStream("/Users/iqbal-kang/Desktop/text3.txt");
            fos.write(str.getBytes());
            fos.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void read() {
        try{
            FileInputStream fis1 = new FileInputStream("/Users/iqbal-kang/Desktop/text.txt");
            FileInputStream fis2 = new FileInputStream("/Users/iqbal-kang/Desktop/test2.txt");
            SequenceInputStream sis = new SequenceInputStream(fis2, fis1);


            byte[] byteArray = new byte[50];
            sis.read(byteArray);

            sis.close();
            fis1.close();
            fis2.close();

            String str = new String(byteArray);
            System.out.println(str);
            write(str);

        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        read();
    }
}
