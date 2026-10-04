package Decision_Control_Structure_ASSIGNMENT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());
        System.out.print("Enter parent's monthly salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.print("Enter entrance examination score: ");
        double entrance = Double.parseDouble(br.readLine());
        double average = (nsat + entrance) /2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Application status: REJECTED");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Application status: ACCEPTED");
        } else {
            System.out.println("Application status: FOR FURTHER STUDY");
        }
    }
}