class student{

    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   //peramirized constructor
   public student(String name,int age){
   
      this.name = name;
      this.age = age;
   }



}


class con2{

    public static void main(String[] args) {
      

      student obj = new student("chaithesh",21);


      System.out.println(obj.getName()+"  :  "+obj.getAge());
    }
}