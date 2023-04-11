package hashset;

import java.util.HashSet;

public class emptyornot {
    public static void main(String[] args) {
        HashSet<String> BeautyProduct=new HashSet<>();
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
        System.out.println("Before removing:"+BeautyProduct);
        BeautyProduct.removeAll(BeautyProduct);
        System.out.println("After removing:"+BeautyProduct);

    }




}
