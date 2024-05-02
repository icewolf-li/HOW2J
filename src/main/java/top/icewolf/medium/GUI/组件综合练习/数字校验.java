package top.icewolf.medium.GUI.组件综合练习;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

//    在JTextField中输入数据，在旁边加一个按钮JButton,当点击按钮的时候
//    判断JTextFiled中的数据是否是数字，并使用JOptionPane进行提示
public class 数字校验 {
    public static void main(String[] args) {
        JFrame f = new JFrame("数字校验");
        f.setBounds(50,50,400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(3);

        // 创建文本框和按钮
        JTextField tf = new JTextField();
        tf.setBounds(20,20,300,20);
        JButton b = new JButton("验证");
        b.setBounds(320,20,60,20);

        // 按钮监听事件
        // 使用正则表达式regex
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String con = tf.getText();
                System.out.println(con);
                if (Pattern.matches("[0-9]+",con)) {
                    JOptionPane.showMessageDialog(f,"是整数");
                } else {
                    JOptionPane.showMessageDialog(f,"不是整数");
                }
            }
        });

        f.add(tf);
        f.add(b);
        f.setVisible(true);
    }
}
