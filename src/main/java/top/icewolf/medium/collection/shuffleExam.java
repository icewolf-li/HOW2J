package top.icewolf.medium.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffleExam {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        int num = 0;
        // 打乱列表中的元素
        for (int i = 0; i < 1000000; i++){
            Collections.shuffle(numbers);
            if (numbers.get(0) == 3 && numbers.get(1) == 1 && numbers.get(2) == 4){
                num++;
            }
        }
        System.out.println("出现次数：" + num);
    }
}
