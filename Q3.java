import javax.swing.*;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Profile");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Input fields
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        JTextField nameField = new JTextField();
        JTextField rollField = new JTextField();
        JTextField deptField = new JTextField();
        JButton submitButton = new JButton("Submit");
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Roll Number:"));
        panel.add(rollField);
        panel.add(new JLabel("Department:"));
        panel.add(deptField);
        panel.add(submitButton);
        JTextArea displayArea = new JTextArea();
        submitButton.addActionListener(e -> {
            if (!nameField.getText().isEmpty() && !rollField.getText().isEmpty() && !deptField.getText().isEmpty()) {
                displayArea.setText("Student Profile:\nName: " + nameField.getText()
                        + "\nRoll Number: " + rollField.getText()
                        + "\nDepartment: " + deptField.getText());
            } else {
                displayArea.setText("Please Enter Details");
            }
        });
        frame.add(panel, BorderLayout.NORTH);
        frame.add(displayArea, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
