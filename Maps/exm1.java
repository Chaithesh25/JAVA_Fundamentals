
import java.util.HashMap;
import java.util.Map;

class exm1 {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("chaithesh", 80);
        students.put("astern", 70);
        students.put("manoj", 90);
        // for (String youths : students) {
        // }
        // System.out.println("students are: " + students.keySet())
        ;

        for (String items : students.keySet()) {
            System.out.println(items + ":" + students.get(items));
        }
    }
}
