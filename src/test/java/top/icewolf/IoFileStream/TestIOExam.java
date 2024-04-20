package top.icewolf.IoFileStream;

import top.icewolf.medium.IoFileStream.IOExam;

public class TestIOExam {
    public static void main(String[] args) {
        IOExam.copyFile("src\\main\\resources\\IoFileStream\\copy\\file.txt","src\\main\\resources\\IoFileStream\\copy\\file2.txt");
        
        IOExam.copyFolder("src\\main\\resources\\IoFileStream\\copy\\srcCopy","src\\main\\resources\\IoFileStream\\copy\\srcCopy2");
    }
}
