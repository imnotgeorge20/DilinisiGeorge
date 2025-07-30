  import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Instance 1
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        if (number1 > 0) {
            System.out.println(number1 + " is a positive number");
        } else if (number1 < 0) {
            System.out.println(number1 + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }

        // Instance 2
        System.out.print("\nEnter a number: ");
        int number2 = input.nextInt();
        if (number2 > 0) {
            System.out.println(number2 + " is a positive number");
        } else if (number2 < 0) {
            System.out.println(number2 + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }

        // Instance 3
        System.out.print("\nEnter a number: ");
        int number3 = input.nextInt();
        if (number3 > 0) {
            System.out.println(number3 + " is a positive number");
        } else if (number3 < 0) {
            System.out.println(number3 + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }
    }
}



