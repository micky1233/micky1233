// SignupFrame.java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupFrame extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;
    UserDAO userDAO = new UserDAO();

    public SignupFrame() {
        setTitle("Signup");
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

        JButton signupBtn = new JButton("Create Account");
        signupBtn.setBounds(130, 150, 150, 30);
        add(signupBtn);

        signupBtn.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            if (userDAO.signup(email, password)) {
                JOptionPane.showMessageDialog(null, "Signup successful! Please login.");
                dispose();  // Close SignupFrame
                new LoginFrame();  // Open LoginFrame (go back to login)
            } else {
                JOptionPane.showMessageDialog(null, "Signup failed.");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
