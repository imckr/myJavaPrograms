import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginComp extends JFrame implements ActionListener {
    JTextField usernameField, passwordField;
    JButton loginButton;
    JLabel messageLabel;

    public LoginComp() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        messageLabel = new JLabel();

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(loginButton);
        add(messageLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginComp();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(((JPasswordField) passwordField).getPassword());

        if (username.equals("admin") && password.equals("password")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }
}
