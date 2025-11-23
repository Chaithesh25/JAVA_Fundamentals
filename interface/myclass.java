interface   A{

     void start();
     void stop();
}

class B implements A{
   public void start(){
    System.out.println("startingg.....");
   }
   public void stop(){
        System.out.println("stopeddd.....");
   }
}


class myclass{

    public static void main(String[] args) {

        B objB = new B();
        objB.start();
        objB.stop();
        
    }
}