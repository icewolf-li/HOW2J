package top.icewolf.medium.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 查找文件 {
    static int num = 0;
    public static void main(String[] args) {
        JFrame f = new JFrame("使用多线程查找文件");
        f.setBounds(50,50,400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(3);

        // 创建文本框：路径
        // 创建按钮：查找
        // 创建标签：结果
        JTextField tf = new JTextField();
        tf.setBounds(20, 20, 300, 30);
        tf.setText("G:\\.Study\\HOW2J\\src\\main\\java\\top\\icewolf");
        JTextField tf1 = new JTextField();
        tf1.setBounds(20, 50, 300, 30);
        tf1.setText("file");

        JButton b = new JButton("查找");
        b.setBounds(320,20,60,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingWorker() {
                    @Override
                    protected Object doInBackground() throws Exception {
                        // 长耗时任务
                        System.out.println("执行这个SwingWorker的线程是: " + Thread.currentThread().getName());
                        JOptionPane.showMessageDialog(f,"一共找到"+search(new File(tf.getText()), tf1.getText())+"个");
                        num = 0;
                        return null;
                    }
                }.execute();
            }
        });

        f.add(tf);
        f.add(tf1);
        f.add(b);
        f.setVisible(true);
    }
    static int search(File folder, String search){
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                search(file,search);
            } else {
                try(FileReader fr = new FileReader(file)){
                    char[] chars = new char[(int) file.length()];
                    int read = fr.read(chars);
                    if (read != -1) {
                        String string = new String(chars);
                        if (string.contains(search)) {
                            System.out.println(file);
                            num++;
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return num;
    }
}
