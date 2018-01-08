public class GameManager implements CharacterManager,UserInteractionManager,EventsManager{
	private String playername;
	private Character[] characters;
	private Habitat[] habitat=new Habitat[5];
	int nbr;
	
	public GameManager(String p){
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("river",0,0);
		habitat[1]=new Habitat("glaceland",0,0);
		habitat[2]=new Habitat("desert",0,0);
		habitat[3]=new Habitat("forest",0,0);
		habitat[4]=new Habitat("beach",0,0);
	}
	public void createNewWorld(String p) {
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("river",0,0);
		habitat[1]=new Habitat("glaceland",0,0);
		habitat[2]=new Habitat("desert",0,0);
		habitat[3]=new Habitat("forest",0,0);
		habitat[4]=new Habitat("beach",0,0);
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
                Character c = new Character(50,50,50,50,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
       			habitat[h].addchar(c);
       			characters[nbr]=c;
       			nbr++;
       			break;
			case centaure:
                Character f = new Character(25,75,75,75,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
       			habitat[h].addchar(f);
       			characters[nbr]=f;
       			nbr++;
       			break;
			case mermaid:
                Character sh = new Character(25,75,25,50,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
              	habitat[h].addchar(sh);
              	characters[nbr]=sh;
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
	//@Override
	public void addCharacter(Species s, int h) {
		// TODO Auto-generated method stub
		
	}
}