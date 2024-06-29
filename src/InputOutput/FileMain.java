package InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileMain {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/iqbal-kang/Desktop/text.txt");
        file.setReadOnly();
        FileOutputStream fos = new FileOutputStream(file);



    }
}
