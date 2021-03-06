import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class marche extends JFrame {
    public marche(habitatmap[] habitatsList) {
        habitatmap h0 = habitatsList[0];
        habitatmap h1 = habitatsList[1];
        habitatmap h2 = habitatsList[2];
        habitatmap h3 = habitatsList[3];
        habitatmap h4 = habitatsList[4];
        this.setTitle("World Map");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String picPath = "assets/map.jpg";
        Icon icon = new ImageIcon(getClass().getResource(picPath));
        JLabel lab = new JLabel(icon, JLabel.CENTER);
        this.add(lab);
        Dimension d = new Dimension();
        d.setSize(900, 510);
        this.setSize(d);
        this.setBackground(Color.WHITE);
        Point p = new Point();
        p.setLocation(280, 180);
        this.setLocation(p);
        JButton jb0 = new JButton("sky");
        jb0.setBounds(50, 40, 60, 20);
        lab.add(jb0);
        jb0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h0.setVisible(true);
            }
        });

        JButton jb1 = new JButton("earth");
        jb1.setBounds(630, 270, 120, 20);
        lab.add(jb1);
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h1.setVisible(true);
            }
        });

        JButton jb2 = new JButton("beach");
        jb2.setBounds(300, 90, 80, 20);
        lab.add(jb2);
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h2.setVisible(true);
            }
        });

        JButton jb3 = new JButton("mountain");
        jb3.setBounds(630, 100, 130, 20);
        lab.add(jb3);
        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h3.setVisible(true);
            }
        });

        JButton jb4 = new JButton("sea");
        jb4.setBounds(200, 340, 80, 20);
        lab.add(jb4);
        jb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h4.setVisible(true);
            }
        });

    }

}