public class Habitat {
    private String name;
    private int temp;
    private int humidity;
    private int sleep;
    private int energy;
    private int nbr;
    private int id;
    private Species[] se = new Species[2];

    public Habitat(String n, int t, int h, int s, int e) {
        nbr = 0;
        name = n;
        temp = t;
        humidity = h;
        sleep = s;
        energy = e;

    }

    public Habitat(int h) {
        id = h;
        nbr = 0;
        switch (h) {
            case 0:
                name = "sky";
                se[0] = Species.angel;
                se[1] = Species.human;
                temp = 80;
                humidity = 30;
                sleep = 60;
                energy = 30;
                break;
            case 1:
                name = "earth";
                se[0] = Species.human;
                se[1] = Species.centaur;
                temp = 50;
                humidity = 50;
                sleep = 50;
                energy = 50;
                break;
            case 2:
                name = "beach";
                se[0] = Species.centaur;
                se[1] = Species.mermaid;
                temp = 20;
                humidity = 60;
                sleep = 60;
                energy = 60;
                break;
            case 3:
                name = "mountain";
                se[0] = Species.centaur;
                se[1] = Species.angel;
                temp = 30;
                humidity = 60;
                sleep = 30;
                energy = 60;
                break;
            case 4:
                name = "sea";
                se[0] = Species.mermaid;
                se[1] = Species.human;
                temp = 50;
                humidity = 50;
                sleep = 50;
                energy = 50;
                break;

        }
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getSleep() {
        return sleep;
    }

    public int getEnergy() {
        return energy;
    }

    public void setTemp(int t) {
        temp = t;
    }

    public void setHumidity(int h) {
        humidity = h;
    }

    public void setSleep(int s) {
        sleep = s;
    }

    public String getName() {
        return this.name;
    }

    public void setEnergy(int e) {
        energy = e;
    }

    public int getNbr() {
        return nbr;
    }

    public int getId() {
        return id;
    }

    public void renew(Habitat h) {
        name = h.name;
        nbr = h.nbr;
    }

    public Species sep(int i) {
        return se[i];
    }

    public void setSp(int i, Species s) {
        se[i] = s;
    }

}
