import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class StudentFileDatabase extends JFrame {
    private static final String FILE_NAME = "students.txt"; // File to store student data
    
    private JTextField idField, nameField;
    private JTextArea outputArea;

    public StudentFileDatabase() {
        setTitle("Student File Database Manager");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Student ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(e -> insertStudent());
        inputPanel.add(addButton);

        JButton deleteButton = new JButton("Delete Student");
        deleteButton.addActionListener(e -> deleteStudent());
        inputPanel.add(deleteButton);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void insertStudent() {
        try {
            int id = Integer.parseInt(idField.getText().trim());
            String name = nameField.getText().trim();

            if (name.isEmpty()) {
                outputArea.append("✗ Name cannot be empty.\n");
                return;
            }

            if (isStudentExists(id)) {
                outputArea.append("✗ Student ID " + id + " already exists.\n");
                return;
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
                writer.write(id + "," + name);
                writer.newLine();
                outputArea.append("✓ Student " + name + " (ID: " + id + ") added successfully\n");
            }
        } catch (NumberFormatException e) {
            outputArea.append("✗ Invalid ID format. Please enter a number.\n");
        } catch (IOException e) {
            outputArea.append("✗ File error: " + e.getMessage() + "\n");
        }
    }

    private void deleteStudent() {
        try {
            int id = Integer.parseInt(idField.getText().trim());
            File inputFile = new File(FILE_NAME);
            File tempFile = new File("temp.txt");

            boolean found = false;

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (Integer.parseInt(parts[0]) == id) {
                        found = true;
                        continue; // Skip this line (delete the student)
                    }
                    writer.write(line);
                    writer.newLine();
                }
            }

            if (!found) {
                outputArea.append("✗ No student found with ID " + id + "\n");
                tempFile.delete();
            } else {
                inputFile.delete();
                tempFile.renameTo(inputFile);
                outputArea.append("✓ Student with ID " + id + " deleted successfully\n");
            }
        } catch (NumberFormatException e) {
            outputArea.append("✗ Invalid ID format. Please enter a number.\n");
        } catch (IOException e) {
            outputArea.append("✗ File error: " + e.getMessage() + "\n");
        }
    }

    private boolean isStudentExists(int id) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentFileDatabase::new);
    }
}
