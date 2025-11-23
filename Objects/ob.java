package objects;
class calculator{

    public int add(int n1,int n2){

        int result = n1 + n2;
        return result;
    }
    
}




class ob{

    public static void main(String[] args) {

        int num1 = 5;
        int num2 =  4;

        calculator obj = new calculator();

      int value = obj.add(num1,num2);
      System.err.println("sum of two numbers: "+value);

        
    }
}
