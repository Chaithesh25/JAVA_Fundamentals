
class Laptop {

    public void Start() {
        System.out.println("Lenovo loq");
    }
}

class developer {

    public void developing(Laptop la1) {
        la1.Start();
    }
}

class myclass3 {

    public static void main(String[] args) {

        developer dp = new developer();

        Laptop la = new Laptop();


        dp.developing(la);

    }
}
