import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a fruit: ");
//        String fruit =  input.next();
//        older way of doing it
//        switch (fruit) {
//            case "mango":
//                System.out.println("King of fruits");
//                break;
//
//            case "apple":
//                System.out.println("Sweet red fruit");
//                break;
//
//            case "grapes":
//                System.out.println("Small round Fruit");
//                break;
//
//            case "orange":
//                System.out.println("Round Sour fruit");
//                break;
//
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

//        enhanced version of switch
//        here we do not need break
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("Sweet red fruit");
//            case "grapes" -> System.out.println("Small round Fruit");
//            case "orange" -> System.out.println("Round Sour fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }


//        Example: Weekdays and Weekends

//        System.out.print("Enter a number for any day in a week: ");
//        int day = input.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("enter a valid day.");
//        }
//
//        switch (day){
//            case 1,2,3,4,5 -> System.out.println("Weekday");
//            case 6,7 -> System.out.println("Weekend");
//            default -> System.out.println("enter a valid day.");
//        }

//        Nested switch
        System.out.print("enter your employee id and department: ");
        int empId = input.nextInt();
        String department = input.next();
        switch (empId) {
            case 1 :
                System.out.println("Kunal");
                break;
            case 2 :
                System.out.println("kaushal");
                break;
            case 3 :
                System.out.println("ayush");
                switch (department) {
                    case "it" :
                        System.out.println("IT Department");
                        break;
                    case "network" :
                        System.out.println("Network department");
                        break;
                    default :
                        System.out.println("Enter a valid department");
                }
                break;
            default:
                System.out.println("Enter a valid Employee id");
        }
    }
}
