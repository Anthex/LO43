import java.awt.GridLayout;
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.JTextField;  
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;
import javax.swing.JButton;     
 

public class JFramelogin extends JFrame{
	private GameManager g;
	private marche ma;
	 public JFramelogin() {
		   
		   this.setTitle("Welcome");
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	       this.setBounds(300, 250, 400, 300);   
	       JTextField  textField1=new JTextField();  
	         textField1.setColumns(10); 
	         textField1.setLocation(120, 95);
	        JPanel contentPane=new JPanel();  
	        contentPane.setBorder(new EmptyBorder(5,5,5,5));  
	        this.setContentPane(contentPane);  
	        contentPane.setLayout(new GridLayout(3,1,5,5));  
	        JPanel pane1=new JPanel();  
	        contentPane.add(pane1);  
	        JLabel label1=new JLabel("Welcome. Please enter your username:");
	        pane1.add(label1);  
	        pane1.add(textField1);
	        JButton another = new JButton("log in"); 
	        another.setBounds(120,85,100,50);
	        contentPane.add(another);
	        another.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {  
	            	String na=textField1.getText();
	            	g=new GameManager(na); //create the gamemanager which will generate habitats
	            	dispose();
	            	ma = new marche(g.getHabitatsMaps()); // create the marche with the habitats' references
	            	ma.setVisible(true);
	            }  
	        });
	        this.setVisible(true); 
	 }
	 public static void main(String[] args) {
		    JFramelogin ma=new JFramelogin();
		    ma.g.loop();
	 }
}
