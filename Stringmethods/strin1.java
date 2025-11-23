



public class strin1 {
    public static void main(String[] args) {
       String str = "mite";
       StringBuilder sb = new StringBuilder(str);

    //    for(int i = 0;i <= sb.length()-1;i++){
    //      System.err.println("position of the character: "+sb.charAt(i)+" position:"+i);
    //    }

    //    System.out.println(sb.charAt(2));
    //    System.out.println(sb);

    //  sb.setCharAt(0, 'M');
    //  System.out.println(sb);
     sb.deleteCharAt(0);
     System.out.println(sb);
     sb.insert(0, 'W');
     System.out.println(""+sb);

    }

}
