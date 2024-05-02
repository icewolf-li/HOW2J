package top.icewolf.medium.network.SocketCode.服务端和客户端互聊;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s =new Socket("localhost",6666);
            System.out.println("连接成功");
            new connect(s,"Client").start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
