package top.icewolf.medium.GUI.面板;

import javax.swing.*;
import java.awt.*;

public class 基本面板 {
    /*JPanel即为基本面板
面板和JFrame一样都是容器，不过面板一般用来充当中间容器，把组件放在面板上，然后再把面板放在窗体上。
一旦移动一个面板，其上面的组件，就会全部统一跟着移动，采用这种方式，便于进行整体界面的设计*/
    public static void main(String[] args) {
        JFrame f = new JFrame("基本面板");
        f.setBounds(50,50,600,400);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);

        JButton b1 = new JButton("btn1");
        JButton b2 = new JButton("btn2");
        JButton b3 = new JButton("btn3");
        JPanel jp1 = new JPanel();
        jp1.setBounds(20,50,500,50);
        jp1.setBackground(Color.cyan);
        jp1.add(b1);
        jp1.add(b2);
        jp1.add(b3);

        JButton b4 = new JButton("btn4");
        JButton b5 = new JButton("btn5");
        JButton b6 = new JButton("btn6");
        JPanel jp2 = new JPanel();
        jp2.setBounds(20,250,500,50);
        jp2.setBackground(Color.GREEN);
        jp2.add(b4);
        jp2.add(b5);
        jp2.add(b6);

        f.add(jp1);
        f.add(jp2);
        f.setVisible(true);
    }
}
