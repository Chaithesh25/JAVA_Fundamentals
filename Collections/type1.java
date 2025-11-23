
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class type1 {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(5);
        num.add(6);
        num.add(7);

        for (int n : num) {
            System.out.println(n);
        }
        System.out.println(num.get(3));
    }
}
