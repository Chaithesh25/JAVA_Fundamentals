class AClass{

    public int add(int n1,int n2){
        return n1+n2+1;
    }
}

class Bclass extends AClass{

    public int add(int n1,int n2){
        return n1+n2;
    }
}




class method1{

    public static void main(String[] args) {

        Bclass obj = new Bclass();
        int r1 = obj.add(5, 2);
        System.out.println("Result: "+r1);
        
        
    }
}