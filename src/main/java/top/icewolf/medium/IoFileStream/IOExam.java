package top.icewolf.medium.IoFileStream;

import java.io.*;

public class IOExam {
    // 复制文件
    public static void copyFile(String srcFile, String destFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            bos.write(bis.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 复制文件夹下所有的文件
    public static void copyFolder(String srcFolder, String destFolder){
        File src=new File(srcFolder);
        File dest=new File(destFolder);
        if(!dest.exists()){
            dest.mkdirs();
        }
        if (!src.exists()) {
            System.out.println("路径不存在！！！");
        } else {
            File[] files = src.listFiles();

            for (File file:files) {
                String LJ=dest.getAbsolutePath()+"\\"+file.getName();
                // File.separator会自动根据操作系统生成相应的路径分隔符，windows是"\\"，linux是"/"
//                String LJ=dest.getAbsolutePath()+File.separator+file.getName();
                if (file.isDirectory()) {
                    copyFolder(file.getAbsolutePath(),LJ);
                } else {
                    copyFile(file.getAbsolutePath(),LJ);
                }
            }
        }
    }
}
