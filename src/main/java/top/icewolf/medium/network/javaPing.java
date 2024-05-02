package top.icewolf.medium.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * javaPing
 */
public class javaPing {
    public static void main(String[] args) {
        try {
            // 执行命令
            Process p = Runtime.getRuntime().exec("cmd /c ping qq.com");
            // 获取输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));
            String line = null;
            StringBuilder sb = new StringBuilder();
            // 读取输出流
            while ((line = br.readLine()) != null) {
                if (line.length() != 0)
                    sb.append(line + "\r\n");
            }
            // 输出结果
            System.out.println("本次指令返回的消息是：");
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
