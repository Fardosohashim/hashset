package hashset;

import java.util.HashSet;

public class Append {
    public static void main(String[] args) {
        HashSet<String>tv=new HashSet<>();
        tv.add("TCL tv");
        tv.add("Noble tv");
        tv.add("samsung tv");
        tv.add("logic tv");
        tv.add("horizon tv");
        tv.add("sony tv");
        tv.add("LG tv");
        tv.add("Oscar tv");
        tv.add("SVL tv");
        System.out.println("before Appending:"+tv);
        tv.add("AOC Tv");
        System.out.println("After Appending "+tv);
    }


}
