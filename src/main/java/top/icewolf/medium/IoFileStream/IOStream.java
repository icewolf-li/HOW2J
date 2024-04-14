package top.icewolf.medium.IoFileStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args) {
        try {
            // 新建一个相对路径，是从src同级目录开始
            File dir = new File(".\\src\\main\\java\\top\\icewolf\\medium\\IoFileStream\\aaa\\test"); // 在src同级目录下开始
            // 判断目录是否存在。不存在就创建目录
            if (!dir.exists()) {
                dir.mkdirs();
            }
            // 创建一个名为test.txt的文件对象，用路径加文件名拼合
            File file = new File(dir,"test.txt");
            // 创建一个输出流，file是目录路径dir和文件名test.txt的组合
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            // 写入数据
            fileOutputStream.write("I Love You!".getBytes());
            // 关闭数据流
            fileOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

