
class student{

    String name;
    int age;
    

   public void SetName(String name){

    this.name = name;
   }

   public String GetName(){

      return  name;
   }

}



class th {
    public static void main(String[] args) {
        student obj = new student();

        obj.SetName("chaithesh");
        System.out.println("name: "+obj.GetName());

        
    }
}