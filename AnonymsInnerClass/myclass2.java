
abstract class A{

     abstract public void dislpay();
}

class myclass2{
     public static void main(String[] args) {
         A objA = new A(){

          public void dislpay(){
               System.out.println("inside inner class");
          }
         };
         objA.dislpay();
     }
}