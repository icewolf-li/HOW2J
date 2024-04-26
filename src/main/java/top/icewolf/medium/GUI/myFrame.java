package top.icewolf.medium.GUI;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension Screen = kit.getScreenSize();
    int Width = Screen.width;
    int Height = Screen.height;

    public myFrame(){
        final JFrame myframe = new JFrame("学委窗口程序");
        myframe.setBounds(Width/4,Height/4,Width/2,Height/2);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLayout(null);

        JButton btnBlue = new JButton("Blue");
        JButton btnRed = new JButton("Red");
        JButton btnYellow = new JButton("Yellow");

        btnBlue.setBounds(50,50,100,50);
        btnRed.setBounds(250,50,100,50);
        btnYellow.setBounds(450,50,100,50);

        myframe.add(btnBlue);
        myframe.add(btnRed);
        myframe.add(btnYellow);


        myframe.setVisible(true);
    }

    public static void main(String[] args) {
        new myFrame();
    }
}
