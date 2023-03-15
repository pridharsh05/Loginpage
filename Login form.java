package loginform;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author RRR
 */
public class Loginform extends JFrame implements ActionListener {
    // declare UI components
    private JLabel lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnCancel;

    public Loginform() {
        // set window properties
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // create UI components
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");
        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(15);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        // add UI components to window
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnCancel);
        add(panel);

        // add action listeners to buttons
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
    }

    // handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            // get username and password from input fields
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            // check if username and password are correct
            if (username.equals("priya") && password.equals("priya19")) {
                // if correct, show a message and open main window
                JOptionPane.showMessageDialog(null, "Login successful.");
                dispose();
               
            } else {
                // if incorrect, show an error message
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
            }
        } else if (e.getSource() == btnCancel) {
            // if cancel button is clicked, exit the application
            dispose();
        }
    }

    public static void main(String[] args) {
        // create and show login window
        Loginform  login = new Loginform();
        login.setVisible(true);
    }
}
 
