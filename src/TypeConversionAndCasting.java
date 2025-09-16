import java.util.Scanner;

public class TypeConversionAndCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Implicit Type casting
//        float num = input.nextFloat();
//        System.out.println(num);

//        Explicit Type Casting
//        int num = (int)(256.78);
//        System.out.println(num); this will print 256 and remove the float values

//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);  // this would print 1 because byte can't store more than 256
//        the value in the output is the remainder of 257 and 256 (256 is the max. byte can store)
//
//        byte a = 10;
//        byte b = 40;
//        byte c = 100;
//        int d = a*b/c; /* here we are performing mathematical operation but a and b are in byte so when we multiply a*b
//        it should also be a byte but when the multiplication hits the output is automatically converted into integer
//        which can then only be stored inside an integer variable.*/
//        System.out.println(d);

//        byte b = 20;
//        b = b*2; //this would give an error because after multiplication byte is converted into integer
//        and cannot be stored inside a byte with type casting
//        System.out.println(b);

//        int a = 'a';
//        System.out.println(a); // this would give 97 because characters are seen as Unicode in java

//        System.out.println("नमस्ते"); /* java is capable to print all major languages since it uses unicode which support
//        millions of different characters unlike ascii which only supports 128 to 256 characters */


    }
}
