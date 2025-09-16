import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // this is done to set up input in java
        Scanner input = new Scanner(System.in);

        // how to set an integer input
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("entered number is " + num);
        input.nextLine(); /* we have to use this here because nextLine below was reading an empty string
        because as soon as we click enter the nextInt grabs the numerical input entered leaving empty space
        which nextLine reads immediately skipping its own input */

        // how to set a string input
        System.out.print("enter your description : ");
        String desc = input.nextLine();
        System.out.println("You entered: " + desc);

        // how to set a boolean input
        System.out.print("enter true/false :");
        boolean choice = input.nextBoolean();
        System.out.println("Choice: " + choice);

        //how to set a float input
        System.out.print("Enter a decimal: ");
        float decimal = input.nextFloat();
        System.out.println("entered Value: " + decimal);

    }
}
