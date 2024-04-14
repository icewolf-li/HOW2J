package top.icewolf.medium.IoFileStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args) {
        try {
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File file = new File(dir,"test.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("I Love You!".getBytes());
            fileOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

