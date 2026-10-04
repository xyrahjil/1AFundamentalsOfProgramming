package Decision_Control_Structure_ASSIGNMENT3;

import javax.swing.JOptionPane;

public class Assignment3JOptionPane {
    public static void main(String[] args) {

        String nsatInput = JOptionPane.showInputDialog("Enter NSAT score:");
        double nsat = Double.parseDouble(nsatInput);
        String salaryInput = JOptionPane.showInputDialog("Enter parent's monthly salary:");
        double salary = Double.parseDouble(salaryInput);
        String entranceInput = JOptionPane.showInputDialog("Enter your entrance examination score:");
        double entrance = Double.parseDouble(entranceInput);
        double average = (nsat + entrance) /2;

        String status;
        if (salary > 10000 || nsat < 90 || entrance < 85) {
            status = "REJECTED";
        } else if (salary <= 3500 && average >= 91) {
            status = "ACCEPTED";
        } else {
            status = "FOR FURTHER STUDY";
        }

        String output = String.format("===== SCHOLARSHIP APPLICATION =====\n" + "NSAT Score: %.2f\n"
                + "Parent's Salary: Php %.2f\n" + "Entrance Exam Score: %.2f\n" + "Average Score: %.2f\n\n" +
                "Application Status: %s", nsat,salary, entrance, average,status);

        JOptionPane.showMessageDialog(null, output);
    }
}