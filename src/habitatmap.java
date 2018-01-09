import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class habitatmap extends JFrame {
    Habitat ha;
    JButton jb0, jb1, jb2, jb3;
    JLabel lab;
    Icon icon;
    ImageIcon human;
    ImageIcon centaur;
    ImageIcon angel;
    ImageIcon mermaid;
    ArrayList<JLabel> sprites;
    ArrayList<Character> localCharacters;
    ArrayList<Character> globalCharactersReference; //used to add new characters
    public habitatmap(int h,  ArrayList<Character> refToCharacters) {
        human = new ImageIcon(getClass().getResource("assets/char/human.png"));
        centaur = new ImageIcon(getClass().getResource("assets/char/centaur.png"));
        angel = new ImageIcon(getClass().getResource("assets/char/angel.png"));
        mermaid = new ImageIcon(getClass().getResource("assets/char/mermaid.png"));
        localCharacters = new ArrayList<>();
        sprites = new ArrayList<>();
        String picPath = null;
        ha = new Habitat(h);
        switch (h) {
            case 0:
                picPath = "assets/sky.jpg";
                break;
            case 1:
                picPath = "assets/glassground.jpg";
                break;
            case 2:
                picPath = "assets/beach.jpg";
                break;
            case 3:
                picPath = "assets/forest.jpg";
                break;
            case 4:
                picPath = "assets/sea.jpg";
                break;
        }
        this.setTitle("World");

        icon = new ImageIcon(getClass().getResource(picPath));



        lab = new JLabel(icon, JLabel.CENTER);
        lab.setBounds(0,0,900,510);
        this.add(lab);
        Dimension d = new Dimension();
        d.setSize(900, 510);
        this.setSize(d);
        Point p = new Point();
        p.setLocation(280, 180);
        this.setLocation(p);
        jb0 = new JButton("add " + ha.sep(0));
        jb0.setBounds(50, 100, 100, 40);
        lab.add(jb0);

	/* Action listener to add new characters on button click*/
        jb0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Character c = new Character(ha.sep(0), ha.getId());
                refToCharacters.add(c);
                System.out.println("Added a " + ha.sep(0).toString() + " in " + ha.getName());
            }
        });

         jb1 = new JButton("add " + ha.sep(1));
        jb1.setBounds(50, 150, 100, 40);
        lab.add(jb1);
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Character c = new Character(ha.sep(1), ha.getId());
                refToCharacters.add(c);
                System.out.println("Added a " + ha.sep(1).toString() + " in " + ha.getName());
            }
        });

         jb2 = new JButton("delete " + ha.sep(0));
        jb2.setBounds(50, 200, 100, 40);
        lab.add(jb2);
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index=0;
                while(refToCharacters.get(index).getHabitat() != h && refToCharacters.get(index).getSp()!=ha.sep(0) && refToCharacters.size()>index+1){
                    index++;
                }
                if(refToCharacters.size()>index+1){
                    System.out.println("Removed a " + ha.sep(0).toString() + " in " + ha.getName());
                    refToCharacters.remove(index);
                }else{
                    System.out.println("Il semblerait qu'il n'y ait plus de " + ha.sep(0).toString() + " dans " + ha.getName());
                }

            }
        });

         jb3 = new JButton("delete " + ha.sep(1));
        jb3.setBounds(50, 250, 100, 40);
        lab.add(jb3);
        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index=0;
                while(refToCharacters.get(index).getHabitat() != h && refToCharacters.get(index).getSp()!=ha.sep(1) && refToCharacters.size()>index+1){
                    index++;
                }
                if(refToCharacters.size()>index+1){
                    System.out.println("Removed a " + ha.sep(1).toString() + " in " + ha.getName());
                    refToCharacters.remove(index);
                }else{
                    System.out.println("Il semblerait qu'il n'y ait plus de " + ha.sep(1).toString() + " dans " + ha.getName());
                }
            }
        });

    }


    public void updateGraphics(){

        JPanel panel = (JPanel) this.getContentPane();
        panel.setBounds(0, 0, 900, 510);
        panel.setBackground(new Color(0,0,0,0));
        panel.setLayout(null);

        //Clear sprites
        for (JLabel current:sprites){
            this.remove(current);
            current = new JLabel();
        }
        sprites.clear();
        for(Character localChar:localCharacters) {
            if (localChar.isAlive()) {
                JLabel character = null;
                Species expression = localChar.getSp();
                switch (expression) {
                    case human:
                        character = new JLabel(human);
                        break;
                    case angel:
                        character = new JLabel(angel);
                        break;
                    case centaur:
                        character = new JLabel(centaur);
                        break;
                    case mermaid:
                        character = new JLabel(mermaid);
                        break;
                }
                this.add(character);
                sprites.add(character);
                Dimension size = character.getPreferredSize();
                character.setBounds(0, 0, size.width, size.height);
                character.setLocation(localChar.getX(), localChar.getY());
            }
        }
        this.add(lab);
        this.validate();
    }
}
