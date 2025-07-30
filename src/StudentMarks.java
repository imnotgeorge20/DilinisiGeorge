import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter marks in Science: ");
        int scienceMarks = input.nextInt();

        System.out.print("Enter marks in History: ");
        int historyMarks = input.nextInt();

        System.out.print("Enter marks in Math: ");
        int mathMarks = input.nextInt();

        System.out.print("Enter marks in Soc: ");
        int socMarks = input.nextInt();

        System.out.print("Enter marks in Arts: ");
        int artsMarks = input.nextInt();

        // Calculate total marks and percentage
        int totalMarks = scienceMarks + historyMarks + mathMarks + socMarks + artsMarks;
        double percentage = (double) totalMarks / 500 * 100;

        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage >= 71 && percentage <= 75) {
            remarks = "Poor";
        } else if (percentage >= 76 && percentage <= 80) {
            remarks = "Fair";
        } else if (percentage >= 81 && percentage <= 85) {
            remarks = "Good";
        } else if (percentage >= 86 && percentage <= 90) {
            remarks = "Very Good";
        } else { // percentage >= 91
            remarks = "Excellent";
        }

        System.out.println("\nOutput");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);
        
        if (percentage < 70) {
            System.out.println("Fail and message is not Congrats but use Try Again");
        } else {
            System.out.println("Congrats " + name + " you Passed.");
        }
    }
}
