//pass by value
package shivaafoundation.javatutorial;
public class Para_Test {
    static int max(int a, int b)
    {
        if(a>b)
            return a;
        else return b;
    }
    public static void main(String args[]){
        int num1=40, num2=50,num3;
        num3=max(num1,num2);
        System.out.println("The maximum number in "+num1+ "and" +num2+"is:"+num3);
    }
}
