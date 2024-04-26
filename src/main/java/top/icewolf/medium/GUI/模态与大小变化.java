package top.icewolf.medium.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class 模态与大小变化 {
    public static void main(String[] args) {
        JFrame f = new JFrame("模态与大小变化");
        f.setSize(400, 300);
        f.setLocation(100, 100);
        f.setLayout(null);

        // 根据外部窗体实例化JDialog
        JDialog d = new JDialog(f);
        // 设置为模态
        d.setModal(true);

        d.setTitle("模态的对话框");
        d.setSize(400, 300);
        d.setLocation(200, 200);
        d.setLayout(null);
        d.setResizable(true);

        JButton b = new JButton("锁定大小");
        b.setBounds(50, 50, 280, 30);
        f.add(b);

        JButton b1 = new JButton("解锁大小");
        b1.setBounds(50, 50, 280, 30);
        d.add(b);

        b.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setResizable(false);
                d.setVisible(true);
            }
        });
        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setResizable(true);
                d.setVisible(false);
            }
        });


        f.setVisible(true);
    }
}
