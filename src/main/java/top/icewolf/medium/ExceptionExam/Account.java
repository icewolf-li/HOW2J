package top.icewolf.medium.ExceptionExam;

public class Account {
    // 定义名称
    private String name;
    // 定义余额
    private double balance;

    // 构造函数
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // 获取余额
    public double getBalance() {
        return balance;
    }

    // 存款
    public double deposit(double money) {
        balance += money;
        return money;
    }

    // 取款
    public double withdraw(double money) throws OverdraftException {
        double remoney = 0;
        // 判断余额是否足够
        if (balance <= money) {
            // 不足时抛出异常
            throw new OverdraftException("余额不足，已透支", money - balance);
        } else {
            // 余额足够时，计算剩余金额
            remoney = balance -= money;
        }
        // 返回剩余金额
        return remoney;
    }
}
