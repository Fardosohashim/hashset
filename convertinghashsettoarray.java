package hashset;

import java.util.HashSet;

public class convertinghashsettoarray {
    public static void main(String[] args) {
        HashSet<String>BeautyProduct=new HashSet<>();

        BeautyProduct.add("lipsticks");
        BeautyProduct.add("condition");
        BeautyProduct.add("blender");
        BeautyProduct.add("lashes");
        BeautyProduct.add("foundation");
        BeautyProduct.add("mascara");
        BeautyProduct.add("primer");
        BeautyProduct.add("sponge");
        BeautyProduct.add("Brushes");
        BeautyProduct.add("concealer");
        System.out.println(BeautyProduct);


        String[] array = new String[BeautyProduct.size()];
        BeautyProduct.toArray(array);
        for(String i:BeautyProduct) {
            System.out.println(i);
        }
    }

}
