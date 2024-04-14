package top.icewolf.medium.IoFileStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class EncodeFile {
    public static void main(String[] args) {
        // 文件路径
        String filepath = ".\\src\\main\\java\\top\\icewolf\\medium\\IoFileStream\\aaa\\test\\test.txt";
        File file = new File(filepath);
        // 编码文件, 默认UTF-8
        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            // 新建两个数组，一个放读取的内容，一个放转换后的内容
            char[] encoding = new char[(int)file.length()];
            char[] encoded = new char[(int)file.length()];
            // 读取文件内容
            for (int i = 0; i < encoding.length; i++) {
                int n = fileReader.read(); // 反复调用read()方法，直到返回-1
                if (n == -1) {
                    break;
                }
                // 把字符存到一个缓存数组里
                encoding[i] = (char)n;
            }
            System.out.println(encoding);
            // 转换数组
            for (int i=0;i<encoding.length;i++){
                // 判断是否为数字
                if(Character.isDigit(encoding[i])){
                    if(encoding[i] == '9') {
                        encoded[i] = '0';
                    } else {
                        encoded[i] = (char) (encoding[i] + 1);
                    }
                }
                // 判断是否为空格或 不为（字母或数字）也就是说符号
                if (Character.isWhitespace(encoding[i]) || !Character.isLetterOrDigit(encoding[i])){
                    encoded[i] = encoding[i];
                }
                // 判断是否为字母
                if (Character.isLetter(encoding[i])){
                    if (encoding[i] == 'z'){
                        encoded[i] = 'a';
                    }else if (encoding[i] == 'Z'){
                        encoded[i] = 'A';
                    }else encoded[i] = (char) (encoding[i]+1);
                }
            }
            // 输出转换后的内容
            System.out.println(encoded);
            // 输出转换后的内容到文件,FileWriter会清空文件，所以不能和上面的FileReader放在一起
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(encoded);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
