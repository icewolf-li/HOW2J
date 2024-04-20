package top.icewolf.medium.ThreadExam;

public class HeroSkill {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            int i = 0;
            while (true) {
                System.out.println("波动拳");
                i++;
                if (i == 3) {
                    try {
                        System.out.println("冷却5秒");
                        Thread.sleep(5000);
                        i = 0;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
    }
}
