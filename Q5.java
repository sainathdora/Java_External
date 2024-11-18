import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Q5 {
    public static void main(String[] args) {
        // Create the JFrame (window)
        JFrame frame = new JFrame("Age Calculator");
        // frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel dobLabel = new JLabel("Enter your Date of Birth (YYYY-MM-DD):");
        JTextField dobField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Age");
        JLabel ageLabel = new JLabel("Your Age: ");

        // Add components to the frame
        frame.add(dobLabel);
        frame.add(dobField);
        frame.add(calculateButton);
        frame.add(ageLabel);

        // Button click event to calculate age
        calculateButton.addActionListener(e -> {
            // Get the date of birth input from the text field
            String dobString = dobField.getText();
        
            try {
                // Parse the date string to LocalDate
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dob = LocalDate.parse(dobString, formatter);
                LocalDate today = LocalDate.now();
        
                // Calculate the age using Period
                Period period = Period.between(dob, today);
                int ageInYears = period.getYears();
        
                // Display the calculated age
                ageLabel.setText("Your Age: " + ageInYears + " years");
            } catch (Exception ex) {
                ageLabel.setText("Invalid Date Format! Use YYYY-MM-DD.");
            }
        });

        // Set the window visible
        frame.setVisible(true);
    }
}
