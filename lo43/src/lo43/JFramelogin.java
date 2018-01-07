package lo43;

import java.awt.GridLayout;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.JTextField;  
import javax.swing.border.EmptyBorder; 
import java.awt.BorderLayout;   
import java.awt.Container;   
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;   
import java.awt.event.InputEvent;   
import java.awt.event.MouseAdapter;   
import java.awt.event.MouseEvent;   
import java.awt.event.MouseListener;   
import javax.swing.JButton;     
import javax.swing.SwingUtilities;

public class JFramelogin extends JFrame{
	  String na;
	 public JFramelogin() {
		   
		   this.setTitle("log in");
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	       this.setBounds(300, 250, 400, 400);   
	       JTextField  textField1=new JTextField();  
	         textField1.setColumns(10); 
	        JPanel contentPane=new JPanel();  
	        contentPane.setBorder(new EmptyBorder(5,5,5,5));  
	        this.setContentPane(contentPane);  
	        contentPane.setLayout(new GridLayout(3,1,5,5));  
	        JPanel pane1=new JPanel();  
	        contentPane.add(pane1);  
	        JLabel label1=new JLabel("username£º");  
	        pane1.add(label1);  
	        pane1.add(textField1); 
			 ActionListener actionListener = new ActionListener() {   
			        public void actionPerformed(ActionEvent actionEvent) {   
			          na=textField1.getText();
			          this.
			        }   
			 };
	        this.setVisible(true); 
	 }
	 public String name() {return na;}
	 public static void main(String[] args) {
		 JFramelogin jfb=new JFramelogin();
		 ActionListener actionListener = new ActionListener() {   
		        public void actionPerformed(ActionEvent actionEvent) {   
		          System.out.println("I was selected.");   
		        }   
		 }
		 }

}
