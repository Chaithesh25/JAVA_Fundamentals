class ChaitheshException extends Exception{
     public ChaitheshException(String string){
        super(string);
     }
}
class example1{
    public static void main(String[] args) {
        int i = 26;
        int[] arr = new int[5];
        int J = 0 ;

        try {
             J= 25/i;
             if(J == 0)
              throw  new ChaitheshException("i dont want to print ZZERooo");
            int index = arr[5];
            System.out.println(""+index);


        } catch (ChaitheshException e) {
            J = 25/1;
            System.out.println("cannot divide by zero.."+e);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exceded the limit.."+e);
        }catch(Exception e){
            System.out.println("something went wrong..."+e);
        }

         
        System.out.println(""+J);
         int result2 = 3+5;
         System.out.println("result is :"+result2);

        }
}