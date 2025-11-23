
class parent {

    public void show() throws ClassNotFoundException {
        System.out.println("Parent class...");
        Class.forName("example2");
    }
}

class Child extends parent {

    public int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

class example2 {

    static {
        System.out.println("Class main..");
    }

    public static void main(String[] args) {

        Child obj = new Child();

        try {
            obj.show();
            obj.divide(20, 0);

        } catch (ClassNotFoundException e) {
            System.out.println("not able to find the class");
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero...");
        }

    }
}
