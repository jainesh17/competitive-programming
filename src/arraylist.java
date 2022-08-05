import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         list.add(5);
         list.add(1);
         list.add(4);
         list.add(3);
         list.add(8);
         list.add(6);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.get(4));
    }
}
