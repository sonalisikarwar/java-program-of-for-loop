//The for each loop is essentailly read only
package shivaafoundation.javatutorial;
public class NoChange {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
       
       for(int x:nums){
        System.out.println(x+"");
        x=x*10;                 //no effect on nums  
    }
         System.out.println();
         for(int x:nums)
        System.out.println(x + "");
         
        System.out.println();
    }
    
    
}
