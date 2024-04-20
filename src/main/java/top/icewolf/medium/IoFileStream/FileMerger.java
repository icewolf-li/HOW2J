package top.icewolf.medium.IoFileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerger {

    public static void main(String[] args) {
        String outputFilePath = "src/main/resources/IoFileStream/merged.txt"; // 合并后的文件路径
        String[] inputFilePaths = {"src/main/resources/IoFileStream/test_1.txt",
                "src/main/resources/IoFileStream/test_2.txt",
                "src/main/resources/IoFileStream/test_3.txt",
                "src/main/resources/IoFileStream/test_4.txt",
                "src/main/resources/IoFileStream/test_5.txt"}; // 分割后的文件路径

        try {
            mergeFiles(outputFilePath, inputFilePaths);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mergeFiles(String outputFilePath, String[] inputFilePaths) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

        for (String inputFilePath : inputFilePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }

        writer.close();
    }
}
