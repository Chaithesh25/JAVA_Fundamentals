


public class StringMethods {

    public static void main(String[] args) {
        
        String str = "chaithesh";

        

        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(4,9));

        //Converts the immutable String to a mutable array of characters

        String name = "chaithesh";

        char[] myarray = name.toCharArray();
        System.out.println(myarray[2]);

        //equals


        System.out.println(str.equals(name));

        //split()


        String context = "apple,banana,grape,fruit";
        String[] array = context.split(",") ;
        for(String s: array){
            System.out.println(s);

        }


        //compareto
        String str1 = "hello";
            String str2 = "Hello";
            System.out.println("result");
            System.out.println(str1.compareTo(str2));

    }
    
}
