package top.icewolf.medium.IoFileStream;

import java.io.*;

/**
 * @author IceWolf
 * @date 2024/4/14
 * @time 12:54
 * @Description 删除文件中的单行注释
 */
public class CleanComments {
    /**
     * @param oldFile 原始文件
     * @param newFile 新的文件
     */
    public void removeComments(File oldFile,File newFile) {
        // 创建缓存读写流
        try(BufferedReader reader = new BufferedReader(new FileReader(oldFile));
            PrintWriter writer = new PrintWriter(new FileWriter(newFile))) {
            while (true) {
                // 读取一行
                String line = reader.readLine();
                // 如果是空行，则跳出循环，用contains判断是否为“//”
                if (null == line) {
                    break;
                } else if (!line.contains("//")) {
                    writer.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
