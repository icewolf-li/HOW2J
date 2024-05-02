package top.icewolf.medium.network.SocketCode.服务端和客户端互聊;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class connect extends Thread {
    Socket socket;
    String name;

    public connect(Socket socket,String name) {
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        // 接受线程
        new Thread(() -> {
            try (DataInputStream dis = new DataInputStream(socket.getInputStream())) {
                while (true) {
                    System.out.println(dis.readUTF());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();

        // 发送线程
        new Thread(()-> {
            try (DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
                while (true) {
                    Scanner sc = new Scanner(System.in);
                    dos.writeUTF("来自"+name+"的信息："+sc.nextLine());
                    dos.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
