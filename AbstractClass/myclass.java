abstract class mobile{

    abstract public void start();

    public void performanceMode(){
        System.out.println("performance mode turned on....");
    }
}

class samsung extends mobile{

    public void start(){
        System.out.println("Starting device......");
    }
}




class myclass{
      public static void main(String[] args) {

        mobile obj = new samsung();
        obj.start();
        obj.performanceMode();
          
      }  
}