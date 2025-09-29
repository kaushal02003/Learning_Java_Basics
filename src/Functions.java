import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();

        String message = greeting();
        System.out.println(message);

        sum2(120 , 4567);
    }


//    basic function
//    if we don't return anything we use void while declaring function
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+b ;
        System.out.println(c);
    }

//    return type function
    static String greeting() {
        String greet = "Hello guys";
        return greet;
    }


//    function taking input
    static void sum2 (int a , int b) {
        System.out.println(a+b);
    }
}
