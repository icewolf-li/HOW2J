package top.icewolf.medium.network.SocketCode.服务端和客户端互聊;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(6666)) {
            System.out.println("监听：6666...");
            while (true) {
                Socket s = ss.accept();
                System.out.println("connected from " + s.getRemoteSocketAddress());
                new connect(s,"Server").start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
