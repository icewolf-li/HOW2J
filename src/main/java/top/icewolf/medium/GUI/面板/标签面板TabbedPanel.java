package top.icewolf.medium.GUI.面板;

import javax.swing.*;
import java.awt.*;

public class 标签面板TabbedPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame("标签面板");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(null);

        // 创建基本面板p1
        JPanel p1 = new JPanel();
        p1.setBounds(50, 50, 300, 60);
        p1.setBackground(Color.RED);
        p1.setLayout(new FlowLayout());

        JButton b1 = new JButton("github");
        JButton b2 = new JButton("how2j");
        JButton b3 = new JButton("pornhub");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        // 创建基本面板p2
        JPanel p2 = new JPanel();
        p2.setBounds(50, 50, 300, 60);
        p2.setBackground(Color.BLUE);
        p2.setLayout(new FlowLayout());

        JButton b4 = new JButton("永劫无间");
        JButton b5 = new JButton("使命召唤");
        JButton b6 = new JButton("幻兽帕鲁");

        p2.add(b4);
        p2.add(b5);
        p2.add(b6);

        // 创建分栏面板
        JTabbedPane tp = new JTabbedPane();
        tp.add(p1);
        tp.add(p2);

        // 设置tab的标题
        tp.setTitleAt(0, "快捷网站");
        tp.setTitleAt(1, "我的游戏");

//        设置分页的图标
//        ImageIcon i = new ImageIcon("e:/project/j2se/j.png");
//        tp.setIconAt(0,i );
//        tp.setIconAt(1,i );

        f.setContentPane(tp);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
