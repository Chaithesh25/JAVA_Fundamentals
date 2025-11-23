interface   computer {
      
    void display();
}

class Laptop implements computer{

    public void display() {
        System.out.println("Lenovo loq");
    }
}

class desktop implements  computer{

    public void display() {
        System.out.println("DESKTOP");
    }
}

class developer {

    public void developing(computer la1) {
        la1.display();
    }
}

class myclass3 {

    public static void main(String[] args) {

        developer dp = new developer();
        computer dt = new desktop();

        computer la = new Laptop();


        dp.developing(la);

    }
}
