import java.util.Scanner;

public class PractiseConditionalsAndLoops {
    public static void main(String[] args) {

//        Q1. find the largest of the 3 numbers

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the 3 numbers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();

//        int max = a;
//        if (b>max){
//            max=b;
//        }
//        else if(c>max) {
//            max=c;
//        }
//        System.out.println(max + " is the largest number.");
//
//        if there is no restriction on libraries we can use Math library
//        int max = Math.max(c,Math.max(a,b));
//        System.out.println("this is the largest number: " +max);

//        Q2. alphabet case check

//        char ch = input.next().trim().charAt(0);
//
//        if(ch>='a' && ch<='z') {
//            System.out.println("this is lowercase");
//        }
//        else {
//            System.out.println("this is uppercase");
//        }

//        Q3. Fibonacci series

//        System.out.print("enter the first 2 number for series: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        for (int i = 1; i <= 10; i++) {

//            int c = b;
//            b=a+b;
//            a=c;
//            System.out.println(b);
//        }

//        Q4. counting occurrences of digits in a number

//        System.out.print("enter the number");
//        int a = input.nextInt();
//        int count = 0;
//        while(a>0){
//            int rem = a%10;
//            if(rem==5) {
//                count++;
//            }
//            a=a/10;//this gives 15/10=1not1.5 so if we would give a>1 it would skip the last iteration of 1/10=0.
//        }
//        System.out.println(count);

//        Q5.Reversing a number

//        System.out.print("enter your number: ");
//        int a = input.nextInt();
//        int ans = 0;
//        while(a>0) {
//            int b = a%10;
//            ans = ans*10 + b;
//            a=a/10;
//        }
//        System.out.println("reversed number : " + ans);

//        Q6. Calculator Program

        while(true) {
            System.out.print("enter the operator: ");
            char op = input.next().trim().charAt(0);
            if( op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("enter 2 numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();
                if( op == '+'){
                    System.out.println(a+b);
                }
                else if ( op == '-') {
                    System.out.println(a-b);
                }
                else if ( op == '*') {
                    System.out.println(a*b);
                }
                else{
                    System.out.println(a/b);
                }
            }
            else {
                System.out.println("enter only the following operator +,-,*,/");
                break;
            }
        }

    }
}
