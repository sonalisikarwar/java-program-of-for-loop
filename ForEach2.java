//Display a for each style for loop
package shivaafoundation.javatutorial;
public class ForEach2 {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
       //use of for  to display and sum the values
       for(int x:nums){
        System.out.println("value is" +x);
        sum+=x;
        if(x==5)break; //stop the loop if 5 is obtained
    }
         System.out.println("Summation of first 5 elements :" +sum);
    }
    
    
}
