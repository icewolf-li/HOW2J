package top.icewolf.medium.IoFileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSplitter {

    public static void main(String[] args) {
        String inputFilePath = "src/main/resources/IoFileStream/test.txt"; // 输入文件路径
        int chunkSize = 1000; // 每个文件的字符数

        try {
            splitFile(inputFilePath, chunkSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void splitFile(String inputFilePath, int chunkSize) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        StringBuilder buffer = new StringBuilder();
        String line;
        int fileCount = 1;

        while ((line = reader.readLine()) != null) {
            buffer.append(line);
            buffer.append("\n");

            if (buffer.length() >= chunkSize) {
                String outputFilePath = getOutputFilePath(inputFilePath, fileCount);
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
                writer.write(buffer.toString());
                writer.close();
                buffer.setLength(0);
                fileCount++;
            }
        }

        if (buffer.length() > 0) {
            String outputFilePath = getOutputFilePath(inputFilePath, fileCount);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(buffer.toString());
            writer.close();
        }

        reader.close();
    }

    public static String getOutputFilePath(String inputFilePath, int fileCount) {
        String fileName = inputFilePath.substring(inputFilePath.lastIndexOf("/") + 1, inputFilePath.lastIndexOf(".txt"));
        return inputFilePath.replace(fileName + ".txt", fileName + "_" + fileCount + ".txt");
    }
}
