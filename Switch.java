//An improved version of the season program
package shivaafoundation.javatutorial;
public class Switch {
    public static void main(String args[]){
        int month=4;
        String season;
       switch (month){
           case 1:
           case2:
           season="Winter";
           break;
           case 3:
           case 4:
           case 5:
               season ="spring";
               break;
           case 6:
           case 7:
           case 8:
               season="Summer";
               break;
           case 9:
           case 10:
           case 11:
               season="Autumn";
               break;
           default:
               season="Bogus month";
               
           
               
       }
       System.out.println("April is in the" +  season + " . "); 
    }
    
}
