@FunctionalInterface
interface Parent{
    int showMessege(int a,int b);
}


class ano2{

    public static void main(String[] args) {

        //lamda expression
        Parent obj = (int a,int b) -> a + b;
            
        

        int result = obj.showMessege(5, 5);
        System.out.println("RESULT>>"+result);
        

    }
}