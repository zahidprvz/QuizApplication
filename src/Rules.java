import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener {
    String Name;
    JTextArea rulesTextArea;
    JButton btnBack, btnStart;

    Rules(String Name) {
        this.Name = Name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // set location to center of screen
        setVisible(true);

        // To add Label - Welcome
        JLabel welcome = new JLabel(Name + ", Welcome to Zahid Quiz Application");
        welcome.setBounds(150, 50, 700, 30);
        welcome.setFont(new Font("Mongolian Baithi", Font.BOLD, 30));
        welcome.setForeground(Color.BLACK);
        welcome.setHorizontalAlignment(SwingConstants.CENTER);
        welcome.setVerticalAlignment(SwingConstants.CENTER);
        add(welcome);

        // To add Text Area - Rules
        rulesTextArea = new JTextArea();
        rulesTextArea.setBounds(70, 120, 500, 400);
        rulesTextArea.setFont(new Font("Tahoma", Font.BOLD, 14));
        rulesTextArea.setText(
            "1. Do not try to Search for Online Help\n\n" +
            "2. Take your time for every question\n\n" +
            "3. You may have lot of options in life but here all the questions are compulsory\n\n" +
            "4. Crying is allowed but please do so quietly.\n\n" +
            "5. Only a fool asks and a wise answers (Be wise, not otherwise)\n\n" +
            "6. You will be given 15 seconds for each question\n\n" +
            "7. Brace yourself, this paper is not for the faint hearted\n\n" +
            "8. May you know more than what John Snow knows, Good Luck\n\n"
        );
        rulesTextArea.setEditable(false);
        add(rulesTextArea);

        //To add Button for Back
        btnBack = new JButton("Rules");
        btnBack.setBounds(320, 530, 120, 25);
        btnBack.setBackground(Color.green);
        btnBack.addActionListener(this);
        add(btnBack);

        btnStart = new JButton("Start");
        btnStart.setBounds(520, 530, 120, 25);
        btnStart.setBackground(Color.green);
        btnStart.addActionListener(this);
        add(btnStart);
    }

    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == btnStart) {

        } 
        else if(e.getSource() == btnBack) {
            setVisible(false);
            new Login();
        }
    }
}
