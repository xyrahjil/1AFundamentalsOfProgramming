package Decision_Control_Structure_ASSIGNMENT4;

import javax.swing.JOptionPane;

public class Assignment4JOptionPane {
    public static void main(String[] args) {

        String heightInput = JOptionPane.showInputDialog("Enter height in cm:");
        double height = Double.parseDouble(heightInput);
        String ageInput = JOptionPane.showInputDialog("Enter age:");
        int age = Integer.parseInt(ageInput);
        String citizenshipInput = JOptionPane.showInputDialog("Enter citizenship code (C/N):");
        char citizenship = citizenshipInput.toUpperCase().charAt(0);
        String recommendeeInput = JOptionPane.showInputDialog("Enter recommendee code (R/N):");
        char recommendee = recommendeeInput.toUpperCase().charAt(0);

        if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            JOptionPane.showMessageDialog(null, "Applicant Status: ACCEPTED");
        } else {
            JOptionPane.showMessageDialog(null, "Applicant Status: REJECTED");
        }
    }
}