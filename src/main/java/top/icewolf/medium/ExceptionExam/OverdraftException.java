package top.icewolf.medium.ExceptionExam;

public class OverdraftException extends Exception {
    // 构造函数，接收字符串消息和余额不足额
    public OverdraftException(String message, double deficit) {
        // 调用父类的构造函数，将消息和余额不足额拼接成新的字符串消息
        super(message + deficit);
    }
}
