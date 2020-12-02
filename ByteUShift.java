// unsigned shifting a byte value
package shivaafoundation.javatutorial;
public class ByteUShift {
    public static void main(String args[]){
        char hex[]={
            '0','1','2','3','4','5','6','7',
            '8','9','a','b','c','d','e','f'
        };
        byte b=(byte) 0xf1;
        byte c=(byte) (b >> 4);
        byte d=(byte) (b >> 4);
        byte e=(byte)((b & 0xff)  >> 4);
        System.out.println("          b= 0x");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
}
