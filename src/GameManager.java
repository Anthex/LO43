public class GameManager implements CharacterManager,UserInteractionManager,EventsManager{
	private String playername;
	private Character[] characters;
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

	public void populate() {}

	public void loop() {}

	public void generateEvents() {}

	public void move() {}

	public void addCharacter(Species s,int h,String na) {
		Species expression = Species.angel;
		switch(expression){
			case angel:
                Character d = new Character(75,25,50,25,na,s,h);
				habitat[h].addchar(d);
				characters[nbr]=d;
				nbr++;
				break;
			case human:
                Character c = new Character(50,50,50,50,na,s,h);
       			habitat[h].addchar(c);
       			characters[nbr]=c;
       			nbr++;
       			break;
			case centaure:
                Character f = new Character(25,75,75,75,na,s,h);
       			habitat[h].addchar(f);
       			characters[nbr]=f;
       			nbr++;
       			break;
			case mermaid:
                Character sh = new Character(25,75,25,50,na,s,h);
              	habitat[h].addchar(sh);
              	characters[nbr]=sh;
              	nbr++;
              	break;
		}
	}
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

	public void addCharacter(Species s, int h) {
		
	}
}