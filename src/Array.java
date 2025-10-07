import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        syntax
//        datatype[] variable_name = new datatype[size];
        int[] arr = new int[5];
//        or directly
        int [] a = {12,34,56,5,3,234};

        System.out.println(arr[1]);  // this would give 0 since until no values are entered in an

        String [] b = new String[4];
        System.out.println(b[1]);  //this would give null since it is a non primitive datatype
                                   //null is a literal not a datatype it represents absence of value

//        input using loops
        System.out.print("enter numbers for array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

//        printing array using foreach loop
        for(int num: arr) {
            System.out.println(num+" ");
        }

//        easier way of printing array
        //System.out.println(Arrays.toString(arr));
        System.out.print("enter values for array:");
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
//        original array
        System.out.println(Arrays.toString(str));
//        modified array
        str[0] = "kp";
        System.out.println(Arrays.toString(str));

        //multidimensional array
        //syntax:
        //datatype[][] variable_name = new datatype[row size][column size];
        //commonly we only define size of rows since size of column can vary as we see in "d" array
        //each individual array have different number of element
        int [][] c = new int[3][3];

        //syntax2:
        int [][] d = {{1,3},{2,5,6},{1,6,4,6}};

        System.out.println(c.length); // the length of a 2d array is its number of rows

//        to enter values in a 2d array
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[row].length; col++) {
                c[row][col] = in.nextInt();
            }
        }

//        to print all the values of a 2d array
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[row].length; col++) {
                System.out.print(c[row][col]+", ");
            }
            System.out.println();
        }

//        to print values using toString method
        for (int row = 0; row < c.length; row++) {
            System.out.println(Arrays.toString(c[row]));
        }

//        to print values using enhanced for loop
        for (int[] x : c) {
            System.out.println(Arrays.toString(x));
        }




    }
}
