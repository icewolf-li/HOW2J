package top.icewolf.IoFileStream;

import top.icewolf.medium.IoFileStream.CleanComments;

import java.io.File;

public class TestCleanComments {
    public static void main(String[] args) {
        File oldfile = new File(".\\src\\main\\resources\\IoFileStream\\IOStream.java");
        File newfile = new File(".\\src\\main\\resources\\IoFileStream\\IOStream_new.java");

        CleanComments cleanComments = new CleanComments();

        cleanComments.removeComments(oldfile, newfile);

    }
}
