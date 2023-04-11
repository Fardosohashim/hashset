package hashset;

import java.util.HashSet;

public class iterate {
    public static void main(String[] args) {
        HashSet<Integer>num=new HashSet<>();
        num.add(20);
        num.add(80);
        num.add(70);
        num.add(10);
        num.add(40);
        num.add(100);
        num.add(30);
        num.add(110);
        num.add(90);
        System.out.println(num);

        for (Integer i:num) {
            System.out.println(i);

        }
    }
}
