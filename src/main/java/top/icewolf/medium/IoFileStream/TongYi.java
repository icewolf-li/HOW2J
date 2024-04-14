package top.icewolf.medium.IoFileStream;

import java.io.*;
public class TongYi {
    public static void main(String[] args) {
        String filePath = ".\\src\\main\\java\\top\\icewolf\\medium\\IoFileStream\\aaa\\lol\\lol.exe"; // 原始文件路径
        int chunkSize = 1024 * 100; // 每个子文件大小：100k

        try (FileInputStream fis = new FileInputStream(filePath)) {
            File originalFile = new File(filePath);
            long fileSize = originalFile.length();

            for (int i = 0; i < fileSize / chunkSize; i++) {
                byte[] buffer = new byte[chunkSize];
                fis.read(buffer);

                String subFileName = filePath + "-" + i;
                File subFile = new File(subFileName);

                try (FileOutputStream fos = new FileOutputStream(subFile)) {
                    fos.write(buffer);
                }
            }

            // 处理可能存在的剩余部分（不足一个完整chunk）
            long remainingBytes = fileSize % chunkSize;
            if (remainingBytes > 0) {
                byte[] remainderBuffer = new byte[(int) remainingBytes];
                fis.read(remainderBuffer);

                String subFileName = filePath + "-" + (fileSize / chunkSize);
                File subFile = new File(subFileName);

                try (FileOutputStream fos = new FileOutputStream(subFile)) {
                    fos.write(remainderBuffer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
