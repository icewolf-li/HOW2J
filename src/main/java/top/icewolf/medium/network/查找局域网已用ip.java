package top.icewolf.medium.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class 查找局域网已用ip {
    public static void main(String[] args) {
        try {
            InetAddress host = InetAddress.getLocalHost();
            String ip =host.getHostAddress();
            System.out.println("本机ip地址：" + ip);
            String[] localhost = ip.split("\\.");
            for (int i = 0; i < 256; i++) {
                try {
                    String tip;
                    tip = String.format("%s.%s.%s.%s",localhost[1],localhost[2],localhost[3],i );
                    Process p = Runtime.getRuntime().exec("cmd /c ping "+tip);
                    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.contains("时间")) {
                            System.out.println("可连接"+tip);
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
