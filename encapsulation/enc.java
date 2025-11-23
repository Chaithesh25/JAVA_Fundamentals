class student{

    private String name;
    private int age;


    public String getName(){

        return  name;
    }

    public void SetName(String n){
        name = n;
    }

     public int getAge(){

        return  age;
    }

    public void setAge(int a){
        age = a;
    }
}



class enc{

    public static void main(String[] args) {
        student obj = new student();

        obj.SetName("chaithesh");
        obj.setAge(25);

        System.out.println("Name: "+obj.getName()+" Age is : "+obj.getAge());
        
    }
}