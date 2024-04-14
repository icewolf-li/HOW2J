package top.icewolf.medium.collection;

import java.util.ArrayList;

public class compareName {
    public static void main(String[] args) {
        ArrayList Hero = new ArrayList();
        for (int i = 0;i < 5;i++) {
            Hero.add(new Hero("hero" + i));
        }
        Hero hero2 = new Hero("hero2");

        for (Object hero : Hero) {
            if (hero.equals(hero2)){
                System.out.println("找到相同元素：" + hero.toString());
                System.out.println("下标为:" + Hero.indexOf(hero));
                break;
            }
        }
    }
}

class Hero {
    String name;

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Hero) obj).name);
    }
}
