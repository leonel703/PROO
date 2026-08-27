import java.util.*;

public class JavaArrayList {
    public static void main (String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(2);
        num.add(3);
        num.add(47);
        num.add(3);
        num.add(128);
        num.add(15);
        num.add(92);
        num.add(1);
        num.add(64);
        num.add(29);
        num.add(200);
        num.add(8);
        num.add(75);
        num.add(2);
        num.add(153);
        num.add(41);
        num.add(19);
        num.add(6);
        num.add(88);
        num.add(33);
        num.add(101);
        num.add(50);

        Collections.sort(num);

        System.out.println (num);
    }
}