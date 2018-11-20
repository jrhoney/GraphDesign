import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        List<Integer>[] test = new List[3];

        test[0] = new LinkedList<Integer>();
        test[0].add(1);
        test[0].add(2);
        test[0].add(1);
        test[0].add(2);
        test[0].add(3);
        test[0].add(5);

        Iterator it = test[0].iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
