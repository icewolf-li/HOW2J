package top.icewolf.medium.GUI.面板;

import javax.swing.*;

public class 滚动条面板JScrollPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame("JScrollPanel");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(null);

        // 准备一个文本域，在里面放很多数据
        JTextArea ta = new JTextArea();
        for (int i = 0; i < 1000; i++) {
            ta.append(String.valueOf(i));
        }
        //自动换行
        ta.setLineWrap(true);

        JScrollPane sp = new JScrollPane(ta);
        f.setContentPane(sp);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
