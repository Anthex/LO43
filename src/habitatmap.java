import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class habitatmap extends JFrame {
	Habitat ha;
	public habitatmap(int h){
		String picPath = null;
		ha=new Habitat(h);
		switch (h) {
		case 0:
			picPath="src/assets/river.jpg";
			break;
		case 1:
			picPath="src/assets/glassground.jpg";
			break;
		case 2:
			picPath="src/assets/desert.jpg";
			break;
		case 3:
			picPath="src/assets/forest.jpg";
			break;
		case 4:
			picPath="src/assets/beach.jpg";
			break;
		}
    this.setTitle("World");
    
    Icon icon=new ImageIcon(picPath);
    

    JLabel lab=new JLabel(icon,JLabel.CENTER);
	Font font=new Font("����",Font.ITALIC+Font.BOLD,28);
	lab.setForeground(Color.RED);
	lab.setBackground(Color.YELLOW);
	lab.setFont(font);
	this.add(lab);
    Dimension d=new Dimension();
	d.setSize(900,510);
	this.setSize(d);
	this.setBackground(Color.WHITE);
	Point p=new Point();
	p.setLocation(280,180);
	this.setLocation(p);
	JButton jb0 = new JButton("add "+ha.sep(0));
	jb0.setBounds(50,100,100,40);
	lab.add(jb0);

	/* Action listener to add new characters on button click*/
	jb0.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	Character c=new Character(ha.sep(0));
	    	System.out.println("Added a " + ha.sep(0).toString() + " in " + ha.getName());
	    	//ha.addchar(c);
	    }  
	});	
	
	JButton jb1 = new JButton("add "+ha.sep(1)); 
	jb1.setBounds(50,150,100,40);
	lab.add(jb1);
	jb1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	Character c=new Character(ha.sep(1));
			System.out.println("Added a " + ha.sep(1).toString() + " in " + ha.getName());
	    	//ha.addchar(c);
	    }  
	});
	
	JButton jb2 = new JButton("delete "+ha.sep(0));
	jb2.setBounds(50,200,100,40);
	lab.add(jb2);
	jb2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	Character c=new Character(ha.sep(0));
			System.out.println("Removed a " + ha.sep(0).toString() + " in " + ha.getName());
	    	//ha.deletchara(c);
	    }  
	});
	
	JButton jb3 = new JButton("delete "+ha.sep(1));
	jb3.setBounds(50,250,100,40);
	lab.add(jb3);
	jb3.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	Character c=new Character(ha.sep(1));
			System.out.println("Removed a " + ha.sep(1).toString() + " in " + ha.getName());
	    	//ha.deletchara(c);
	    }  
	});
	
	}

}
