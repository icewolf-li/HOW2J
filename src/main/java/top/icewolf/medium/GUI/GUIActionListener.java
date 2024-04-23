package top.icewolf.medium.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUIActionListener extends Thread {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolkit.getScreenSize();
    int x = dimension.width;
    int y = dimension.height;
    int w = 500;
    int h = 350;

    public void run() {
        JFrame frame = new JFrame("GUI Action Listener");
        frame.setBounds(x/2-w/2,y/2-h/2, w, h);
        frame.setBackground(new Color(68, 176, 159));
        frame.setResizable(true);
//        frame.setExtendedState(Frame.MAXIMIZED_BOTH);设置默认窗口为全屏
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个标签放置图片
        JLabel label = new JLabel();
        ImageIcon imageIcon = new ImageIcon("src/main/resources/GUI/GUIActionListener/avj.jpg");
        label.setIcon(imageIcon);
        label.setBounds(50, 50, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        // 按钮对象
        JButton button = new JButton("图片");
        button.setBounds(350, 200, 100, 30);

        // 设置按钮监听事件
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (label.isVisible()) {
                    label.setVisible(false);
                } else {
                    label.setVisible(true);
                }
            }
        });

        // 键盘监听事件
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 49) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    label.setLocation(label.getX() + 10, label.getY());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.isActionKey()) {
                    if (e.getKeyCode() == 122) {
                        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                    }
                }
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
