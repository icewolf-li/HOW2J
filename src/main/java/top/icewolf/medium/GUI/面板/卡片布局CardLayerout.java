package top.icewolf.medium.GUI.面板;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class 卡片布局CardLayerout {
    public static void main(String[] args) {
        JFrame f = new JFrame("卡片布局CardLayerout");

        // 基本面板comboBoxPane
        JPanel comboBoxPane = new JPanel();
        // 基本面板两个面板名称的数组，定义下拉框数组
        String buttonPanel = "按钮面板";
        String inputPanel = "输入框面板";
        String comboBoxItems[] = { buttonPanel, inputPanel };
        // 创建一个下拉框
        JComboBox<String> cb = new JComboBox<>(comboBoxItems);
        comboBoxPane.add(cb);

        // 两个Panel充当卡片
        JPanel card1 = new JPanel();
        card1.add(new JButton("按钮 1"));
        card1.add(new JButton("按钮 2"));
        card1.add(new JButton("按钮 3"));

        JPanel card2 = new JPanel();
        card2.add(new JTextField("输入框", 20));

        JPanel cards; // a panel that uses CardLayout
        cards = new JPanel(new CardLayout());
        cards.add(card1, buttonPanel);
        cards.add(card2, inputPanel);

        // 后面添加的布局是边界布局的常量
        f.add(comboBoxPane, BorderLayout.NORTH);
        f.add(cards, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 150);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        cb.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent evt) {
                CardLayout cl = (CardLayout) (cards.getLayout());
                cl.show(cards, (String) evt.getItem());
            }
        });
    }
}
