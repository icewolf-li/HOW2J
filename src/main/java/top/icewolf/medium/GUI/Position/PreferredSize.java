package top.icewolf.medium.GUI.Position;

import javax.swing.*;
import java.awt.*;

public class PreferredSize {
    public static void main(String[] args) {
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new FlowLayout());

        JButton b1 = new JButton("按钮1");
        JButton b2 = new JButton("按钮2");
        JButton b3 = new JButton("按钮3");

        // 即便 使用 布局器 ，也可以 通过setPreferredSize，向布局器建议该组件显示的大小
        b3.setPreferredSize(new Dimension(180, 40));

        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
