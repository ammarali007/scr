package org.Gravity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("LogIn");
    JButton resetButton = new JButton("Reset");
    JTextField id = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel idLabel = new JLabel("User ID");
    JLabel passwordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();

    HashMap<String,String > logInInfo;
    LoginPage(HashMap<String,String> logInInfoOriginal){
        logInInfo = logInInfoOriginal;
        setAllComponentsPositions();
        setButtonComponents();
        addComponentsToFrames();
        messageLabel.setFont(new Font(null,Font.ITALIC,25));
        setFrameComponents();
    }

    void setButtonComponents() {
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
    }

    void addComponentsToFrames(){
        frame.add(idLabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(id);
        frame.add(password);
        frame.add(loginButton);
        frame.add(resetButton);

    }

    void setAllComponentsPositions(){
        idLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,35);
        id.setBounds(125,100,200,25);
        password.setBounds(125,150,200,25);
    }

    void setFrameComponents(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton){
            id.setText("");
            password.setText("");
            messageLabel.setText("");
        }

        if(e.getSource() == loginButton){
            String userID = id.getText();
            String userPassword = String.valueOf(password.getPassword());
            if(logInInfo.containsKey(userID)){
                if(logInInfo.get(userID).equals(userPassword)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successfully");
                    frame.dispose();
                    new WelcomePage(userID);
                }
                else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Invalid Password");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Invalid User Id");
            }
        }
    }
}
