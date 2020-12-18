
/*package shivaafoundation.javatutorial;

class A {
    int i,j;
    void showij(){
        System.out.println(" i and j : " +i+ " " +j);
    
}
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k:" + k);
    }
    void sum(){
        System.out.println("i+j+k: " +(i+j+k));
    }
}
class SimpleInheritance{
    public static void main(String args[]){
        A superbOb = new A();
        B superOb = new B();
        
        superOb.i =10;
        superOb.j =20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();
         
        
        superOb.i =7;
        superOb.j =8;
        superOb.i =9;
        
        System.out.println("Contents of superOb: ");
        superOb.showij();
        superOb.showk();
        
        System.out.println("Sum of i,j and k in subOb: ");
        superOb.sum();
    }
}*/
package shivaafoundation.javatutorial;

    class A {
        void callme(){
            System.out.println("Inside A's callme method");
        }
    }
    class B extends A {
        void callme(){
            System.out.println("Inside B's callme method");
    }
}
class C extends A {
        void callme(){
            System.out.println("Inside C's callme method");
    }
}
    class Dispatch {
        public static void main(String args[]){
            A a = new A();
            B b = new B();
            C c = new C();
            
            A r;
            r = a;
            r.callme();
            r=b;
            r.callme();
             
            r=c;
            r.callme();
            
        }
    }

        
    


