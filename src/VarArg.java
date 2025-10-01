import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(1,3,4,6,78,98);
    }
//    variable length argument
//    Purpose: Allows a method to accept zero or more arguments of a specific type.
//    Treatment: Inside the method, the varargs parameter is treated as an **array**.
//    Rule: Must be the **last parameter** in the method signature like
//    public void log(String message, int a , int b ,int... codes)
    static void fun (int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
