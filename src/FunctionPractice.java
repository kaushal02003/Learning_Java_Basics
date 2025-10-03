import java.util.Scanner;

public class FunctionPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number to check : ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
        for (int i=100; i<1000; i++ ) {
            if(isArmstrong(i)){
                System.out.print(i+", ");
            }
        }
    }

//    Question 1: Check if the number is a prime number
    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        int c = 2;
        while (c*c<=n) {    // check upto only square root of n to make it optimized
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;     // this if here to check for number 2 and 3 which are already prime
    }

//    Question 2: Check if the number is an Armstrong number
//    Armstrong number are those number whose sum of cube of digits is equal to the number
    static boolean isArmstrong(int n) {
        int original = n;
        int c = 0;
        while (n>0) {
                int b = n % 10;
                c = b * b * b + c;
                n = n / 10;
        }
        return original == c;  // just pass the checking condition it is a boolean function it would
                               // just return true false after checking
    }


}
