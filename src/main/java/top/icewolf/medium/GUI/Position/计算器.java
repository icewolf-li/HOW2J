package top.icewolf.medium.GUI.Position;

import javax.swing.*;
import java.awt.*;

public class 计算器 {
    public static void main(String[] args) {
        // 创建窗体
        JFrame f = new JFrame("计算器");
        // 设置位置和大小
        f.setBounds(50,50,300, 265);
        f.setLayout(new FlowLayout());

        // 创建按钮
        JButton b1 = new JButton("7");
        JButton b2 = new JButton("8");
        JButton b3 = new JButton("9");
        JButton b4 = new JButton("/");
        JButton b5 = new JButton("sq");

        JButton b6 = new JButton("4");
        JButton b7 = new JButton("5");
        JButton b8 = new JButton("6");
        JButton b9 = new JButton("*");
        JButton b10 = new JButton("%");

        JButton b11 = new JButton("1");
        JButton b12 = new JButton("2");
        JButton b13 = new JButton("3");
        JButton b14 = new JButton("-");
        JButton b15 = new JButton("1/x");

        JButton b16 = new JButton("0");
        JButton b17 = new JButton("+/-");
        JButton b18 = new JButton(".");
        JButton b19 = new JButton("+");
        JButton b20 = new JButton("=");

        b1.setPreferredSize(new Dimension(51, 51));b2.setPreferredSize(new Dimension(51, 51));b3.setPreferredSize(new Dimension(51, 51));b4.setPreferredSize(new Dimension(51, 51));b5.setPreferredSize(new Dimension(51, 51));
        b6.setPreferredSize(new Dimension(51, 51));b7.setPreferredSize(new Dimension(51, 51));b8.setPreferredSize(new Dimension(51, 51));b9.setPreferredSize(new Dimension(51, 51));b10.setPreferredSize(new Dimension(51, 51));
        b11.setPreferredSize(new Dimension(51, 51));b12.setPreferredSize(new Dimension(51, 51));b13.setPreferredSize(new Dimension(51, 51));b14.setPreferredSize(new Dimension(51, 51));b15.setPreferredSize(new Dimension(51, 51));
        b16.setPreferredSize(new Dimension(51, 51));b17.setPreferredSize(new Dimension(51, 51));b18.setPreferredSize(new Dimension(51, 51));b19.setPreferredSize(new Dimension(51, 51));b20.setPreferredSize(new Dimension(51, 51));

        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);f.add(b15);f.add(b16);f.add(b17);f.add(b18);f.add(b19);f.add(b20);

        f.setVisible(true);



        // 创建显示文本框
        // 按钮点击方法
        // 计算方法

    }
}
