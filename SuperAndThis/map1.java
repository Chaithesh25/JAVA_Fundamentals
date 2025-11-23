class A{

    public A(){
        System.out.println("this is A");
    }
    public A(int n){
         System.out.println("this is A int");
    }

}
class B extends  A{
    public B(){
        System.out.println("this is B");
    }
    public B(int n){
        this();
         System.out.println("this is B int");
    }

}






class  map1{

    public static void main(String[] args) {
        B obj =  new B(5);


        
    }
}