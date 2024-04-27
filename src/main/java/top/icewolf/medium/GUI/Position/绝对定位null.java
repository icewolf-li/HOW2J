package top.icewolf.medium.GUI.Position;

import javax.swing.*;

public class 绝对定位null {
    public static void main(String[] args) {

        JFrame f = new JFrame("这是绝对定位窗口");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // 设置布局器为null，即进行绝对定位，容器上的组件都需要指定位置和大小
        f.setLayout(null);
        JButton b1 = new JButton("按钮1");
        // 指定位置和大小
        b1.setBounds(50, 50, 80, 30);
        JButton b2 = new JButton("按钮2");
        b2.setBounds(150, 50, 80, 30);
        JButton b3 = new JButton("按钮3");
        b3.setBounds(250, 50, 80, 30);
        // 没有指定位置和大小，不会出现在容器上
        JButton b4 = new JButton("按钮4");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        // b4没有指定位置和大小，不会出现在容器上
        f.add(b4);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
