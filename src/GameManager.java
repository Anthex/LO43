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
		Species expression = Species.dog;
		switch(expression){
                   case dog:
                Character d = new Character(30,10,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
				habitat[h].addchar(d);
				characters[nbr]=d;
				nbr++;
				break;
                   case cat:
                Character c = new Character(30,10,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
       			habitat[h].addchar(c);
       			characters[nbr]=c;
       			nbr++;
       			break;
                   case fish:
                Character f = new Character(10,80,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
       			habitat[h].addchar(f);
       			characters[nbr]=f;
       			nbr++;
       			break;
                   case shell:
                Character sh = new Character(10,80,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
              	habitat[h].addchar(sh);
              	characters[nbr]=sh;
              	nbr++;
              	break;
                   case starfish:
                Character st = new Character(10,80,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
                habitat[h].addchar(st);
                characters[nbr]=st;
                nbr++;
                break;
                   case turtle:
                Character tu = new Character(10,80,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
                habitat[h].addchar(tu);
                characters[nbr]=tu;
                nbr++;
                break;
                   case lion:
                Character li = new Character(20,10,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
                habitat[h].addchar(li);
                characters[nbr]=li;
                nbr++;
                break;
                   case tiger:
                Character ti = new Character(20,10,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
                habitat[h].addchar(ti);
                characters[nbr]=ti;
                nbr++;
                break;
                   case camel:
                Character ca = new Character(40,5,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
                habitat[h].addchar(ca);
                characters[nbr]=ca;
                nbr++;
                break;
                   case snake:
                Character sn = new Character(40,5,0,na,s,h); /*ǰ�����¶ȣ�ʪ�ȣ�����*/
                habitat[h].addchar(sn);
                characters[nbr]=sn;
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