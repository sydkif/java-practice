import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Login implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(320, 240);
        frame.setTitle("GUI Login Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(20, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 60, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 60, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(100, 100, 80, 25);
        button.addActionListener(new GUI_Login());
        frame.getRootPane().setDefaultButton(button);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(100, 140, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = readPassword();

        System.out.println(user + ", " + password);

        if (user.equals("admin") && password.equals("1234")) {
            success.setText("Successful Login!");
        } else {
            success.setText("Invalid User/Password!");
        }

    }

    public String readPassword() {
        char getPass[] = passwordText.getPassword();
        return String.valueOf(getPass);

    }
}