package top.icewolf.medium.GUI;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUIKeyListener extends Thread {
    public void run() {
        JFrame f = new JFrame("LoL");
        f.setBounds(400,300,580,400);
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon("src/main/resources/GUI/GUIActionListener/avj.jpg");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        // 增加键盘监听
        f.addKeyListener(new KeyListener() {

            // 键被弹起
            public void keyReleased(KeyEvent e) {

                // 39代表按下了 “右键”
                if (e.getKeyCode() == 39) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    l.setLocation(l.getX() + 10, l.getY());
                }
            }

            //键被按下
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    l.setLocation(l.getX() - 10, l.getY());
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    l.setLocation(l.getX() + 10, l.getY());
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    l.setLocation(l.getX(), l.getY() - 10);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    l.setLocation(l.getX(), l.getY() + 10);
                }
            }

            // 一个按下弹起的组合动作
            public void keyTyped(KeyEvent e) {

            }
        });

        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
