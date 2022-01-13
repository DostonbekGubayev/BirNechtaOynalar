package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class keyingiOyna extends JFrame implements ActionListener {
    int x = 0;
    int y = 0;
    int xPositsiya = 1;
    int yPositsiya;
    Timer timer;
    ActionListener listener;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        timer = new Timer(1000, this::actionPerformed);
        timer.start();
        boolean white = true;
        for (int y = 0; y < 64; y++) {
            for (int x = 0; x < 64; x++) {
                if (white) {
                    g.setColor(Color.GRAY);
                } else {
                    g.setColor(Color.ORANGE);
                }
                g.fillRect(x * 10, y * 10, 20, 20);
                white = !white;
            }
            white = !white;
        }
        g.setColor(Color.RED);
        g.fill3DRect(x, y, 100, 100, true);
    }

    public keyingiOyna() {
        super("Oyna");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x+=xPositsiya;
        repaint();
    }
}
