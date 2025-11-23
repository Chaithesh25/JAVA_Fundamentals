class A{

    public void show()
    {
        System.out.println("in A show ");
    }
}


class myclass{
 
    public static void main(String[] args) {
        A obj = new A(){
    public void show()
    {
        System.out.println("innerclass show ");
    }
        };
        obj.show();

    }

}