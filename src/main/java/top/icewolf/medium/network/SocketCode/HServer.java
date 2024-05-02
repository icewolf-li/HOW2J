package top.icewolf.medium.network.SocketCode;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            //在5555端口上监听，看是否有连接请求过来
            System.out.println("监听在端口号:5555");
            Socket s = ss.accept();
            System.out.println("有连接过来" + s);

            //打开输入流
            InputStream is = s.getInputStream();

            //读取客户端发送的数据
            int msg = is.read();
            //打印出来
            System.out.println(msg);
            is.close();

            s.close();
            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
