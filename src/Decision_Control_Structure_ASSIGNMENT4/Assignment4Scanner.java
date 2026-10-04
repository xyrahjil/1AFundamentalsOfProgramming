package Decision_Control_Structure_ASSIGNMENT4;

import java.util.Scanner;

public class Assignment4Scanner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = sc.next().toUpperCase().charAt(0);

        if (recommendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("Applicant Status: ACCEPTED");
        } else {
            System.out.println("Applicant Status: REJECTED");
        }
        sc.close();
    }
}