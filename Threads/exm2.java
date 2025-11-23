
class Increment {

    int count;

    public void counterValue() {
        count++;
    }
}

class exm2 {

    public static void main(String[] args) {

        Increment c = new Increment();

        Runnable obj = () -> {
            {

                for (int i = 0; i <= 10000; i++) {

                    c.counterValue();

                }

            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i <= 10000; i++) {
                c.counterValue();

            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        System.out.println(c.count);

    }
}
