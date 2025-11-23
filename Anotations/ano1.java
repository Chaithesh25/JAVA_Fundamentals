
class parent{
    @Deprecated 
    public int Calculate(int a,int b){
        return a+b;
    }
    public int Calculatev2(int a,int b){
        return a-b;
    }

}

class Child extends parent{
    
}

class ano1{
    public static void main(String[] args) {
        System.out.println("..");

        Child obj = new Child();
        obj.Calculatev2(5, 3);


    }
}