package lo43;

public class GameManager implements CharacterManager,UserInteractionManager,EventsManager{
	private String playername;
	private Character[] characters;
	private Habitat[] habitat;
	int nbr;
	
	public GameManager(String p){
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("beach",0,0);
		habitat[1]=new Habitat("glaceland",0,0);
		habitat[2]=new Habitat("desert",0,0);
		habitat[3]=new Habitat("forest",0,0);
		habitat[4]=new Habitat("river",0,0);
	}
	public void createNewWorld(String p) {
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("beach",0,0);
		habitat[1]=new Habitat("glaceland",0,0);
		habitat[2]=new Habitat("desert",0,0);
		habitat[3]=new Habitat("forest",0,0);
		habitat[4]=new Habitat("river",0,0);
	}
	public void populate() {}
	public void loop() {}
	public void generateEvents() {}
	public void move() {}
	public void addCharacter(Species s,int h,String na) {
		switch(expression){
                   case dog:
				Character c=new(0,0,0,na,s,h); /*前三个温度，湿度，寿命*/
				habitat[h].addchar(c);
				characters[nbr]=c;
				nbr++;
				break;
		}
	}
	public void changeTemp(int h, int temp) {
		habitat[h].settemp(temp);
	}
	public void changeHumidity(int h, int humidity) {
		habitat[h].sethumidity(humidity);
	}
	public void changeTemp() {}
	public void changeHumidity() {}
	public void generateEvents(Character[] c) {}
	public void getCharacterBySpecies(Species spe) {}
	public void getCharacterByHabitats(Habitat h) {}

}
