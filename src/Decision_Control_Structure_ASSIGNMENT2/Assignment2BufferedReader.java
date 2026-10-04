package Decision_Control_Structure_ASSIGNMENT2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2BufferedReader {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate:" );
        double rate = Double.parseDouble(br.readLine());
        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(br.readLine());
        double grossPay = hours * rate;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("\n===== EMPLOYEE PAY =====");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
        System.out.printf("Net pay: Php %.2f%n", netPay);
    }
}