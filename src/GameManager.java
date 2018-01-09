import java.util.ArrayList;

public class GameManager implements CharacterManager, UserInteractionManager {
    private String playername;
    private ArrayList<Character> characters = new ArrayList<>(); // population limit
    private habitatmap[] habitatsList = new habitatmap[5];
    int nbr;

    public GameManager(String p) {
        playername = p;
        nbr = 0;
        habitatsList[0] = new habitatmap(0, characters);
        habitatsList[1] = new habitatmap(1, characters);
        habitatsList[2] = new habitatmap(2, characters);
        habitatsList[3] = new habitatmap(3, characters);
        habitatsList[4] = new habitatmap(4, characters);
    }

    public void updateLocalCharacters(habitatmap h){
        h.localCharacters = getCharacterByHabitat(h.ha);
    }

    public void updateAllLocalCharacters(){
       for (habitatmap habitat_map:habitatsList){
            updateLocalCharacters(habitat_map);
            habitat_map.updateGraphics();
        }
        //UPDATE GRAPHIC HABITAT

    }

    /* //UNUSED
	public void createNewWorld(String p) {
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("sky",75,25,50,25);
		habitat[1]=new Habitat("earth",50,50,50,50);
		habitat[2]=new Habitat("beach",20,60,60,60);
		habitat[3]=new Habitat("mountain",30,60,30,60);
		habitat[4]=new Habitat("see",50,50,50,50);
	}
	*/

    public void loop() {
        System.out.println("\n\n << Generating events for " + characters.size() + " characters >>");
        int i = 0;
        for (i = 0; i < 5; i++) {
            generateEvents(habitatsList[i].ha); //ha = habitat of the habitatmap
        }

        i = 0;
        for (i = 0; i < characters.size(); i++) {
            characters.get(i).move();
            generateEvents(characters.get(i));
        }
    }

    public void generateEvents(Character c) {
        int t = (int) (Math.random() * 100 + (habitatsList[c.getHabitat()].ha.getTemp() - c.getTemp()));

        if (t < 15) {
            c.die();
            characters.remove(c);
            System.out.println("(!) Un " + c.getSp().toString() + " est mort dans " + habitatsList[c.getHabitat()].ha.getName());
        } else if (t > 85) {
            c.die();
        } else if (t < 30) {
            // MVC "Un <espece> est mort de froid"
        } else if (t > 70) {
            //MVC "Un <espece> est mort de chaud"
        }
        int h = (int) (Math.random() * 100 + (habitatsList[c.getHabitat()].ha.getHumidity() - c.getHumidity()));

        if (h < 20) {
            c.die();
        } else if (h > 80) {
            c.die();
        } else if (h < 30) {
            // MVC "Un >espece> s'est déshydraté"
        } else if (h > 70) {
            //MVC "Un <espece> s'est noyé"
        }
        int s = (int) (Math.random() * 100 + (habitatsList[c.getHabitat()].ha.getSleep() - c.getSleep()));

        if (s < 20) {
            c.die();
        } else if (s > 80) {
            c.die();
        } else if (s < 30) {
            // MVC "Un <espece> est mort de fatigue"
        } else if (s > 70) {
            //MVC "Un <espece> est mort dans son sommeil"
        }
        int e = (int) (Math.random() * 100 + (habitatsList[c.getHabitat()].ha.getEnergy() - c.getEnergy()));

        if (e < 20) {
            c.die();
        } else if (e > 80) {
            c.die();
        } else if (e < 30) {
            // MVC "Un <espece> est mort de faim"
        } else if (e > 70) {
            //MVC "Un <espece> a fait une indigestion"
        }
    }

    public void generateEvents(Habitat h) {
        int i = (int) (Math.random() * 21);
        switch (i) {
            case 0:
                if ((h.getTemp() + 20) > 100) {
                    h.setTemp(100);
                } else {
                    h.setTemp(h.getTemp() + 20);
                }
                System.out.println("les radiateurs de " + h.getName() + " sont cassés");
                break;
            case 1:
                if ((h.getTemp() - 20) < 0) {
                    h.setTemp(0);
                } else {
                    h.setTemp(h.getTemp() - 20);
                }
                System.out.println("un feu s'est déclaré dans " + h.getName());
                break;
            case 2:
                if ((h.getHumidity() + 20) > 100) {
                    h.setHumidity(100);
                } else {
                    h.setHumidity(h.getHumidity() + 20);
                }
                System.out.println("les canalisations sont bouchés, l'eau n'arrive plus à " + h.getName());
                break;
            case 3:
                if ((h.getHumidity() - 20) < 0) {
                    h.setHumidity(0);
                } else {
                    h.setHumidity(h.getHumidity() - 20);
                }
                System.out.println("une innondation s'est déclaré dans " + h.getName());
                break;
            case 4:
                if ((h.getSleep() + 20) > 100) {
                    h.setSleep(100);
                } else {
                    h.setSleep(h.getSleep() + 20);
                }
                System.out.println("la lumiere de " + h.getName() + " est cassé, personne ne se réveille");
                break;
            case 5:
                if ((h.getSleep() - 20) < 0) {
                    h.setSleep(0);
                } else {
                    h.setSleep(h.getSleep() - 20);
                }
                System.out.println("les lumières de " + h.getName() + " ne s'éteignent plus, impossible de dormir");
                break;
            case 6:
                if ((h.getEnergy() + 20) > 100) {
                    h.setEnergy(100);
                } else {
                    h.setEnergy(h.getEnergy() + 20);
                }
                System.out.println("on meurt de faim dans " + h.getName());
                break;
            case 7:
                if ((h.getEnergy() - 20) < 0) {
                    h.setEnergy(0);
                } else {
                    h.setEnergy(h.getEnergy() - 20);
                }
                System.out.println("trop de nourriture arrive à " + h.getName() + ", c'est du gaspillage");
                break;
            default:
                // no events
                break;
        }
    }

    public void move() {
    }

    public habitatmap[] getHabitatsMaps() {
        return habitatsList;
    }

    ;

    public void changeTemp(int h, int temp) {
        habitatsList[h].ha.setTemp(temp);
    }

    public void changeHumidity(int h, int humidity) {
        habitatsList[h].ha.setHumidity(humidity);
    }

    public void changeSleep(int h, int sleep) {
        habitatsList[h].ha.setSleep(sleep);
    }

    public void changeEnergy(int h, int energy) {
        habitatsList[h].ha.setEnergy(energy);
    }

    public Character[] getCharacterBySpecies(Species spe) {
        ArrayList<Character> out = new ArrayList<Character>();
        for (Character chara : characters) {
            if (chara.getSp() == spe) {
                out.add(chara);
            }
        }
        return out.toArray(new Character[]{});
    }

    /* //OBSOLETE
    public Character[] getCharacterByHabitat(Habitat h) {
        ArrayList<Character> out = new ArrayList<Character>();
        for (Character chara : characters) {
            if (chara.getHabitat() == h.getId()) {
                out.add(chara);
            }
        }
        return out.toArray(new Character[]{});
    }*/

    public ArrayList<Character> getCharacterByHabitat(Habitat h) {
        ArrayList<Character> out = new ArrayList<Character>();
        for (Character chara : characters) {
            if (chara.getHabitat() == h.getId()) {
                out.add(chara);
            }
        }
        return out;
    }

    public void createCharacter() {
        for(int i=0; i<20; i++){
            characters.add(new Character());
        }
    }

    public int getPopulation() {
        return characters.size();
    }
}