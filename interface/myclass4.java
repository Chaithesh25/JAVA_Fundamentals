

interface  X{
    void show();
    void run();
}

interface Y{
    void display();
}

interface N extends Y{

}

class A implements X,N{
     public void show(){
        System.out.println("in A show...");
     }
      public void run(){
        System.out.println("in A run...");

     }

     public void display(){
        System.out.println("in A display");
     }
}

class myclass4{
    public static void main(String[] args) {

        X obj = new A();
        obj.show();
        obj.run();

        Y obj1 = new A();
        obj1.display();
        
        
    }
}