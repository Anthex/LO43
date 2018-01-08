import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class JFramelogin extends JFrame {
    private GameManager g;
    private marche ma;

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
        JLabel label1 = new JLabel("Welcome. Please enter your username:");
        pane1.add(label1);
        pane1.add(textField1);
        JButton another = new JButton("log in");
        another.setBounds(120, 85, 100, 50);
        contentPane.add(another);
        another.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String na = textField1.getText();
                g = new GameManager(na); //create the gamemanager which will generate habitats
                dispose();
                ma = new marche(g.getHabitatsMaps()); // create the marche with the habitats' references
                ma.setVisible(true);
            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFramelogin startWindow = new JFramelogin();
        while (startWindow.ma == null) ; // wait for the gamemanager to be initialized
        while (!startWindow.ma.isActive())
            ; //make sure the component is initialized in order to avoid aborting the program on main loop

        startWindow.g.createCharacter();

        // MAIN LOOP CALL
        while (startWindow.g.getPopulation() > 0 && startWindow.ma.isActive()) {
            startWindow.g.loop();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (startWindow.g.getPopulation() > 0) {
            System.out.println("Programme interrompu par l'utilisateur");
        } else {
            System.out.println(" -- Tous les personnages sont morts : Fin de la simulation --");
        }

    }
}
