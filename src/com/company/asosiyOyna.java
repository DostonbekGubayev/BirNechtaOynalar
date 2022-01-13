package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class asosiyOyna extends JFrame {
    private JLabel loginLabel;
    private JLabel parolLabel;
    private JTextField login;
    private JPasswordField parol;
    private JButton kirish_tugmasi;

   public asosiyOyna(){
       super("Oyna");
       getContentPane().setLayout(null);
        loginLabel=new JLabel("Login:");
        loginLabel.setBounds(10,10,80,30);
        loginLabel.setFont(new Font("Serif",Font.BOLD,25));
        add(loginLabel);
        parolLabel=new JLabel("Parol:");
        parolLabel.setFont(new Font("Serif",Font.BOLD,25));
        parolLabel.setBounds(11,40,80,30);
        add(parolLabel);
        login=new JTextField();
        login.setBounds(80,20,100,20);
        add(login);
        parol=new JPasswordField();
        parol.setBounds(80,50,100,20);
        add(parol);

        kirish_tugmasi=new JButton("Kirish");
        kirish_tugmasi.setBounds(70,80,80,20);

        kirish_tugmasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent hodisa) {

                    String log,par;
                    log=login.getText();
                    par=parol.getText();
                    if (log.equals("login")&& par.equals("123456")) {
                        new keyingiOyna().setVisible(true);
                        setVisible(false);
                    }else {
                        JOptionPane.showConfirmDialog(null,"Login yoki Parol xato","ERROR",
                                JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                    }

            }
        });
        add(kirish_tugmasi);

        this.setDefaultCloseOperation(3);
        this.setSize(200,200);
       this.setVisible(true);
       this.setLocationRelativeTo(null);
       this.setFocusable(true);
       this.setResizable(false);



   }
}
