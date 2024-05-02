package top.icewolf.medium.GUI.组件综合练习;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 为空判断 {
    public static void main(String[] args) {
//        在JTextField中输入数据，在旁边加一个按钮JButton,当点击按钮的时候
//        判断JTextFiled中有没有数据，并使用JOptionPane进行提示
        JFrame f = new JFrame("为空判断");
        f.setBounds(50,50,400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(3);

        // 创建文本框和按钮
        JTextField tf = new JTextField();
        tf.setBounds(20,20,300,20);
        JButton b = new JButton("验证");
        b.setBounds(320,20,60,20);

        // 按钮监听事件
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tf.getText());
                if (tf.getText().equals("")){
                    JOptionPane.showMessageDialog(f,"文本框没有内容");
                }
            }
        });

        f.add(tf);
        f.add(b);
        f.setVisible(true);
    }
}
