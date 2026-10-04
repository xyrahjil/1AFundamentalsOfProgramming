import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class leapYearBufferedReader {

    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Enter year: ");
            String yearInput = input.readLine();
            int year = Integer.parseInt(yearInput);

            if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        }
    }
}