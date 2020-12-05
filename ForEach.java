//Display a for each style for loop
package shivaafoundation.javatutorial;
public class ForEach {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
       //use of for each style to display and sum the values
       for(int x:nums){
        System.out.println("value is" +x);
        sum+=x;
    }
         System.out.println("Summation :" +sum);
    }
    
    
}
