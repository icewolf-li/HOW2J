package top.icewolf.medium.IoFileStream;

import java.io.*;
public class ZhiPu {
    public static void main(String[] args) {
        String sourceFile = ".\\src\\main\\java\\top\\icewolf\\medium\\IoFileStream\\aaa\\lol\\lol.exe";
        String targetFilePrefix = ".\\src\\main\\java\\top\\icewolf\\medium\\IoFileStream\\aaa\\lol\\lol.exe-";
        int bufferSize = 1024 * 100; // 100KB
        splitFile(sourceFile, targetFilePrefix, bufferSize);
    }

    public static void splitFile(String sourceFile, String targetFilePrefix, int bufferSize) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile))) {
            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            int partCounter = 0;

            while ((bytesRead = bis.read(buffer)) > 0) {
                String targetFile = targetFilePrefix + partCounter++;
                try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile))) {
                    bos.write(buffer, 0, bytesRead);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
