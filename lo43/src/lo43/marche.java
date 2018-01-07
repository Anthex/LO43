package lo43;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class marche extends JFrame {
public marche(){
     JFrame f=new JFrame("magical world");
     String picPath="G:"+File.separator+"1—ßœ∞"+File.separator+"lo43"+File.separator+"lo43"+File.separator+"map.jpg";
     Icon icon=new ImageIcon(picPath);

JLabel lab=new JLabel(icon,JLabel.CENTER);

Font font=new Font("¡• È",Font.ITALIC+Font.BOLD,28);

    lab.setForeground(Color.RED);

    lab.setBackground(Color.YELLOW);

lab.setFont(font);

f.add(lab);
Dimension d=new Dimension();

d.setSize(900,510);

f.setSize(d);

f.setBackground(Color.WHITE);

Point p=new Point();

p.setLocation(280,180);

f.setLocation(p);

f.setVisible(true);
}


public static void main(String args[]){
  marche ma=new marche();
  }
}