package top.icewolf.medium.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Random;

public class GUIMouseListener extends Thread{
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolkit.getScreenSize();
    int x = dimension.width;
    int y = dimension.height;
    int w = 500;
    int h = 350;
    @Override
    public void run() {
        final JFrame frame = new JFrame("GUI Mouse Listener");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();
        ImageIcon i = new ImageIcon("src/main/resources/GUI/GUIActionListener/avj.jpg");
        label.setIcon(i);
        label.setBounds(375, 275, i.getIconWidth(), i.getIconHeight());

        frame.add(label);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Random r = new Random();

                int x = r.nextInt(frame.getWidth() - label.getWidth());
                int y = r.nextInt(frame.getWidth() - label.getWidth());

                label.setLocation(x,y);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });

        frame.setVisible(true);
    }
}
