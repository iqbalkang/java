package InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferedIO {

    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("/Users/iqbal-kang/Desktop/text.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(2);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

//        FileInputStream fis = new FileInputStream("/Users/iqbal-kang/Desktop/text.txt");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//
//        System.out.print((char) bis.read());
//        System.out.print((char) bis.read());
//        System.out.print((char) bis.read());
//        bis.mark(2);
//        System.out.print((char) bis.read());
//        System.out.print((char) bis.read());
//        bis.reset();
//        System.out.print((char) bis.read());
//        System.out.print((char) bis.read());

//        byte[] b = new byte[bis.available()];
//        bis.read(b);
//        String str = new String(b);
//        System.out.println(str);

//        for (byte by : b) {
//            System.out.println(by);
//        }
    }

}
