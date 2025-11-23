
import java.util.Scanner;

class Addition {

    public int add(int a, int b) {
        return a + b;
    }
}

class Exmple2 {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the second Number: ");
        num2 = sc.nextInt();

        Addition obj = new Addition();
        int result = obj.add(num1, num2);

        System.out.println("Sum of two number is : " + result);

        sc.close();

    }
}
