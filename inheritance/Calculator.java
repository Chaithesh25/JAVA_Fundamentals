class Calculator{

    public static void main(String[] args) {
        
        cal1 obj = new cal1();

        int r1 = obj.add(5, 2);
        int r2 = obj.sub(10, 4);
        int r3 = obj.mul(5,5);
        int r4 = obj.div(10,2);
        double r5 = obj.power(4,2);
        

        System.out.println("addition: "+r1);
        System.out.println("diffrence: "+r2);
        System.out.println("multiplication: "+r3);
        System.out.println("division: "+r4);
        System.out.println("power: "+r5);
    
    }
}