
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

class Example1 {

    public static void main(String[] args) {

        int num = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the random number: ");
            int result = Integer.parseInt(br.readLine());
            System.out.println("result "+result);

        } catch (Exception e) {
            System.out.println("Something went wrong..."+e);
        }finally{
            
        }

    }
}
