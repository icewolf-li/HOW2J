package top.icewolf.medium.network.聊天窗口;

import javax.swing.*;

public class meChat {
    public meChat() {
        JFrame f = new JFrame("meChat");
        f.setDefaultCloseOperation(3);
        f.setBounds(50, 50, 800, 600);
        f.setLayout(null);


        if (LoginPanel.token != 1) {
            // 登陆页面
            JPanel plogin = LoginPanel.invoke();
            f.add(plogin);
        }







        f.setVisible(true);
    }

    public static void main(String[] args) {
        new meChat();
    }
}
