import java.util.Arrays;

public class MoreAboutFunctions {
    public static void main(String[] args) {


//        int a = 10;
//        int b = 20;
//        swap(a,b);
//        System.out.println(a+" " + b);

//        instead of this we have to pass values directly
        swap(10,20);


        int [] arr = {1,5,346,23};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

//    1.Java uses "pass-by-value" for primitive types (like int).
//    This means the 'swap' function receives COPIES of the values
//    of 'a' (10) and 'b' (20), not the actual variables themselves.
//    2. Inside the 'swap' function, the swap operation successfully
//    changes the values of its LOCAL COPIES of 'a' and 'b'.
//    3. The original variables 'a' and 'b' in the 'main' method remain
//    unaffected because the 'swap' function was working on copies.
    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }

//    1. Java is strictly "pass-by-value." For arrays (which are objects in Java),
//    the value being passed is the REFERENCE (memory address) to the array object.
//    2. When 'changeValue(arr)' is called, the 'num' parameter receives a COPY of the
//    reference/address that points to the SAME array object in memory as 'arr'.
//    3. Inside 'changeValue', using 'num[0] = 99' follows this copied reference
//    back to the ORIGINAL array object in the heap memory and changes the data there.
//    4. The change is permanent and visible back in the calling method ('main').
//    This is how methods can modify the contents of objects passed to them.
//    NOTE: The reference itself (the address) is copied, but the data it points to is shared.

    static void changeValue(int[] num) {
        num[0] = 99;
    }
}
