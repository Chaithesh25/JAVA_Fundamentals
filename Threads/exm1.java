
class parent extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hiii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class Child extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class exm1 {

    public static void main(String[] args) {
        parent obj1 = new parent();
        Child obj2 = new Child();

        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }
}
