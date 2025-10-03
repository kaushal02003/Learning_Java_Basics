import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(60);
        fun("kaushal");
//        Defining multiple methods in the same class with the same name
//        but different parameter lists (number or type of arguments).

//        demo();  the situation here is Ambiguous method call here Java compiler cannot determine which
//        overloaded method to invoke because the arguments passed in the method call match the parameter lists of
//        two or more overloaded methods equally well, or because an automatic type conversion (widening)
//        could lead to multiple valid matches.

    }
    static void fun (int a) {
        System.out.println("you entered : "+a);
    }
    static void fun (String name) {
        System.out.println("you entered : "+name);
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
