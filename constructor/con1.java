
import javax.swing.text.TextAction;


class teams{

    static  String TeamName;
    int Players;
    
   static {
    TeamName = "unkown";
    System.out.println("static block.....");
   }


    public teams(){

        
        Players = 0;
        System.out.println("constructor......");
    }
    

    public void show(){
      System.out.println("team name: "+TeamName+" number of players: "+Players);        
    }
}





class con1{


    public static void main(String[] args) {
        

        // teams obj = new teams();
        // obj.TeamName = "manglore";
        // obj.Players = 12;
        
        // teams obj1 = new teams();

        // obj.show();

       

    }
}