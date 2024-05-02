package top.icewolf.medium.GUI.面板;

import javax.swing.*;
import java.awt.*;

public class 练习 {
    public static void main(String[] args) {
        JFrame f = new JFrame("练习");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(3);

        // 创建左侧面板
        JPanel lP = new JPanel();
        lP.setSize(100,300);
        lP.setBackground(Color.RED);
        JButton b1 = new JButton("爬");
        JButton b2 = new JButton("坐");
        JButton b3 = new JButton("躺");

        // 创建右侧面板
        JPanel rP = new JPanel();
        rP.setSize(400,300);
        rP.setBackground(Color.BLUE);

        // 创建标片图片
        JLabel l = new JLabel();
        ImageIcon i1 = new ImageIcon("src/main/resources/GUI/面板/1.png");
        ImageIcon i2 = new ImageIcon("src/main/resources/GUI/面板/2.png");
        ImageIcon i3 = new ImageIcon("src/main/resources/GUI/面板/3.png");
        l.setIcon(i1);
        l.setBounds(0,0, i1.getIconWidth(),i1.getIconHeight());
        rP.add(l);

        b1.addActionListener(e -> {l.setIcon(i1);l.setSize(i1.getIconWidth(),i1.getIconHeight());});
        b2.addActionListener(e -> {l.setIcon(i2);l.setSize(i2.getIconWidth(),i2.getIconHeight());});
        b3.addActionListener(e -> {l.setIcon(i3);l.setSize(i3.getIconWidth(),i3.getIconHeight());});
        lP.add(b1);
        lP.add(b2);
        lP.add(b3);

        f.add(lP);
        f.add(rP);
        f.setVisible(true);
    }
}
