//The target of loop can be empty
package shivaafoundation.javatutorial;

public class NoBody {
    public static void main(String args[]){
        int i,j;
        i=100;
        j=200;
        //find the midpoint between i and j
        while(++i <--j) ;  //no body in this loop
        System.out.println("Midpoint is " + i);
    }
    
}
