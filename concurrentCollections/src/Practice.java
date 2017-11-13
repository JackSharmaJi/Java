import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Practice {
    public static void main(String[] args) {
        CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
        cowal.add("a");
        cowal.add("a");
        cowal.add("a");
        System.out.println(cowal);
        for (Object each  : cowal) {System.out.println("dsf");
            cowal.remove(each);
        }
        System.out.println(cowal);
    }
}
