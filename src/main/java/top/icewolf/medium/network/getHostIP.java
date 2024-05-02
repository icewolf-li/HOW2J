package top.icewolf.medium.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getHostIP {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host);
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
    }
}
