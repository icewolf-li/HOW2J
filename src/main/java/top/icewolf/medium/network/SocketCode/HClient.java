package top.icewolf.medium.network.SocketCode;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class HClient {
    public static void main(String[] args) {
        try {
            //连接到本机的5555端口
            Socket s = new Socket("127.0.0.1",5555);
            System.out.println(s);

            // 打开输出流
            OutputStream os = s.getOutputStream();

            // 发送数字110到服务端
            os.write(110);
            os.close();

            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
