
import java.util.HashSet;
import java.util.Set;

class exmple1 {

    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);

        System.out.println("Elemets are :" + nums);
    }
}
