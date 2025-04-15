// LoginFrame.java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginFrame extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;
    UserDAO userDAO = new UserDAO();

    public LoginFrame() {
        setTitle("Login");
        setSize(400, 300);
        setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 60, 80, 30);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(130, 60, 200, 30);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 80, 30);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 100, 200, 30);
        add(passwordField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(130, 150, 90, 30);
        add(loginBtn);

        JButton signupBtn = new JButton("Signup");
        signupBtn.setBounds(240, 150, 90, 30);
        add(signupBtn);

        loginBtn.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            if (userDAO.login(email, password)) {
                JOptionPane.showMessageDialog(null, "Login successful");
                dispose();  // Close LoginFrame
                new MainFrame();  // Open MainFrame (main app screen)
            } else {
                JOptionPane.showMessageDialog(null, "Invalid credentials");
            }
        });

        signupBtn.addActionListener(e -> {
            dispose();  // Close LoginFrame
            new SignupFrame();  // Open SignupFrame (signup screen)
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame());
    }
}
