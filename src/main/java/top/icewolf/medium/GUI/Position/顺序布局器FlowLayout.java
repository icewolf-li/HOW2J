package top.icewolf.medium.GUI.Position;

import javax.swing.*;
import java.awt.*;

public class 顺序布局器FlowLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame("这是顺序布局器");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // 设置布局器为FlowLayerout
        // 容器上的组件水平摆放
        // 更改窗口宽度查看演示
        f.setLayout(new FlowLayout());

        JButton b1 = new JButton("按钮1");
        JButton b2 = new JButton("按钮2");
        JButton b3 = new JButton("按钮3");

        // 加入到容器即可，无需单独指定大小和位置
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
