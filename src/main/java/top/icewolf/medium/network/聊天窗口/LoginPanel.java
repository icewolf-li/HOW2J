package top.icewolf.medium.network.聊天窗口;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginPanel {
    static int token = 0;
    public static JPanel invoke() {
        // 登录页面
        JPanel plogin = new JPanel();
        plogin.setSize(800, 600);
        plogin.setBackground(Color.PINK);
        plogin.setLayout(null);

        // 登陆提示
        JLabel lTitle = new JLabel("meChat");
        lTitle.setBounds(100, 50, 600, 150);
        lTitle.setFont(new Font("微软雅黑", Font.BOLD, 150));
        plogin.add(lTitle);
        // 用户名输入
        JLabel lusername = new JLabel("用户名:");
        lusername.setBounds(80, 250, 50, 30);
        plogin.add(lusername);
        JTextField name = new JTextField();
        name.setBounds(150, 250, 500, 30);
        plogin.add(name);
        // 密码输入
        JLabel lpwd = new JLabel("密码:");
        lpwd.setBounds(80, 300, 50, 30);
        plogin.add(lpwd);
        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(150, 300, 500, 30);
        plogin.add(pwd);
        // 第三批组件
        JPanel lbtn = new JPanel();
        lbtn.setBounds(100, 350, 500, 30);
        lbtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        lbtn.setBackground(Color.PINK);
        // 设置Socket的IP
        JLabel lip = new JLabel("主机IP：");
        JTextField ip = new JTextField();
        // 由于是FlowLayout布局，要用单独首选大小设置
        ip.setPreferredSize(new Dimension(150, 30));
        // 添加按钮
        JButton host = new JButton("主机");
        JButton into = new JButton("加入");
        JButton regedit = new JButton("注册");
        lbtn.add(lip);
        lbtn.add(ip);
        lbtn.add(host);
        lbtn.add(into);
        lbtn.add(regedit);
        plogin.add(lbtn);

        // 监听事件
        // 主机登录
        host.addActionListener(new loginAction(plogin,"host",name,pwd,ip));


        // 返回面板引用
        return plogin;
    }

    private static class loginAction implements ActionListener {
        JPanel panel;
        String type;
        JTextField name;
        JPasswordField pwd;
        JTextField ip;

        public loginAction(JPanel panel, String type, JTextField name, JPasswordField pwd,JTextField ip) {
            this.panel = panel;
            this.type = type;
            this.name = name;
            this.pwd = pwd;
            this.ip = ip;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // 主机模式
            if (type.equals("host")) {
                // 获取输入框的用户名和密码
                String uname = name.getText();
                char[] passwd = pwd.getPassword();
                String password = new String(passwd);
                String port = ip.getText();
                // 查询语句
                String sql = "select * from mechat.login where username=? and userpassword=?";
                try (Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.16:3306/mechat?characterEncoding=UTF-8",
                        "root", "admin");
                     // 预编译，不会执行，参数都没有
                     PreparedStatement p = c.prepareStatement(sql)){
                    // 设置查询语句参数
                    p.setString(1,uname);
                    p.setString(2,password);
                    // 执行并返回一个ResultSet对象
                    ResultSet rs = p.executeQuery();
                    // 如果数据存在返回true
                    if (rs.next()) {
                        if (port.equals("")) {
                            port = rs.getString(3);
                        }
                        token = 1;
                        JOptionPane.showMessageDialog(panel, "登陆成功");
                        panel.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(panel, "登陆失败");
                    }


                } catch(SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
