import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JButton btnRules, btnBack;
    JTextField tfName;

    Login() {

        getContentPane().setBackground(Color.white);
        setLayout(null);

        //To add Image
        ImageIcon il = new ImageIcon(getClass().getClassLoader().getResource("icons/login.jpeg"));
        JLabel image = new JLabel(il);
        image.setBounds(0, 0, 1000, 300);
        add(image);

        //To add Heading Text
        JLabel heading = new JLabel("Zahid Quiz App");
        heading.setBounds(350, 350, 300, 50);
        heading.setFont(new Font("Mongolian Baithi", Font.BOLD, 40));
        heading.setForeground(Color.black);
        add(heading);

        //To add Label - Enter your name
        JLabel name = new JLabel("Enter your name: ");
        name.setBounds(250, 450, 300, 20);
        name.setFont(new Font("Mongolian Baithi", Font.BOLD, 18));
        name.setForeground(Color.BLACK);
        add(name);

        //To add TextBox
        tfName = new JTextField();
        tfName.setBounds(420, 450, 300, 25);
        add(tfName);

        //To add Button for Rules
        btnRules = new JButton("Rules");
        btnRules.setBounds(420, 500, 120, 25);
        btnRules.setBackground(Color.green);
        btnRules.addActionListener(this);
        add(btnRules);

        //To add Button for Back
        btnBack = new JButton("Back");
        btnBack.setBounds(600, 500, 120, 25);
        btnBack.setBackground(Color.red);
        btnBack.addActionListener(this);
        add(btnBack);

        //Like a Boiler Plate code for Frame initialization
        setTitle("Login");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // set location to center of screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == btnRules) {
            String name = tfName.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(e.getSource() == btnBack) {
            setVisible(false);
        }
    }
}
