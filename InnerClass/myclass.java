class A{

    int age = 21;


    public void show(){

        System.out.println("inside show method of a");
    }


    class Inner{


        public void playMusic(){

            System.out.println("playing Music.....");
        }
    }
}


class myclass{

    public static void main(String []args){
    
        A obj = new A();
        int agee = obj.age;
        obj.show();

        System.out.println("age ="+agee);

        A.Inner obj2 =  obj.new Inner();
        obj2.playMusic();
    }
}