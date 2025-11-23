class myclass{

    public static void main(String[] args) {
        
        //autoboxing - when we store primitive type in object directly
        int num = 10;
        Integer num2 = num;

        System.out.println(""+num2);


        //auto-unbxing - when we take out primitive type from object directly
        int num3 = num2;
        System.out.println(""+num3);


        String str = "240";
        int num4 = Integer.parseInt(str);

        System.out.println(""+num4*2);
    }
}