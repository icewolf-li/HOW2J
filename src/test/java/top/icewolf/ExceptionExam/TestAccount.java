package top.icewolf.ExceptionExam;

import top.icewolf.medium.ExceptionExam.Account;
import top.icewolf.medium.ExceptionExam.OverdraftException;

public class TestAccount {
    public static void main(String[] args) {

        // 测试你的Account类
        Account account = new Account("123456789", 1000.00);
        System.out.println("账户余额: " + account.getBalance());

        // 测试存款方法
        account.deposit(500.00);
        System.out.println("账户余额在存款后: " + account.getBalance());

        // 测试取款方法
        try {
            account.withdraw(200.00);
            System.out.println("账户余额在取款后: " + account.getBalance());
        } catch (OverdraftException e) {
            System.out.println("取款失败: " + e.getMessage());
        }

        // 测试取款超过余额的方法
        try {
            account.withdraw(2000.00);
            System.out.println("账户余额在取款后: " + account.getBalance());
        } catch (OverdraftException e) {
            System.out.println("取款失败: " + e.getMessage());
        }
    }
}
