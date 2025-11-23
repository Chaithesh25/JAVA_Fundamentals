class cars{
    
    static String type;
    String name ;
    int price;


    public void Details(String n , int p){
        name = n;
        price = p;
    }

    public void show(){

        System.err.println("name: "+name+" price: "+price);
    }

    public static void Show1(cars obj){
        System.err.println("name: "+obj.name+" price: "+obj.price);

    }
}




class static1{

    public static void main(String[] args) {
        

        cars obj1 = new cars();
        obj1.Details("BMW",800000);
        

        cars obj2 = new cars();
        obj2.Details("Audi", 900000);
        
        cars.type = "cars";
        obj1.show();
        obj2.show();

        cars.Show1(obj1);
    }
}