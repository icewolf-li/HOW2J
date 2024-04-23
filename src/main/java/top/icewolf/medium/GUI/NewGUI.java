package top.icewolf.medium.GUI;

import javax.swing.*;
import java.io.*;

public class NewGUI {
    public static void main(String[] args) {
        int x = 0, y = 0;

        // 主窗体
        JFrame f = new JFrame("LoL");

        // 主窗体设置大小
        f.setSize(400, 300);

        // 主窗体设置位置
        // 读取location.txt文件，获取坐标信息
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/GUI/NewGUI/windowsLocation.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] coordinates = line.split(",");
                x = Integer.parseInt(coordinates[0]);
                y = Integer.parseInt(coordinates[1]);
                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.setLocation(x,y);

        // 主窗体中的组件设置为绝对定位
        f.setLayout(null);

        // 按钮组件
        JButton b = new JButton("一键秒对方基地挂");

        // 同时设置组件的大小和位置
        b.setBounds(50, 50, 280, 30);

        // 把按钮加入到主窗体中
        f.add(b);

        // 关闭窗体的时候，退出程序
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 让窗体变得可见
        f.setVisible(true);
        new Thread(()->{
            while (true) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/GUI/NewGUI/windowsLocation.txt"))) {
                    System.out.println(f.getX()+","+f.getY());
                    bw.write(f.getX()+","+f.getY());
                    bw.flush();
                    Thread.sleep(100);
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
