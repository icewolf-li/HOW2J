package top.icewolf.medium.ThreadExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchThread {
    public static void Search(File dir,String search) {
        if (dir == null || !dir.exists()) {
            return;
        }

        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                Search(file,search);
            } else if (file.isFile()) {
//                new Thread(new Search(file,search)).start();

                // lamda表达式
                new Thread(() -> {
                    try(FileReader fr = new FileReader(file)){
                        char[] chars = new char[(int) file.length()];
                        int read = fr.read(chars);
                        if (read != -1) {
                            String string = new String(chars);
                            if (string.contains(search)) {
                                System.out.println(file);
                            }
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).start();// 要运行起来！！！
            }
        }
    }
}

class Search extends Thread {
    private File file;
    private String search;

    public Search(File file, String search) {
        this.file = file;
        this.search = search;
    }
    @Override
    public void run() {
        try(FileReader fr = new FileReader(file)){
            char[] chars = new char[(int) file.length()];
            int read = fr.read(chars);
            if (read != -1) {
                String string = new String(chars);
                if (string.contains(search)) {
                    System.out.println(file);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
