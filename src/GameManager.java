public class GameManager implements CharacterManager,UserInteractionManager {
	private String playername;
	private Character[] characters=new Character[100];
	private Habitat[] habitat=new Habitat[5];
	int nbr;
	
	public GameManager(String p){
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("sky",75,25,50,25);
		habitat[1]=new Habitat("earth",50,50,50,50);
		habitat[2]=new Habitat("beach",20,60,60,60);
		habitat[3]=new Habitat("mountain",30,60,30,60);
		habitat[4]=new Habitat("see",50,50,50,50);
	}
	public void createNewWorld(String p) {
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("sky",75,25,50,25);
		habitat[1]=new Habitat("earth",50,50,50,50);
		habitat[2]=new Habitat("beach",20,60,60,60);
		habitat[3]=new Habitat("mountain",30,60,30,60);
		habitat[4]=new Habitat("see",50,50,50,50);
	}

	public void loop() {}

	public void generateEvents() {}

	public void move() {}

	public void changeTemp(int h, int temp) {
		habitat[h].setTemp(temp);
	}

	public void changeHumidity(int h, int humidity) { habitat[h].setHumidity(humidity); }

	public void changeSleep(int h, int sleep) { habitat[h].setSleep(sleep); }

	public void changeEnergy(int h, int energy) { habitat[h].setEnergy(energy); }

	public void changeTemp() {}

	public void changeHumidity() {}

	public void changeSleep() {}

	public void changeEnergy() {}

	public void generateEvents(Character[] c) {}

	public void getCharacterBySpecies(Species spe) {}

	public void getCharacterByHabitats(Habitat h) {}

}