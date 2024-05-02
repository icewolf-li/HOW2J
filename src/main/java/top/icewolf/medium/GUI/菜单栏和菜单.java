package top.icewolf.medium.GUI;

import javax.swing.*;

public class 菜单栏和菜单 {
    public static void main(String[] args) {
        JFrame f = new JFrame("菜单栏和菜单");
        f.setBounds(50,50,400,300);
        f.setLayout(null);

        // 创建菜单栏
        JMenuBar mb = new JMenuBar();

        // 创建菜单
        JMenu m1 = new JMenu("主页");
        JMenu m2 = new JMenu("人物");
        JMenu m3 = new JMenu("方法");
        JMenu m4 = new JMenu("背包");
        JMenu m5 = new JMenu("设置");

        // 把菜单加入到菜单栏
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);

        // 创建菜单项
        m2.add(new JMenuItem("近战-Warriar"));
        m2.add(new JMenuItem("远程-Range"));
        m2.add(new JMenuItem("物理-physical"));
        m2.add(new JMenuItem("坦克-Tank"));
        m2.add(new JMenuItem("法系-Mage"));
        m2.add(new JMenuItem("辅助-Support"));
        m2.add(new JMenuItem("打野-Jungle"));
        m2.add(new JMenuItem("突进-Charge"));
        m2.add(new JMenuItem("男性-Boy"));
        m2.add(new JMenuItem("女性-Girl"));
        // 分隔符
        m2.addSeparator();
        m2.add(new JMenuItem("所有-All"));

        // 把菜单栏加入到frame，这里用的是set而非add
        f.setJMenuBar(mb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
