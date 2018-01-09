import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JFramelogin extends JFrame {
    GameManager g;
    marche ma;
    JSpinner spin=null;

    public JFramelogin() {
        this.setTitle("Welcome");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 250, 400, 300);
        JTextField textField1 = new JTextField();
        textField1.setColumns(10);
        textField1.setLocation(120, 95);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(3, 1, 5, 5));
        JPanel pane1 = new JPanel();
        contentPane.add(pane1);
        JLabel label1 = new JLabel("Nom d'utilisateur (optional) :");
        textField1.setText("Joueur 1");
        pane1.add(label1);
        pane1.add(textField1);
        JLabel label2 = new JLabel("Combien d'entitées voulez-vous créer?");
        pane1.add(label2);
        spin = new JSpinner();
        spin.setValue(20);
        pane1.add(spin);
        JButton another = new JButton("Débuter la simulation");
        another.setBounds(120, 85, 100, 50);
        contentPane.add(another);
        String na = textField1.getText();
        g = new GameManager("void"); //create the gamemanager which will generate habitats
        g.createCharacters(((Number)spin.getValue()).intValue());
        dispose();
        ma = new marche(g.getHabitatsMaps()); // create the marche with the habitats' references
        ma.setVisible(true);
        /* //UNUSED
        another.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        */
        //this.setVisible(true);
    }


}
