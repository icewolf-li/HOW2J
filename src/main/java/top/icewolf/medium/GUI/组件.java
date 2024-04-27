package top.icewolf.medium.GUI;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class 组件 {
    public static void main(String[] args) {
//        new 标签();
//        new 图片();
//        new 复选框();
//        new 单选框();
//        new 下拉框();
//        new 对话框();
//        new 文本框();
//        new 密码框();
//        new 文本域();
        new 文件选择器();
    }
}

class 标签{
    public 标签() {
        JFrame f = new JFrame("label");
        f.setSize(200, 100);
        f.setLocation(200, 200);
        f.setLayout(null);

        JLabel l = new JLabel("这是一个标签");
        // 前景色 也就是文字颜色
        l.setForeground(Color.RED);
        l.setBounds(50,10,280,30);

        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

// java GUI 显示图片是通过在label上设置图标实现的
class 图片{
    public 图片() {
        JFrame f = new JFrame("icon");
        f.setSize(200, 220);
        f.setLocation(200, 200);
        f.setLayout(null);

        JLabel l = new JLabel();
        // 设置图片
        ImageIcon img = new ImageIcon("src/main/resources/GUI/组件/avj.jpg");
        //设置ImageIcon
        l.setIcon(img);
        //label的大小设置为ImageIcon,否则显示不完整
        l.setBounds(0,0,img.getIconWidth(),img.getIconHeight());

        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class 复选框{
    public 复选框() {
        JFrame f = new JFrame("复选框");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);

        // 创建复选框
        JCheckBox bCheckBox = new JCheckBox("键盘");
        bCheckBox.setSelected(true);
        bCheckBox.setBounds(50, 50, 130, 30);

        JCheckBox bCheckBox1 = new JCheckBox("鼠标");
        bCheckBox1.setBounds(50, 100, 130, 30);
        // 建立一个线程判断“鼠标”是否被选择
        JLabel l = new JLabel();
        l.setBounds(300,50,150,50);
        l.setForeground(Color.BLUE);
        new Thread(() -> {
            while (true) {
                l.setText(String.valueOf(bCheckBox1.isSelected()));
                        ;
            }
        }).start();

        f.add(bCheckBox);
        f.add(bCheckBox1);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

class 单选框{
    public 单选框() {
        JFrame f = new JFrame("单选框");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);

        // 创建复选框
        JRadioButton b1 = new JRadioButton("有线");
        b1.setSelected(true);
        b1.setBounds(50, 50, 130, 30);

        JRadioButton b2 = new JRadioButton("无线鼠标");
        b2.setBounds(50, 100, 130, 30);

        JRadioButton b3 = new JRadioButton("键盘");
        b3.setBounds(50,150,130,30);

        // 使用ButtonGroup 按钮组把单选按钮合并到一个组
        ButtonGroup bg = new ButtonGroup();
        // 把b1，b2放在 同一个 按钮分组对象里 ，这样同一时间，只有一个 按钮 会被选中
        bg.add(b1);
        bg.add(b2);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

class 下拉框{
//    使用getSelectedItem来获取被选中项
//    使用setSelectedItem() 来指定要选中项

    public 下拉框() {
        JFrame f = new JFrame("涩涩方法");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);

        // 定义下拉框数组
        String[] control = new String[]{"阴纹Slave", "傀儡仆人", "糖果超甜", "Command Card"};
        JComboBox cb = new JComboBox(control);

        cb.setBounds(50,50,160,30);

        f.add(cb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class 对话框{
    /*
    JOptionPane 用于弹出对话框
    JOptionPane.showConfirmDialog(f, "是否 使用外挂 ？");
    表示询问，第一个参数是该对话框以哪个组件对齐
    JOptionPane.showInputDialog(f, "请输入yes，表明使用外挂后果自负");
    接受用户的输入
    JOptionPane.showMessageDialog(f, "你使用外挂被抓住！ 罚拣肥皂3次！");
    显示消息
    */
    public 对话框() {
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

        // 表示询问，第一个参数是该对话框以哪个组件对齐
        int option = JOptionPane.showConfirmDialog(f, "是否对目标使用");
        if (option == JOptionPane.OK_OPTION) {
            // 接受用户的输入,返回String
            String answer = JOptionPane.showInputDialog("请输入 ok");
            if (answer !=null && answer.equals("ok")) {
                // 显示信息
                JOptionPane.showMessageDialog(f,"目标执行成功");
                // 关闭窗口并释放内存
                f.dispose();
            } else {
                JOptionPane.showMessageDialog(f,"目标执行失败");
                f.dispose();
            }
        } else {
            System.exit(0);
        }
    }
}

class 文本框{
    public 文本框() {
        JFrame f = new JFrame("文本框");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel lName = new JLabel("账号：");
        // 输入框
        JTextField tfName = new JTextField("");
        tfName.setText("请输入账号");
        tfName.setPreferredSize(new Dimension(80, 30));

        JLabel lPassword = new JLabel("密码：");
        // 输入框
        JTextField tfPassword = new JTextField("");
        tfPassword.setText("请输入密码");
        tfPassword.setPreferredSize(new Dimension(80, 30));

        f.add(lName);
        f.add(tfName);
        f.add(lPassword);
        f.add(tfPassword);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

        // 表示让密码输入框获取焦点,默认焦点位于密码文本框
        tfPassword.grabFocus();
    }
}

class 密码框{
//    与文本框不同，获取密码框里的内容，推荐使用 getPassword ，该方法会返回一个字符数组，而非字符串
    public 密码框() {
        JFrame f = new JFrame("密码框");
        f.setSize(200, 100);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("密码：");
        // 密码框
        JPasswordField pf = new JPasswordField("");
        pf.setText("&48kdh4@#");
        pf.setPreferredSize(new Dimension(80, 30));

        // 与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
//        String password = pf.getText();
        char[] password = pf.getPassword();
        String p = String.valueOf(password);
        System.out.println(p);

        f.add(l);
        f.add(pf);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

class 文本域{
    /*
    JTextArea：文本域。
    和文本框JTextField不同的是，文本域可以输入多行数据
    如果要给文本域初始文本，通过\n来实现换行效果
    JTextArea通常会用到append来进行数据追加
    如果文本太长，会跑出去，可以通过setLineWrap(true) 来做到自动换行
    */
    public 文本域() {
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("文本域：");

        JTextArea ta = new JTextArea();
        // 手动设置大小
        ta.setPreferredSize(new Dimension(200, 150));
        // \n换行符
        ta.setText("听说你很勇哦\n我超勇的！\n");
        // 追加数据
        ta.append("给我看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看看");
        // 设置自动换行
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

class 进度条{
    public 进度条() {
        JFrame f = new JFrame("进度条");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new FlowLayout());

        // 创建进度条
        JProgressBar pb = new JProgressBar();
        //进度条最大100
        pb.setMaximum(100);
        //当前进度是50
        pb.setValue(50);
        //显示当前进度
        pb.setStringPainted(true);

        f.add(pb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

class 文件选择器{
    public 文件选择器() {
        JFrame f = new JFrame("文件选择器");
        f.setLayout(new FlowLayout());

        // 创建文件选择器对象
        JFileChooser fc = new JFileChooser();
        // 创建一个文件过滤器
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                // 给定的文件是否被这个过滤器接受,如果文件被接受，则为True
                return f.getName().toLowerCase().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                // 该过滤器的描述
                return ".txt";
            }
        });

        // 创建两个按钮
        JButton bOpen = new JButton("打开文件");
        JButton bSave = new JButton("保存文件");
        f.add(bOpen);
        f.add(bSave);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 150);
        f.setLocationRelativeTo(null);

        f.setVisible(true);

        // 按钮监听事件
        bOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int open = fc.showOpenDialog(f);
                File file = fc.getSelectedFile();
                if (open == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f,"准备打开"+file.getAbsolutePath());
                }
            }
        });
        bSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int open = fc.showSaveDialog(f);
                File file = fc.getSelectedFile();
                if (open == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f,"准备保存"+file.getAbsolutePath());
                }
            }
        });
    }
}
