

public class parseInt {

    public static void main(String[] args) {
        // integer.parseint

    try{
       String str = "24a";

       int value = Integer.parseInt(str);
        System.out.println("this is the value of  converted string: "+value);
    }catch(NumberFormatException e ){
        System.err.println("invalid string!! cannot be converted into integer");
    }

    }
    
}
