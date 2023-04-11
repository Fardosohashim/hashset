package hashset;

import java.util.HashSet;

public class hashset {
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

        System.out.println( "before: " + BeautyProduct);

        System.out.println(BeautyProduct.contains("powder"));

        BeautyProduct.remove("lipsticks");

        System.out.println( "After: "+ BeautyProduct);

        System.out.println(BeautyProduct.size());
        //for(int i=0; i<BeautyProduct.size();i++){
            //System.out.println(i);
        //}
for(String i:BeautyProduct){
    System.out.println(i);
}
    }
}
