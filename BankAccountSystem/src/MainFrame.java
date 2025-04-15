import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    JTextField nameField, balanceField, emailField, accountNumberField, amountField;
    JButton createBtn, actionBtn;
    JComboBox<String> actionBox;
    JCheckBox overdraftCheckBox, monthlyFeeCheckBox;
    UserDAO dao = new UserDAO(); // Make sure you have a working UserDAO class

    public MainFrame() {
        setTitle("Bank Account System");
        setSize(600, 500);
        setLayout(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 600, 500);
        mainPanel.setBackground(new Color(144, 238, 144)); // Light green
        add(mainPanel);

        JLabel headerLabel = new JLabel("Bank Account System", SwingConstants.CENTER);
        headerLabel.setBounds(0, 10, 600, 30);
        headerLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
        headerLabel.setForeground(new Color(0, 128, 0)); // Dark green
        mainPanel.add(headerLabel);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 60, 100, 25);
        mainPanel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 60, 200, 25);
        mainPanel.add(nameField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 25);
        mainPanel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 25);
        mainPanel.add(emailField);

        // Account Number
        JLabel accountLabel = new JLabel("Account No:");
        accountLabel.setBounds(50, 140, 100, 25);
        mainPanel.add(accountLabel);

        accountNumberField = new JTextField();
        accountNumberField.setBounds(150, 140, 200, 25);
        mainPanel.add(accountNumberField);

        // Balance
        JLabel balanceLabel = new JLabel("Initial Balance:");
        balanceLabel.setBounds(50, 180, 100, 25);
        mainPanel.add(balanceLabel);

        balanceField = new JTextField();
        balanceField.setBounds(150, 180, 200, 25);
        mainPanel.add(balanceField);

        // Create Button
        createBtn = new JButton("Create Account");
        createBtn.setBounds(150, 220, 200, 30);
        mainPanel.add(createBtn);

        // Action Selection
        JLabel actionLabel = new JLabel("Action:");
        actionLabel.setBounds(50, 270, 100, 25);
        mainPanel.add(actionLabel);

        actionBox = new JComboBox<>(new String[]{"Deposit", "Withdraw"});
        actionBox.setBounds(150, 270, 200, 25);
        mainPanel.add(actionBox);

        // Amount
        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(50, 310, 100, 25);
        mainPanel.add(amountLabel);

        amountField = new JTextField();
        amountField.setBounds(150, 310, 200, 25);
        mainPanel.add(amountField);

        // Action Button
        actionBtn = new JButton("Perform Action");
        actionBtn.setBounds(150, 350, 200, 30);
        mainPanel.add(actionBtn);

        // Checkboxes
        overdraftCheckBox = new JCheckBox("Allow Overdraft");
        overdraftCheckBox.setBounds(150, 390, 150, 25);
        overdraftCheckBox.setBackground(new Color(144, 238, 144));
        mainPanel.add(overdraftCheckBox);

        monthlyFeeCheckBox = new JCheckBox("Apply Monthly Fee");
        monthlyFeeCheckBox.setBounds(310, 390, 150, 25);
        monthlyFeeCheckBox.setBackground(new Color(144, 238, 144));
        mainPanel.add(monthlyFeeCheckBox);

        // Add dummy action for now (to be replaced with real logic)
        createBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Create Account logic here");
            }
        });

        actionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String action = (String) actionBox.getSelectedItem();
                JOptionPane.showMessageDialog(null, action + " logic here");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
 