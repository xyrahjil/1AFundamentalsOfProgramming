import javax.swing.JOptionPane;

public class labQuiz3 {

    public static void main (String[] args){

        double serviceCharge = 0.12;
        double salesTax = 0.07;

            JOptionPane.showMessageDialog(null, "Welcome to XYZ Pizza Parlor!");

            String grossbill = JOptionPane.showInputDialog(null, "Here's your gross bill, dear customer.");

            double bill = Double.parseDouble(grossbill);

            double gbill = bill * serviceCharge * salesTax; //For the net bill computation

            double nbill = gbill * serviceCharge * salesTax;

            JOptionPane.showMessageDialog(null, "Here's your net bill, dear customer " + nbill);

            String amount = JOptionPane.showInputDialog(null, "Amount of money given.");

            double money = Double.parseDouble(amount);

            double change = money - gbill; //This is the computation for the change

            JOptionPane.showMessageDialog(null, "Your change, dear customer is " + change);

    }
}
