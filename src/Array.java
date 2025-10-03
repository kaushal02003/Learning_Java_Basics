import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        syntax
//        datatype variable_name = new datatype[size];
        int[] arr = new int[5];
//        or directly
        int [] a = {12,34,56,5,3,234};

        System.out.println(arr[1]);  // this would give 0 since until no values are entered in an

        String [] b = new String[4];
        System.out.println(b[1]);  //this would give null since it is a non primitive datatype
                                   //null is a literal not a datatype it represents absence of value

//        input using loops
        System.out.println("enter numbers for array");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

//        printing array using foreach loop
        for(int num: arr) {
            System.out.print(num+" ");
        }

//        easier way of printing array
        //System.out.println(Arrays.toString(arr));

    }
}
