package Decision_Control_Structure_ASSIGNMENT3;

import java.util.Scanner;

public class Assignment3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = sc.nextDouble();
        System.out.print("Enter parent's monthly salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter entrance examination score: ");
        double entrance = sc.nextDouble();
        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Application status: REJECTED");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Application status: ACCEPTED");
        } else {
            System.out.println("Application status: FOR FURTHER STUDY");
        }
        sc.close();
    }
}