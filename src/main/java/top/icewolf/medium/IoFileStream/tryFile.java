package top.icewolf.medium.IoFileStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class tryFile {
    public static void run() {
        File DIR = new File(".\\src\\main\\java\\top\\icewolf\\medium\\IoFileStream\\aaa\\test");
        File file = new File(DIR, "test.txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
        ) {
            // 判断目录是否存在。不存在就创建目录
            if (!DIR.exists()) {
                DIR.mkdirs();
            }
            // 写入数据
            fileOutputStream.write("Hello nodaoli!".getBytes());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
