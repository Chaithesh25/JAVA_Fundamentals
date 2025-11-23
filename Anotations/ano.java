class Parent{
    public void ShowMessege(){
        System.out.println("this is parent class");
    }

}
class Child extends Parent{
    @Override
    public void ShowMessege(){
        System.out.println("this is Child class");
    }

}
class GrandChild extends Child{

    public void ShowMessege(){
        System.out.println("this is GrandChild class");
    }
}



class ano {


    public static void main(String[] args) {
        GrandChild object = new GrandChild();
        object.ShowMessege();
        
    }
}