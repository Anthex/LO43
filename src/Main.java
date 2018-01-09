public class Main {
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
