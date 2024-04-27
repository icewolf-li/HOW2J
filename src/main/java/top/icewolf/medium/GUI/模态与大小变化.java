package top.icewolf.medium.GUI;

import javax.swing.*;

public class 模态与大小变化 {
    public static void main(String[] args) {
        // 创建一个窗口
        JFrame f = new JFrame("模态与大小变化");
        // 设置大小、位置、关闭按钮作用
        f.setSize(400, 300);
        f.setLocation(100, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        // 根据 外部窗体 实例化JDialog并且设置标题
        JDialog d = new JDialog(f,"模态的对话框");
        // 设置为模态
        d.setModal(true);
        // 设置大小和位置
        d.setSize(400, 300);
        d.setLocation(200, 200);
        d.setLayout(null);

        // 创建一个普通窗体的按钮
        JButton b = new JButton("打开一个模态窗口");
        // 设置位置和大小
        b.setBounds(50, 50, 280, 30);
        // 创建按钮监听事件，用于显示模态窗口
        b.addActionListener(e -> {d.setVisible(true);});
        f.add(b);

        // 创建一个模态窗体的按钮
        JButton b1 = new JButton("锁定大小");
        // 设置位置和大小
        b1.setBounds(50,50,280,30);
        // 创建按钮监听事件，用于改变模态窗体的“可变大小”属性
        b1.addActionListener(e -> {if (d.isResizable()) {d.setResizable(false);b1.setText("解锁大小");} else {d.setResizable(true);b1.setText("锁定大小");}});
        d.add(b1);

        f.setVisible(true);
    }
}
