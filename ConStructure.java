import java.util.Scanner;

public class ConStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input marks for assignments and CATS
        System.out.print("Enter marks for assignment 1: ");
        double assignment1 = input.nextDouble();
        System.out.print("Enter marks for assignment 2: ");
        double assignment2 = input.nextDouble();
        System.out.print("Enter marks for CAT 1: ");
        double CAT1 = input.nextDouble();
        System.out.print("Enter marks for CAT 2: ");
        double CAT2 = input.nextDouble();

        // calculate the average marks
        double average = (assignment1 + assignment2 + CAT1 + CAT2) / 4;

        // print grade based on average
        if (average >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // print the grades
        if (average >= 80) {
            System.out.println("Grade A");
        } else if (average >= 60 && average < 80) {
            System.out.println("Grade B");
        } else if (average >= 40 && average < 60) {
            System.out.println("Grade C");
        } else if (average >= 20 && average < 40) {
            System.out.println("Grade D");
        } else if (average >= 0 && average < 20) {
            System.out.println("Fail");
        }
    }
}