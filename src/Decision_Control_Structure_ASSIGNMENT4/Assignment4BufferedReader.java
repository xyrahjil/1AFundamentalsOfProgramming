package Decision_Control_Structure_ASSIGNMENT4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your height in cm: ");
        double height = Double.parseDouble(br.readLine());
        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter citizenship code (C/N):" );
        char citizenship = br.readLine().toUpperCase().charAt(0);
        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = br.readLine().toUpperCase().charAt(0);

        if (recommendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {

            System.out.println("Application Status: ACCEPTED");
        } else {
            System.out.println("Application Status: REJECTED");
        }
    }
}