
package shivaafoundation.javatutorial;


public class NativeDemo {
    int i;
    public static void main (String args[]){
      NativeDemo ob=new  NativeDemo();
      ob.i=10;
      System.out.println("This is ob.i before the native method:"+ob.i);
      ob.test();
      System.out.println("This is ob.i after the native method:"+ob.i);
}
    public native void test();
    static {
            System.loadLibrary("NativeDemo");
  
    }
    
}
//this file contains the c version of the test ()method
/*#include <jni.h>
#include "NativeDemo.h"
#include <studio.h>
JNIEXPORT  void JNICALL Java_NativeDemo_test (JNIENV *env, jobject obj)
{
jclass cls;
jfieldId fid;
jint i;
printf("Starting the native method.\n");
cls= (*env)->GetObjectClass(env.obj);

 fid =(*env)->GetFieldId(env,obj,fid);
if(fid==0){
printf("Could not field id.]n);
return;
}
i= (*env)-> GetIntField(env,obj,fid);
printf(i =%d\n).i);
(*env)->SetIntField(env,obj,fid,2*i;
printf("Ending the native method.\n);
}*/
        
