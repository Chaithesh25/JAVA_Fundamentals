
import java.util.function.ObjDoubleConsumer;

class A{

    public void show(){
        System.out.println("in show A");
    }
 
}

class B extends A{
    public void show1(){
        System.out.println("in show B");
    }

}


class typo{

    public static void main(String[] args) {

       A obj  = new B();

       obj.show();

       B obj1 = (B) obj;
       obj1.show1();
       

        // System.out.println("");
    
    }
}