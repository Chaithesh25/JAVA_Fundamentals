class str2 {


    public static String greeting(){

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("Good Evening");

      return  sb.toString();
    }
     public static void main(String[] args) {

         int a = 10 ;
         int b = 20;
        String data = greeting();
        System.err.println(" "+data);

        int maxvalue = Math.max(a,b);
        System.err.println("maxvalue: "+maxvalue);

     }
}