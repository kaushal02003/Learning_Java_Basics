// the name of the public class should be same as the name of the file if not followed it will give error
// the other "main" inside the "Main" class is a reserved keyword for the main function it cannot be changed
// the args inside main is an array that stores any command line argument passed during running of program
// ex. - System.out.println(args[1]); if in terminal we write java Main 30 40 it would print 40
// since the args array would store values written after Main in terminal as an array ,and we are printing the values of array

//to print codes in different line we have println, but to print code in same line we use ju
import java.util.Scanner;

public class Main {
    public static void main(String[]  args) {
        System.out.print("Hello world , ");
        System.out.println(args[0]);

    }
}