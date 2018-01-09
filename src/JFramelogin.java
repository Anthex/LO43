import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JFramelogin extends JFrame {
    private GameManager g;
    private marche ma;
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

    public static void main(String[] args) {
        JFramelogin startWindow = new JFramelogin();
        //while (startWindow.ma.isVisible() == false) ; // wait for the gamemanager to be initialized
        //while (!startWindow.ma.isVisible())
            ; //make sure the component is initialized in order to avoid aborting the program on main loop
        // MAIN LOOP CALL
        while (startWindow.g.getPopulation() > 0 /*&& startWindow.ma.isVisible()*/) {
            startWindow.g.loop();
            startWindow.g.updateAllLocalCharacters();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (startWindow.g.getPopulation() > 0) {
            System.out.println(" -- Programme interrompu par l'utilisateur --");
        } else {
            System.out.println(" -- Tous les personnages sont morts : Fin de la simulation --");
        }
        System.exit(0);
    }
}
